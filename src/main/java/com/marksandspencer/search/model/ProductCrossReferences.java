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
public class ProductCrossReferences {

	@JsonProperty("ProductExternalID")
	private String productExternalID;
	private String productID;
	private String isServiceValid;
	private String type;
	@JsonProperty("OutfitProductColour")
	private String outfitProductColour;
	@JsonProperty("SequenceNumberwithInProductReference")
	private String sequenceNumberwithInProductReference;

	public String getSequenceNumberwithInProductReference() {
		return sequenceNumberwithInProductReference;
	}

	public void setSequenceNumberwithInProductReference(String sequenceNumberwithInProductReference) {
		this.sequenceNumberwithInProductReference = sequenceNumberwithInProductReference;
	}

	public String getProductExternalID() {
		return productExternalID;
	}
	public void setProductExternalID(String productExternalID) {
		this.productExternalID = productExternalID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getIsServiceValid() {
		return isServiceValid;
	}
	public void setIsServiceValid(String isServiceValid) {
		this.isServiceValid = isServiceValid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOutfitProductColour() {
		return outfitProductColour;
	}
	public void setOutfitProductColour(String outfitProductColour) {
		this.outfitProductColour = outfitProductColour;
	}

}
