package com.marksandspencer.search.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "skus")
@NoArgsConstructor
public class Skus {

	List<Sku> sku=new ArrayList<>();

	public List<Sku> getSku() {
		return sku;
	}
	@XmlElement(name = "sku")
	public void setSku(List<Sku> sku) {
		this.sku = sku;
	}

}
