package com.marksandspencer.search.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlRootElement(name = "sku")
@NoArgsConstructor
@XmlType(propOrder = { "viewId", "strokeId", "stockIndicator", "price", "skuid", "productColorCountLive",
		"colourSwatches", "colorCountLiveInStock", "outOfStock", "outOfStockOverride", "skuSize", "uPC", "colour",
		"shoeSize", "primarySizeIndex", "imageSetId", "sizeSearchable", "modelViewImage", "productViewImage",
		"leadColourOverride", "productSwatchImage", "modelSwatchImage", "categoryFacet", "crumbs", "crumbsId",
		"pricePerUnit", "originalPrice", "department", "categoryNew", "colourGroup", "listPriceText", "offerFlag",
		"priceFlag", "offers", "promotionDescription", "minPrice", "maxPrice", "stockLevel", "minCatchWeight",
		"childServingSize", "maxCatchWeight", "weight", "stockQuantity", "cftoSkuId", "minSkuPrice", "maxSkuPrice",
		"skuChristmasOnly" })
public class Sku {
	private String viewId;
	private String strokeId;
	private String stockIndicator;
	private String price;
	private String skuid;

	private String productType;
	private String colourSwatches;
	
	private String offerFlag;

	private String productColorCountLive;

	private String colorCountLiveInStock;

	private String outOfStock;
	private String outOfStockOverride;
	private String skuSize;
	private String uPC;
	private String colourGroup;
	private String colour;
	private String shoeSize;

	private String primarySizeIndex;

	private String imageSetId;
	private String sizeSearchable;
	private String modelViewImage;
	private String imgUrlSwatch;
	private String productViewImage;

	private String leadColourOverride;
	private String productSwatchImage;

	private String modelSwatchImage;
	private String categoryFacet;
	private String crumbs;
	private String crumbsId;

	private String department;
	private String categoryNew;
	private String listPriceText;

	private String pricePerUnit;

	private String originalPrice;
	
	private String priceFlag;
	
	private String offers;
	
	private String promotionDescription;

	private String minPrice;

	private String maxPrice;

	private String stockLevel;

	private String childServingSize;

	private String minCatchWeight;

	private String maxCatchWeight;

	private String weight;

	private int stockQuantity;

	private String cftoSkuId;

	private boolean skuChristmasOnly;

	public boolean getSkuChristmasOnly() {
		return skuChristmasOnly;
	}

	@XmlElement(name = "skuChristmasOnly")
	public void setSkuChristmasOnly(boolean skuChristmasOnly) {
		this.skuChristmasOnly = skuChristmasOnly;
	}

	@Getter
	@Setter
	private String minSkuPrice;

	@Getter
	@Setter
	private String maxSkuPrice;

	public String getCftoSkuId() {
		return cftoSkuId;
	}

	@XmlElement(name = "cftoSkuId")
	public void setCftoSkuId(String cftoSkuId) {
		this.cftoSkuId = cftoSkuId;
	}

	public int getStockQuantity() {
		return stockQuantity;
	}

	@XmlElement(name = "stockQuantity")
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getMinCatchWeight() {
		return minCatchWeight;
	}

	@XmlElement(name = "minCatchWeight")
	public void setMinCatchWeight(String minCatchWeight) {
		this.minCatchWeight = minCatchWeight;
	}

	public String getWeight() {
		return weight;
	}

	@XmlElement(name = "weight")
	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getMaxCatchWeight() {
		return maxCatchWeight;
	}

	@XmlElement(name = "maxCatchWeight")
	public void setMaxCatchWeight(String maxCatchWeight) {
		this.maxCatchWeight = maxCatchWeight;
	}

	public String getChildServingSize() {
		return childServingSize;
	}

	@XmlElement(name = "childServingSize")
	public void setChildServingSize(String childServingSize) {
		this.childServingSize = childServingSize;
	}

	public String getMinPrice() {
		return minPrice;
	}

	@XmlElement(name = "minPrice")
	public void setMinPrice(String minPrice) {
		this.minPrice = minPrice;
	}

	public String getMaxPrice() {
		return maxPrice;
	}

	@XmlElement(name = "maxPrice")
	public void setMaxPrice(String maxPrice) {
		this.maxPrice = maxPrice;
	}

	public String getStockLevel() {
		return stockLevel;
	}

	@XmlElement(name = "product_level_stock")
	public void setStockLevel(String stockLevel) {
		this.stockLevel = stockLevel;
	}

	public String getpromotionDescription() {
		return promotionDescription;
	}	

	@XmlElement(name = "promotionDescription")
	public void setpromotionDescription(String promotionDescription) {
		this.promotionDescription = promotionDescription;
	}

	public String getlistPriceText() {
		return listPriceText;
	}

	public void setlistPriceText(String listPriceText) {
		this.listPriceText = listPriceText;
	}
	
	public String getofferFlag() {
		return offerFlag;
	}

	@XmlElement(name = "offerFlag")
	public void setofferFlag(String offerFlag) {
		this.offerFlag = offerFlag;
	}
	
	public String getpriceFlag() {
		return priceFlag;
	}

	@XmlElement(name = "priceFlag")
	public void setpriceFlag(String priceFlag) {
		this.priceFlag = priceFlag;
	}

	public String getViewId() {
		return viewId;
	}

	public void setViewId(String viewId) {
		this.viewId = viewId;
	}

	public String getCategoryFacet() {
		return categoryFacet;
	}

	public void setCategoryFacet(String categoryFacet) {
		this.categoryFacet = categoryFacet;
	}

	public String getdepartment() {
		return department;
	}

	public void setdepartment(String department) {
		this.department = department;
	}

	public String getcategoryNew() {
		return categoryNew;
	}

	public void setcategoryNew(String categoryNew) {
		this.categoryNew = categoryNew;
	}

	public String getCrumbs() {
		return crumbs;
	}

	public void setCrumbs(String crumbs) {
		this.crumbs = crumbs;
	}

	public String getCrumbsId() {
		return crumbsId;
	}

	public void setCrumbsId(String crumbsId) {
		this.crumbsId = crumbsId;
	}

	public String getModelSwatchImage() {
		return modelSwatchImage;
	}

	public void setModelSwatchImage(String modelSwatchImage) {
		this.modelSwatchImage = modelSwatchImage;
	}

	public String getProductSwatchImage() {
		return productSwatchImage;
	}

	public void setProductSwatchImage(String productSwatchImage) {
		this.productSwatchImage = productSwatchImage;
	}

	public String getLeadColourOverride() {
		return leadColourOverride;
	}

	public void setLeadColourOverride(String leadColourOverride) {
		this.leadColourOverride = leadColourOverride;
	}

	public String getProductViewImage() {
		return productViewImage;
	}

	@XmlElement(name = "productViewImage")
	public void setProductViewImage(String productViewImage) {
		this.productViewImage = productViewImage;
	}

	public String getImgUrlSwatch() {
		return imgUrlSwatch;
	}

	public String getModelViewImage() {
		return modelViewImage;
	}

	@XmlElement(name = "modelViewImage")
	public void setModelViewImage(String modelViewImage) {
		this.modelViewImage = modelViewImage;
	}


	public String getShoeSize() {
		return shoeSize;
	}

	@XmlElement(name = "shoeSize")
	public void setShoeSize(String shoeSize) {
		this.shoeSize = shoeSize;
	}

	public String getColour() {
		return colour;
	}

	@XmlElement(name = "colour")
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPrimarySizeIndex() {
		return primarySizeIndex;
	}

	@XmlElement(name = "primarySizeIndex")
	public void setPrimarySizeIndex(String primarySizeIndex) {
		this.primarySizeIndex = primarySizeIndex;
	}

	public String getSkuSize() {
		return skuSize;
	}

	public String getuPC() {
		return uPC;
	}

	@XmlElement(name = "upc")
	public void setuPC(String uPC) {
		this.uPC = uPC;
	}

	public String getcolourGroup() {
		return colourGroup;
	}

	@XmlElement(name = "colourGroup")
	public void setcolourGroup(String colourGroup) {
		this.colourGroup = colourGroup;
	}

	@XmlElement(name = "skuSize")
	public void setSkuSize(String skuSize) {
		this.skuSize = skuSize;
	}

	public String getOutOfStock() {
		return outOfStock;
	}

	@XmlElement(name = "outOfStock")
	public void setOutOfStock(String outOfStock) {
		this.outOfStock = outOfStock;
	}

	public String getSkuid() {
		return skuid;
	}

	@XmlElement(name = "skuId")
	public void setSkuid(String skuid) {
		this.skuid = skuid;
	}

	public String getImageSetId() {
		return imageSetId;
	}

	@XmlElement(name = "imageSetId")
	public void setImageSetId(String imageSetId) {
		this.imageSetId = imageSetId;
	}

	public String getColorCountLiveInStock() {
		return colorCountLiveInStock;
	}

	@XmlElement(name = "colourCountInStock")
	public void setColorCountLiveInStock(String colorCountLiveInStock) {
		this.colorCountLiveInStock = colorCountLiveInStock;
	}

	public String getColourSwatches() {
		return colourSwatches;
	}

	@XmlElement(name = "colourSwatches")
	public void setColourSwatches(String colourSwatches) {
		this.colourSwatches = colourSwatches;
	}

	public String getStrokeId() {
		return strokeId;
	}

	@XmlElement(name = "strokeId")
	public void setStrokeId(String strokeId) {
		this.strokeId = strokeId;
	}

	public String getStockIndicator() {
		return stockIndicator;
	}

	@XmlElement(name = "stockIndicator")
	public void setStockIndicator(String stockIndicator) {
		this.stockIndicator = stockIndicator;
	}

	public String getPrice() {
		return price;
	}

	@XmlElement(name = "price")
	public void setPrice(String price) {
		this.price = price;
	}


	public String getProductType() {
		return productType;
	}
	
    @XmlTransient
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getProductColorCountLive() {
		return productColorCountLive;
	}

	@XmlElement(name = "colourCount")
	public void setProductColorCountLive(String productColorCountLive) {
		this.productColorCountLive = productColorCountLive;
	}

	public String getSizeSearchable() {
		return sizeSearchable;
	}

	@XmlElement(name = "sizesSearchable")
	public void setSizeSearchable(String sizeSearchable) {
		this.sizeSearchable = sizeSearchable;
	}
	
	public String getoffers() {
		return offers;
	}

	@XmlElement(name = "offers")
	public void setoffers(String offers) {
		this.offers = offers;
	}

	public String getPricePerUnit() {
		return pricePerUnit;
	}

	@XmlElement(name = "pricePerUnit")
	public void setPricePerUnit(String pricePerUnit) {
		this.pricePerUnit = pricePerUnit;
	}

	public String getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getOutOfStockOverride() {
		return outOfStockOverride;
	}


	public void setOutOfStockOverride(String outOfStockOverride) {
		this.outOfStockOverride = outOfStockOverride;
	}
}
