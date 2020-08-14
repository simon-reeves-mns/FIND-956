package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Skuchildren {
	private List<AssetCrossReferences> assetCrossReferences;

	private String strokeId;
	private String stockIndicator;
	private Price price;
	private String name;
	private Integer stockQuantity;
	private Attributes attributes;

	private String skuInStock;

	private String id;
	private String productType;
	private String colourSwatch;

	private String productColorCountLive;

	private String colorCountLiveInStock;

	private String productAvailability;
	
	private String modelViewImage;
	
	private String productViewImage;
	
	
	
	public String getModelViewImage() {
		return modelViewImage;
	}


	public void setModelViewImage(String modelViewImage) {
		this.modelViewImage = modelViewImage;
	}
	
	public String getProductViewImage() {
		return productViewImage;
	}


	public void setProductViewImage(String productViewImage) {
		this.productViewImage = productViewImage;
	}


	public String getProductAvailability() {
		return productAvailability;
	}

	public void setProductAvailability(String productAvailability) {
		this.productAvailability = productAvailability;
	}

	public String getColorCountLiveInStock() {
		return colorCountLiveInStock;
	}

	public void setColorCountLiveInStock(String colorCountLiveInStock) {
		this.colorCountLiveInStock = colorCountLiveInStock;
	}

	public String getColourSwatch() {
		return colourSwatch;
	}

	public void setColourSwatch(String colourSwatch) {
		this.colourSwatch = colourSwatch;
	}

	public String getSkuInStock() {
		return skuInStock;
	}

	public void setSkuInStock(String skuInStock) {
		this.skuInStock = skuInStock;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getStrokeId() {
		return strokeId;
	}

	public List<AssetCrossReferences> getAssetCrossReferences() {
		return assetCrossReferences;
	}

	public void setAssetCrossReferences(List<AssetCrossReferences> assetCrossReferences) {
		this.assetCrossReferences = assetCrossReferences;
	}

	public void setStrokeId(String strokeId) {
		this.strokeId = strokeId;
	}

	public String getStockIndicator() {
		return stockIndicator;
	}

	public void setStockIndicator(String stockIndicator) {
		this.stockIndicator = stockIndicator;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Integer stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductColorCountLive() {
		return productColorCountLive;
	}

	public void setProductColorCountLive(String productColorCountLive) {
		this.productColorCountLive = productColorCountLive;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	/**
	 * return true if this sku has a valid price
	 * @return
	 */
	public boolean hasValidSkuPrice(){
		if ( this.getPrice() == null){
			return false;
		}
		if ( this.getPrice().getSkuPrice() == null){
			return false;
		}

		// existing check in IEDataUtil is checking for skuPrice and minumumPrice, so duplicating here

		if ( !this.getPrice().getSkuPrice().isEmpty()){
			return true;
		}
		// is there a minimum price instead
		if (this.getPrice().getMinimumPrice() == null) {
			return false;
		}
		if (this.getPrice().getMinimumPrice().isEmpty()) {
			return false;
		}

		return true;
	}
}
