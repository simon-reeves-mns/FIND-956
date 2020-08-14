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
public class Children implements IdAware, StockAware {
	private List<AssetCrossReferences> assetCrossReferences;
	private String strokeId;
	private List<Skuchildren> skuchildren;
	private String name;
	private Attributes attributes;
	private String id;
	private String productType;
	private Price price;
	private String stockIndicator;
	private String modelViewImage;	
	private String productViewImage;
	private Navigation navigation;
	private WineLabel winelabel;
	@JsonProperty("new")
	private String newIndicator;
	private Promotion promotion;
	private Review review;
	public Promotion getpromotion() {
		return promotion;
	}

	public void setpromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public String getnew() {
		return newIndicator;
	}

	public void setnew(String newIndicator) {
		this.newIndicator = newIndicator;
	}

	public String getStockIndicator() {
		return stockIndicator;
	}

	public void setStockIndicator(String stockIndicator) {
		this.stockIndicator = stockIndicator;
	}

	public Price getPrice() {
		return price;
	}

	public void setPrice(Price price) {
		this.price = price;
	}

	public Navigation getNavigation() {
		return navigation;
	}

	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

	public WineLabel getwinelabel() {
		return winelabel;
	}

	public void setwinelabel(WineLabel winelabel) {
		this.winelabel = winelabel;
	}
	public List<AssetCrossReferences> getAssetCrossReferences() {
		return assetCrossReferences;
	}
	public void setAssetCrossReferences(List<AssetCrossReferences> assetCrossReferences) {
		this.assetCrossReferences = assetCrossReferences;
	}
	public String getStrokeId() {
		return strokeId;
	}
	public void setStrokeId(String strokeId) {
		this.strokeId = strokeId;
	}
	public List<Skuchildren> getChildren() {
		return skuchildren;
	}
	public void setChildren(List<Skuchildren> children) {
		this.skuchildren = children;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Attributes getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
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

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}
	

}
