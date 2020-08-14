package com.marksandspencer.test;

import com.marksandspencer.search.model.Product;
import com.marksandspencer.search.modelex.ProductEx;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.Writer;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ProductSerializationTest implements Runnable{

  private static Logger LOGGER = LoggerFactory.getLogger(ProductSerializationTest.class);

  private Marshaller marshaller;
  private Marshaller marshallerEx;

  public ProductSerializationTest() throws JAXBException {

    marshaller = JAXBContext.newInstance(Product.class).createMarshaller();
    marshallerEx = JAXBContext.newInstance(ProductEx.class).createMarshaller();

  }

  public void run() {
    try {
      LOGGER.info("Test starts");

      // The plan is to replace the existing Product class which has multiple member variable
      // with an implementation which has a Map of attributes, so attributes can be added without
      // requiring changes to the code.

      // Create a traditional Product
      Product p = new Product();

      p.setProductExternalId("P1234");
      p.setBabySize("babySize");

      // Create a modern Product
      ProductEx pEx = new ProductEx();
      pEx.setNotAConfigurableValue("Not configured");
      pEx.set("pid","P1234");
      pEx.set("babySize","babySize");

      // convert the products to xml

      LOGGER.info("xml traditional : {}", createXml(p));
      LOGGER.info("xml extended : {}", createXmlEx(pEx));



    }catch(Exception ex){
      LOGGER.error("exception : {}",ex);
    }

    LOGGER.info("Test ends");
  }

  private String createXml(Product p) throws JAXBException {
    Writer writer = new StringWriter();
    marshaller.marshal(p,writer);
    return writer.toString();
  }

  private String createXmlEx(ProductEx pex) throws JAXBException {
    Writer writer = new StringWriter();
    marshallerEx.marshal(pex,writer);
    return writer.toString();
  }

}
