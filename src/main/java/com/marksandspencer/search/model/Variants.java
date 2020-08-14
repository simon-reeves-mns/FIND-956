package com.marksandspencer.search.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.NoArgsConstructor;

@XmlRootElement(name = "variants")
@NoArgsConstructor
public class Variants {

	
	private String displayAllColoursInStock;
	
	private Skus skus;

	public Skus getSkus() {
		return skus;
	}

	@XmlElement(name = "skus")
	public void setSkus(Skus skus) {
		this.skus = skus;
	}

	public String getDisplayAllColoursInStock() {
		return displayAllColoursInStock;
	}
	@XmlElement(name = "displayAllColoursInStock")
	public void setDisplayAllColoursInStock(String displayAllColoursInStock) {
		this.displayAllColoursInStock = displayAllColoursInStock;
	}

	
	
}
