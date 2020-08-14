package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BundlePrice {

	@JsonProperty("skuPrice")
	private String skuPrice;
	
	@JsonProperty("unitPrice")
	private String unitPrice;
	
	@JsonProperty("minimumPrice")
	private String minimumPrice;
	
	@JsonProperty("maximumPrice")
	private String maximumPrice;
	
	@JsonProperty("previousPrice")
	private String previousPrice;
	
	@JsonProperty("statusCode")
	private String statusCode;	

    public String getSkuPrice() {
		return skuPrice;
	}
	
	public void setmaximumPrice(String maximumPrice) {
		this.maximumPrice = maximumPrice;
	}
	
	public String getmaximumPrice() {
		return maximumPrice;
	}
	
	public void setminimumPrice(String minimumPrice) {
		this.minimumPrice = minimumPrice;
	}
	
	public String getminimumPrice() {
		return minimumPrice;
	}
	
	public void setpreviousPrice(String previousPrice) {
		this.previousPrice = previousPrice;
	}
	
	public String getpreviousPrice() {
		return previousPrice;
	}
    
	
	public void setSkuPrice(String skuPrice) {
		this.skuPrice = skuPrice;
	}

    public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	
	public void setunitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public String getunitPrice() {
		return unitPrice;
	}

}
