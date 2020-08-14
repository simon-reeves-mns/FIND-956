package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductLoyaltyPromotion {

	@JsonProperty("loyaltyPromoCode")
	private String loyaltyPromoCode;


	public String getLoyaltyPromoCode() {
		return loyaltyPromoCode;
	}

	public void setLoyaltyPromoCode(String loyaltyPromoCode) {
		this.loyaltyPromoCode = loyaltyPromoCode;
	}
	
}
