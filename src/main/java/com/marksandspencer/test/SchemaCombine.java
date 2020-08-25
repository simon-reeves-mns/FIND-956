package com.marksandspencer.test;

import java.io.File;
import java.io.IOException;
import javax.xml.XMLConstants;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

@Component
public class SchemaCombine implements Runnable, ErrorHandler {

  private static Logger LOGGER = LoggerFactory.getLogger(SchemaCombine.class);

  private final String xsdCode;
  private final String xsdConfig;
  private final String fileToValidate;
  private final String xsdParent;

  public SchemaCombine(
      @Value("${xsd.code}")
          String xsdCode,
      @Value("${xsd.config}")
          String xsdConfig,
      @Value("${xsd.parent}")
        String xsdParent,
      @Value("${xsd.filetovalidate}")
          String fileToValidate) {
    this.xsdCode = xsdCode;
    this.xsdConfig = xsdConfig;
    this.fileToValidate = fileToValidate;
    this.xsdParent = xsdParent;
  }

  @Override
  public void run() {

    LOGGER.info("SchemaCombine starts");

    try {
      Source codeSource = new StreamSource(xsdCode);
      Source configSource = new StreamSource(xsdConfig);
      Source parentSource = new StreamSource(xsdParent);

      SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

      //Schema configSchema = factory.newSchema(configSource);
      //Schema codeSchema = factory.newSchema(codeSource);

      Schema parentSchema = factory.newSchema(parentSource);

      Schema combinedSchema = factory.newSchema(new Source[]{configSource,codeSource});


      //Validator configValidator = configSchema.newValidator();
      //Validator codeValidator = codeSchema.newValidator();
      Validator validator = combinedSchema.newValidator();
      Validator parentValidator = parentSchema.newValidator();

      parentValidator.setErrorHandler(this);

      parentValidator.validate(new StreamSource(new File(fileToValidate)));
    } catch (SAXException | IOException e){
      LOGGER.error("exception : ",e);
    }

    LOGGER.info("SchemaCombine ends");

  }

  @Override
  public void warning(SAXParseException e) throws SAXException {
    LOGGER.warn("validator warning : ",e);
  }

  @Override
  public void error(SAXParseException e) throws SAXException {
    LOGGER.error("validator error : ",e);
  }

  @Override
  public void fatalError(SAXParseException e) throws SAXException {
    LOGGER.error("validator fatal error : ",e);
  }
}
