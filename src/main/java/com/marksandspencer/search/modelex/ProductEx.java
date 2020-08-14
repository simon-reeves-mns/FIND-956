package com.marksandspencer.search.modelex;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.namespace.QName;

@XmlRootElement(name = "product")
public class ProductEx {


  @XmlTransient
  public
  Map<String, String> values;
  private String notAConfigurableValue;

  public ProductEx() {
    values = new HashMap<>();
  }

  public String getNotAConfigurableValue() {
    return notAConfigurableValue;
  }

  public void setNotAConfigurableValue(String notAConfigurableValue) {
    this.notAConfigurableValue = notAConfigurableValue;
  }

  public void set(String key, String value) {
    values.put(key, value);
  }

  @XmlAnyElement
  public List<JAXBElement<String>> getMapContents() {

    List<JAXBElement<String>> elements = new ArrayList<>();
    for (Map.Entry<String, String> entry : values.entrySet()) {
      elements.add(new JAXBElement<>(new QName(entry.getKey()), String.class, entry.getValue()));
    }
    return elements;
  }

}
