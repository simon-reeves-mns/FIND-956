package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class Promotion {
	
	@JsonProperty("ProductLoyaltyPromotion")
	private List<ProductLoyaltyPromotion> productLoyaltyPromotion;
	
	@JsonProperty("ProductLevelPromotion")
	private List<ProductLevelPromotion> productLevelPromotion;
	
	private String productPriceFrom;
	
	private String productPriceTo;
	
	private String offerflag;
	
	@JsonProperty("originalprice")
	private String originalprice;
	
	private Integer productPriceMessageFlag;
	
	@JsonProperty("promodescription")
	private String promodescription;
	
	@JsonProperty("productPriceperunit")
	private String priceperunit;
	
	@JsonProperty("promopricefrom")
	private String promoPriceFrom ;
	
	@JsonProperty("promopriceto")
	private String promoPriceTo ;
	
	
    private String statusCode;

	
	
	public String getPromoDescription() {
		return promodescription;
	}

	public void setPromoDescription(String promodescription) {
		this.promodescription = promodescription;
	}


	/*
	 * public Integer getOriginalprice() { return originalprice; }
	 * 
	 * public void setOriginalprice(Integer originalprice) { this.originalprice =
	 * originalprice; }
	 */
	
	public String getPromoPriceFrom() {
		return promoPriceFrom;
	}

	public void setPromoPriceFrom(String promoPriceFrom) {
		this.promoPriceFrom = promoPriceFrom;
	}
	
	public String getPromoPriceTo() {
		return promoPriceTo;
	}

	public void setPromoPriceTo(String promoPriceTo) {
		this.promoPriceTo = promoPriceTo;
	}

	

	public Integer getProductPriceMessageFlag() {
		return productPriceMessageFlag;
	}

	public String getProductPriceFrom() {
		return productPriceFrom;
	}

	public void setProductPriceFrom(String productPriceFrom) {
		this.productPriceFrom = productPriceFrom;
	}

	public String getProductPriceTo() {
		return productPriceTo;
	}

	public void setProductPriceTo(String productPriceTo) {
		this.productPriceTo = productPriceTo;
	}

	public void setProductPriceMessageFlag(Integer productPriceMessageFlag) {
		this.productPriceMessageFlag = productPriceMessageFlag;
	}
	
	

	public String getOriginalprice() {
		return originalprice;
	}

	public void setOriginalprice(String originalprice) {
		this.originalprice = originalprice;
	}

	public String getPriceperunit() {
		return priceperunit;
	}

	public void setPriceperunit(String priceperunit) {
		this.priceperunit = priceperunit;
	}
	
	public String getOfferflag() {
		return offerflag;
	}

	public void setOfferflag(String offerflag) {
		this.offerflag = offerflag;
	}


	public List<ProductLevelPromotion> getProductLevelPromotion() {
		return productLevelPromotion;
	}
	@JsonProperty("ProductLevelPromotion") 
	public void setProductLevelPromotion(List<ProductLevelPromotion> productLevelPromotion) {
		this.productLevelPromotion = productLevelPromotion;
	}
	
	public List<ProductLoyaltyPromotion> getProductLoyaltyPromotion() {
		return productLoyaltyPromotion;
	}
	@JsonProperty("ProductLoyaltyPromotion")
	public void setProductLoyaltyPromotion(List<ProductLoyaltyPromotion> productLoyaltyPromotion) {
		this.productLoyaltyPromotion = productLoyaltyPromotion;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	
	
}
