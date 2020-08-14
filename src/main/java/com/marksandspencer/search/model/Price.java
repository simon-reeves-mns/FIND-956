package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Price {
	private String currencyPrefix;
	
	@JsonProperty("skuPrice")
	private String skuPrice;
	private String currencyCode;
	
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

	public String getCurrencyPrefix() {
		return currencyPrefix;
	}

	public void setCurrencyPrefix(String currencyPrefix) {
		this.currencyPrefix = currencyPrefix;
	}

	public String getSkuPrice() {
		return skuPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setMaximumPrice(String maximumPrice) {
		this.maximumPrice = maximumPrice;
	}

	public String getMaximumPrice() {
		return maximumPrice;
	}

	public void setMinimumPrice(String minimumPrice) {
		this.minimumPrice = minimumPrice;
	}

	public String getMinimumPrice() {
		return minimumPrice;
	}

	public void setPreviousPrice(String previousPrice) {
		this.previousPrice = previousPrice;
	}

	public String getPreviousPrice() {
		return previousPrice;
	}

	public void setSkuPrice(String skuPrice) {
		this.skuPrice = skuPrice;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	
	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
