package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
@XmlRootElement(name = "product")

@XmlType(propOrder = { "alcoholContent", "ageRange", "availableInMoreColours", "averageOverallRating", "awardPresent",
		"babySize", "beautyKeyIngredients", "beautySunProtectionFactor", "benefit", "blackListFlag", "brand", "bundle",
		"collectInDays", "careInstruction", "customerFacingCharacterName", "defaultImage", "dietSuitability",
		"drinkStyle", "ecomExclusive", "fabric", "homeLongevity", "homeOccasion", "homeScentFragrance", "fabricType",
		"fastening", "featuredOnTVAdvertised", "fillingType", "furnitureAssemblyType", "fit", "goesWellWith", "gender",
		"homeGSMWeight", "furnitureCollection", "heelHeightGroup", "heelType", "icons1", "icons2", "icons3", "icons4",
		"icons5", "icons6", "homeFurnitureDesign", "homeStyle", "homeSize", "homeFeature1", "homeFeature2", "homeFeature3", "homeCollection",
		"grapeVariety", "hairType", "isOutFit", "kidsSize", "landscapeImage", "leadColour", "leadColourOverride",
		"leadCutoutImageID", "leadMainImageID", "loyaltyPromoCode", "mainIngredient", "masterProductDescription",
		"material", "maxPrice", "multipacks", "neckShape", "multiPackQuantity", "newIndicator", "olderYounger",
		"onModel", "paddedOrNonPadded", "packSize", "partSet", "onOrOffWaist", "parent_pid", "platformProductType",
		"preparationRequired", "productDefinition", "productExternalId", "productLength", "productSeoUrl", "region",
		"range", "productSize", "recipient", "shapeOrCut", "sleeveLength", "skinType", "servings", "room",
		"specialColour", "split_by_colorway", "storyOrCollection", "strokeId", "toeStyle", "suitabilityCategory",
		"denier", "threadCount", "adjustableType", "collarType", "homeFillingType", "tog", "control",
		"homeFilledBeddingSeason", "designer", "giftType", "finish", "homeVolumeCapacity", "beautyFragranceFlavour", "beautyFragranceFamily",
		"waistbandType", "waistToHemLength", "flowerColour", "flowerType", "volumeCapacity", "wineBody",
		"wineCountryOfOrigin", "wineTaste", "wiredOrNonWired", "minPrice", "shape", "productAwards", "stockLevel",
		"wineAwardAltText", "wineAwardUrl", "isBuyable", "beautyProductfinish","beautyProductCoverage", "beautySkinTone", "bulbColour", "cuffs", "imageSetId",
		"indoorOrOutdoor", "lining", "litOrNonLit", "luggagecapacity", "numberOfWheels", "pile", "powerSupply",
		"priceRange", "productKeywords", "productTexture", "secondaryProdPrimarySize", "secondaryProdSizes", "skuSize",
		"treeHeight", "wash", "occasion", "previousPrice", "visibleByDefault", "toBeIndexed",
		"oosVisibleOrPreviewProductFlag", "multiUpcFurniture", "christmasOnly", "dietaryInformation",
		"productCatchWeight", "daysSinceLaunch", "variants" })
public class Product implements IdAware, StockAware{

	private Boolean showPricePerUnit;
	private String isBuyable;
	private String isOutFit;

	private String productAvailablity;
	private String productType;
	private String ispriceRange;
	private String isSale;
	private List<Children> children;
	private List<ProductCrossReferences> productCrossReferences;
	private List<AssetCrossReferences> assetCrossReferences;
	private String stockIndicator;
	private Variants variants;
	private Price price;
	private String minPrice;
	private String maxPrice;
	private String minViewPrice;
	private String olderYounger;
	private String maxViewPrice;
	private String dietaryInformation;

	@JsonProperty("winelabel")
	private WineLabel winelabel;

	private String wineAwardAltText;
	private String wineAwardUrl;
	private String collectindays;

	@JsonProperty("categories")
	private List<Category> categories;

	@JsonProperty("name")
	private String name;

	@JsonProperty("bundlePrice")
	private BundlePrice bundleprice;

	private String id;
	private String awardPresent;

	private Attributes attributes;

	private String productSwatchImage;
	private String modelSwatchImage;

	@JsonProperty("promotions")
	private Promotion promotions;

	@JsonProperty("reviews")
	private Review reviews;

	@JsonProperty("new")
	private String newIndicator;

	private String averageOverallRating;

	@JsonProperty("MasterProductDescription")
	private String masterProductDescription;

	@JsonProperty("productExternalId")
	private String productExternalId;

	@JsonProperty("Brand")
	private String brand;

	@JsonProperty("ProductDefinition")
	private String productDefinition;

	@JsonProperty("strokeId")
	private String strokeId;

	@JsonProperty("PlatformProductType")
	private String platformProductType;

	@JsonProperty("SkinType")
	private String skinType;

	@JsonProperty("DietSuitability")
	private String dietSuitability;

	@JsonProperty("Icons3")
	private String icons3;

	@JsonProperty("ProductKeywords")
	private String productKeywords;

	@JsonProperty("Servings")
	private String servings;

	@JsonProperty("Icons2")
	private String icons2;

	@JsonProperty("Icons1")
	private String icons1;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("ImageSetId")
	private String imageSetId;

	@JsonProperty("Fabric")
	private String fabric;

	@JsonProperty("ShapeOrCut")
	private String shapeOrCut;

	@JsonProperty("AgeRange")
	private String ageRange;

	@JsonProperty("CareInstruction")
	private String careInstruction;

	@JsonProperty("Designer")
	private String designer;

	@JsonProperty("NeckShape")
	private String neckShape;

	@JsonProperty("ProductSize")
	private String productSize;

	@JsonProperty("WiredOrNonWired")
	private String wiredOrNonWired;

	@JsonProperty("FabricType")
	private String fabricType;

	@JsonProperty("Range")
	private String range;

	@JsonProperty("Fit")
	private String fit;

	@JsonProperty("Fastening")
	private String fastening;

	@JsonProperty("FurnitureAssemblyType")
	private String furnitureAssemblyType;

	@JsonProperty("ProductLength")
	private String productLength;

	@JsonProperty("EcomExclusive")
	private String ecomExclusive;

	private String loyaltyPromoCode;

	private String bundle;

	@JsonProperty("SuitabilityCategory")
	private String suitabilityCategory;

	@JsonProperty("SpecialColour")
	private String specialColour;

	@JsonProperty("CollarType")
	private String collarType;

	@JsonProperty("Cuffs")
	private String cuffs;

	@JsonProperty("Denier")
	private String denier;

	@JsonProperty("HeelType")
	private String heelType;

	@JsonProperty("HeelHeightGroup")
	private String heelHeightGroup;

	@JsonProperty("PaddedOrNonPadded")
	private String paddedOrNonPadded;

	@JsonProperty("SleeveLength")
	private String sleeveLength;

	@JsonProperty("HomeFeature1")
	private String homeFeature1;

	@JsonProperty("WaistbandType")
	private String waistbandType;

	private String wineTaste;
	private String wineBody;

	@JsonProperty("WineCountryOfOrigin")
	private String wineCountryOfOrigin;

	@JsonProperty("GrapeVariety")
	private String grapeVariety;

	@JsonProperty("GoesWellWith")
	private String goesWellWith;

	@JsonProperty("AlcoholContent")
	private String alcoholContent;

	@JsonProperty("PreparationRequired")
	private String preparationRequired;

	@JsonProperty("MainIngredient")
	private String mainIngredient;

	@JsonProperty("HomeFeature2")
	private String homeFeature2;

	@JsonProperty("HomeFillingType")
	private String homeFillingType;

	@JsonProperty("HomeFilledBeddingSeason")
	private String homeFilledBeddingSeason;

	@JsonProperty("FurnitureCollection")
	private String furnitureCollection;

	@JsonProperty("FillingType")
	private String fillingType;

	@JsonProperty("Room")
	private String room;

	@JsonProperty("Tog")
	private String tog;

	@JsonProperty("HomeGSMWeight")
	private String homeGSMWeight;

	@JsonProperty("HomeLongevity")
	private String homeLongevity;

	@JsonProperty("HomeOccasion")
	private String homeOccasion;

	@JsonProperty("HomeScentFragrance")
	private String homeScentFragrance;

	@JsonProperty("HomeSize")
	private String homeSize;

	@JsonProperty("HomeStyle")
	private String homeStyle;

    @Getter
    @JsonProperty("HomeFeature3")
    private String homeFeature3;

    @Getter
    @JsonProperty("HomeCollection")
    private String homeCollection;

	@JsonProperty("ThreadCount")
	private String threadCount;

	@JsonProperty("HomeVolumeCapacity")
	private String homeVolumeCapacity;

	@JsonProperty("OnOrOffWaist")
	private String onOrOffWaist;

	@JsonProperty("CustomerFacingCharacterName")
	private String customerFacingCharacterName;

	@JsonProperty("FeaturedOnTVAdvertised")
	private String featuredOnTVAdvertised;

	@JsonProperty("Finish")
	private String finish;

	@JsonProperty("priceRange")
	private String priceRange;

	@JsonProperty("VolumeCapacity")
	private String volumeCapacity;

	@JsonProperty("Wash")
	private String wash;

	@JsonProperty("Icons4")
	private String icons4;

	@JsonProperty("Icons5")
	private String icons5;

	@JsonProperty("Icons6")
	private String icons6;

	@JsonProperty("Beauty_Product_finish")
	private String beautyProductfinish;

	@JsonProperty("BeautyProductCoverage")
    private String beautyProductCoverage;

    @JsonProperty("BeautySkinTone")
    private String beautySkinTone;

	@JsonProperty("Control")
	private String control;

	@JsonProperty("Multipacks")
	private String multipacks;

	@JsonProperty("LeadColour")
	private String leadColour;

	@JsonProperty("Recipient")
	private String recipient;

	@JsonProperty("MultiPackQuantity")
	private String multiPackQuantity;

	@JsonProperty("Region")
	private String region;

	@JsonProperty("Luggagecapacity")
	private String luggagecapacity;

	@JsonProperty("NumberOfWheels")
	private String numberOfWheels;

	private String availableInMoreColours;

	@JsonProperty("LeadMainImageID")
	private String leadMainImageID;

	@JsonProperty("LeadCutoutImageID")
	private String leadCutoutImageID;

	@JsonProperty("navigation")
	private Navigation navigation;

	@JsonProperty("Awards")
	private String productAwards;

	private String productSeoUrl;

	private String defaultImage;

	private String material;

	private String homeFurnitureDesign;

	private String drinkStyle;

	private String shape;

	private String beautySunProtectionFactor;

	private String storyOrCollection;
	private String packSize;
	private String beautyKeyIngredients;
	private String beautyFragranceFlavour;

	@Getter
    private String beautyFragranceFamily;

	private String colour;

	private String productPromoDescription;
	private String skuSize;
	private String sequenceInBunle;
	private String secondaryProdSizes;
	private String secondaryProdPrimarySize;

	private String colourSwatch;

	private HashMap<String, String> colourSwatchMap;

	private String offerFlag;

	private String originalprice;

	private Integer productPriceMessageFlag;

	private String prevPricePerUnit;

	private String toeStyle;

	private String waistToHemLength;

	private String benefit;

	private String hairType;

	private String adjustableType;

	private String partSet;

	private String productTexture;

	private String stockLevel;

	private String flowerType;

	private String flowerColour;

	private String giftType;

	private String occasion;

	private Map<String, String> productCrossReferenceDetails;

	private boolean blackListFlag;

	private String treeHeight;

	private String powerSupply;

	private String litOrNonLit;

	private String bulbColour;

	private String lining;

	private String pile;

	private String kidsSize;

	private String babySize;

	private String leadColourOverride;

	private String indoorOrOutdoor;

	private boolean onModel;

	private boolean isLandscapeImage;

	@JsonProperty("stockQuantity")
	private int stockQuantity;

	// Attributes for stock aware changes

	@Getter
	@Setter
	private String toBeIndexed;

	@Getter
	@Setter
	private String visibleByDefault;

  private String daysSinceLaunch;

	public Boolean oosVisibleOrPreviewProductFlag = false;

	public Boolean getOosVisibleOrPreviewProductFlag() {
		return oosVisibleOrPreviewProductFlag;
	}

	@XmlTransient
	public void setOosVisibleOrPreviewProductFlag(Boolean oosVisibleOrPreviewProductFlag) {
		this.oosVisibleOrPreviewProductFlag = oosVisibleOrPreviewProductFlag;
	}

	@Getter
    @Setter
	private boolean multiUpcFurniture;

	@Setter
	private Map<String,CountryData> countriesData;

	@XmlTransient
	public Map<String, CountryData> getCountriesData() {
		return countriesData;
	}


	public Map<String, String> getProductCrossReferenceDetails() {
		return productCrossReferenceDetails;
	}

	public String getflowerType() {
		return flowerType;
	}

	@XmlElement(name = "flowerType")
	public void setflowerType(String flowerType) {
		this.flowerType = flowerType;
	}

	public String getgiftType() {
		return giftType;
	}

	@XmlElement(name = "giftType")
	public void setgiftType(String giftType) {
		this.giftType = giftType;
	}

	public String getflowerColour() {
		return flowerColour;
	}

	@XmlElement(name = "flowerColour")
	public void setflowerColour(String flowerColour) {
		this.flowerColour = flowerColour;
	}

	public String getoccasion() {
		return occasion;
	}

	@XmlElement(name = "occasion")
	public void setoccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getMinViewPrice() {
		return minViewPrice;
	}

	@XmlTransient
	public void setMinViewPrice(String minViewPrice) {
		this.minViewPrice = minViewPrice;
	}

	public String getMaxViewPrice() {
		return maxViewPrice;
	}

	@XmlTransient
	public void setMaxViewPrice(String maxViewPrice) {
		this.maxViewPrice = maxViewPrice;
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

	private String parent_pid;

	public String getParent_pid() {
		return parent_pid;
	}

	public void setParent_pid(String parent_pid) {
		this.parent_pid = parent_pid;
	}

	private String split_by_colorway;

	public String getSplit_by_colorway() {
		return split_by_colorway;
	}

	public void setSplit_by_colorway(String split_by_colorway) {
		this.split_by_colorway = split_by_colorway;
	}

	public String getProductTexture() {
		return productTexture;
	}

	@XmlElement(name = "productTexture")
	public void setProductTexture(String productTexture) {
		this.productTexture = productTexture;
	}

	@XmlElement(name = "adjustableType")
	public void setAdjustableType(String adjustableType) {
		this.adjustableType = adjustableType;
	}

	public String getAdjustableType() {
		return adjustableType;
	}

	public String getPartSet() {
		return partSet;
	}

	@XmlElement(name = "partSet")
	public void setPartSet(String partSet) {
		this.partSet = partSet;
	}

	public String getToeStyle() {
		return toeStyle;
	}

	@XmlElement(name = "toeStyle")
	public void setToeStyle(String toeStyle) {
		this.toeStyle = toeStyle;
	}

	public String getWaistToHemLength() {
		return waistToHemLength;
	}

	@XmlElement(name = "waistToHemLength")
	public void setWaistToHemLength(String waistToHemLength) {
		this.waistToHemLength = waistToHemLength;
	}

	public String getBenefit() {
		return benefit;
	}

	@XmlElement(name = "benefit")
	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getHairType() {
		return hairType;
	}

	@XmlElement(name = "hairType")
	public void setHairType(String hairtype) {
		this.hairType = hairtype;
	}

	@XmlTransient
	public void setproductCrossReferenceDetails(Map productCrossReferenceDetails) {
		this.productCrossReferenceDetails = productCrossReferenceDetails;
	}

	public String getOfferFlag() {
		return offerFlag;
	}

	@XmlTransient
	public void setOfferFlag(String offerFlag) {
		this.offerFlag = offerFlag;
	}

	public String getOriginalprice() {
		return originalprice;
	}

	@XmlTransient
	public void setProductMap(HashMap<String, String> colourSwatchMap) {
		this.colourSwatchMap = colourSwatchMap;
	}

	public HashMap<String, String> getcolourSwatchMap() {
		return colourSwatchMap;
	}

	@XmlTransient
	public void setOriginalprice(String originalprice) {
		this.originalprice = originalprice;
	}

	public Integer getProductPriceMessageFlag() {
		return productPriceMessageFlag;
	}

	@XmlTransient
	public void setProductPriceMessageFlag(Integer productPriceMessageFlag) {
		this.productPriceMessageFlag = productPriceMessageFlag;
	}

	public String getColourSwatch() {
		return colourSwatch;
	}

	@XmlTransient
	public void setColourSwatch(String colourSwatch) {
		this.colourSwatch = colourSwatch;
	}

	public String getSecondaryProdSizes() {
		return secondaryProdSizes;
	}

	public void setSecondaryProdSizes(String secondaryProdSizes) {
		this.secondaryProdSizes = secondaryProdSizes;
	}

	public String getSecondaryProdPrimarySize() {
		return secondaryProdPrimarySize;
	}

	public void setSecondaryProdPrimarySize(String secondaryProdPrimarySize) {
		this.secondaryProdPrimarySize = secondaryProdPrimarySize;
	}

	public String getProductPromoDescription() {
		return productPromoDescription;
	}

	@XmlTransient
	public void setProductPromoDescription(String productPromoDescription) {
		this.productPromoDescription = productPromoDescription;
	}

	public String getLoyaltyPromoCode() {
		return loyaltyPromoCode;
	}

	@XmlElement(name = "sparksOffer")
	public void setLoyaltyPromoCode(String loyaltyPromoCode) {
		this.loyaltyPromoCode = loyaltyPromoCode;
	}

	public Promotion getPromotion() {
		return promotions;
	}

	@XmlTransient
	public void setPromotion(Promotion promotion) {
		this.promotions = promotion;
	}

	public String getSequenceInBunle() {
		return sequenceInBunle;
	}

	@XmlTransient
	public void setSequenceInBunle(String sequenceInBunle) {
		this.sequenceInBunle = sequenceInBunle;
	}

	public String getProductType() {
		return productType;
	}

	@XmlTransient
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getColour() {
		return colour;
	}

	@XmlTransient
	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getProductSeoUrl() {
		return productSeoUrl;
	}

	@XmlElement(name = "productSeoUrl")
	public void setProductSeoUrl(String productSeoUrl) {
		this.productSeoUrl = productSeoUrl;
	}

	public String getBeautyFragranceFlavour() {
		return beautyFragranceFlavour;
	}

	@XmlElement(name = "beautyFragranceFlavour")
	public void setBeautyFragranceFlavour(String beautyFragranceFlavour) {
		this.beautyFragranceFlavour = beautyFragranceFlavour;
	}

    @XmlElement(name = "beautyFragranceFamily")
    public void setBeautyFragranceFamily(String beautyFragranceFamily) {
        this.beautyFragranceFamily = beautyFragranceFamily;
    }

	public String getBeautyKeyIngredients() {
		return beautyKeyIngredients;
	}

	@XmlElement(name = "beautyKeyIngredients")
	public void setBeautyKeyIngredients(String beautyKeyIngredients) {
		this.beautyKeyIngredients = beautyKeyIngredients;
	}

	public String getPackSize() {
		return packSize;
	}

	@XmlElement(name = "packSize")
	public void setPackSize(String packSize) {
		this.packSize = packSize;
	}

	public String getStoryOrCollection() {
		return storyOrCollection;
	}

	@XmlElement(name = "productTheme")
	public void setStoryOrCollection(String storyOrCollection) {
		this.storyOrCollection = storyOrCollection;
	}

	public String getDrinkStyle() {
		return drinkStyle;
	}

	@XmlElement(name = "drinkStyle")
	public void setDrinkStyle(String drinkStyle) {
		this.drinkStyle = drinkStyle;
	}

	public String getHomeFurnitureDesign() {
		return homeFurnitureDesign;
	}

	@XmlElement(name = "homeFurnitureDesign")
	public void setHomeFurnitureDesign(String homeFurnitureDesign) {
		this.homeFurnitureDesign = homeFurnitureDesign;
	}

	public String getMaterial() {
		return material;
	}

	@XmlElement(name = "material")
	public void setMaterial(String material) {
		this.material = material;
	}

	public String getDefaultImage() {
		return defaultImage;
	}

	@XmlElement(name = "defaultProductImage")
	public void setDefaultImage(String defaultImage) {
		this.defaultImage = defaultImage;
	}

	public Attributes getAttributes() {
		return attributes;
	}

	public Variants getVariants() {
		return variants;
	}

	@XmlElement(name = "variants")
	public void setVariants(Variants variants) {
		this.variants = variants;
	}

	@XmlTransient
	public void setAttributes(Attributes attributes) {
		this.attributes = attributes;
	}

	public String getLeadMainImageID() {
		return leadMainImageID;
	}

	@XmlElement(name = "leadMainImage")
	public void setLeadMainImageID(String leadMainImageID) {
		this.leadMainImageID = leadMainImageID;
	}

	public String getLuggagecapacity() {
		return luggagecapacity;
	}

	@XmlElement(name = "luggageCapacity")
	public void setLuggagecapacity(String luggagecapacity) {
		this.luggagecapacity = luggagecapacity;
	}

	public String getNumberOfWheels() {
		return numberOfWheels;
	}

	@XmlElement(name = "wheels")
	public void setNumberOfWheels(String numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getSuitabilityCategory() {
		return suitabilityCategory;
	}

	@XmlElement(name = "specialOccasions")
	public void setSuitabilityCategory(String suitabilityCategory) {
		this.suitabilityCategory = suitabilityCategory;
	}

	public String getSpecialColour() {
		return specialColour;
	}

	@XmlElement(name = "specialColour")
	public void setSpecialColour(String specialColour) {
		this.specialColour = specialColour;
	}

	public String getCollarType() {
		return collarType;
	}

	@XmlElement(name = "collarType")
	public void setCollarType(String collarType) {
		this.collarType = collarType;
	}

	public String getCuffs() {
		return cuffs;
	}

	@XmlElement(name = "cuff")
	public void setCuffs(String cuffs) {
		this.cuffs = cuffs;
	}

	public String getDenier() {
		return denier;
	}

	@XmlElement(name = "denier")
	public void setDenier(String denier) {
		this.denier = denier;
	}

	public String getHeelType() {
		return heelType;
	}

	@XmlElement(name = "heelType")
	public void setHeelType(String heelType) {
		this.heelType = heelType;
	}

	public String getHeelHeightGroup() {
		return heelHeightGroup;
	}

	@XmlElement(name = "heelHeight")
	public void setHeelHeightGroup(String heelHeightGroup) {
		this.heelHeightGroup = heelHeightGroup;
	}

	public String getPaddedOrNonPadded() {
		return paddedOrNonPadded;
	}

	@XmlElement(name = "padded")
	public void setPaddedOrNonPadded(String paddedOrNonPadded) {
		this.paddedOrNonPadded = paddedOrNonPadded;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	@XmlElement(name = "sleeveLength")
	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getHomeFeature1() {
		return homeFeature1;
	}

	@XmlElement(name = "homeFeature")
	public void setHomeFeature1(String homeFeature1) {
		this.homeFeature1 = homeFeature1;
	}

	public String getWaistbandType() {
		return waistbandType;
	}

	@XmlElement(name = "waistBandType")
	public void setWaistbandType(String waistbandType) {
		this.waistbandType = waistbandType;
	}

	public String getWineTaste() {
		return wineTaste;
	}

	@XmlElement(name = "wineTaste")
	public void setWineTaste(String wineTaste) {
		this.wineTaste = wineTaste;
	}

	public String getWineBody() {
		return wineBody;
	}

	@XmlElement(name = "wineBody")
	public void setWineBody(String wineBody) {
		this.wineBody = wineBody;
	}

	public String getWineCountryOfOrigin() {
		return wineCountryOfOrigin;
	}

	@XmlElement(name = "wineCountryOfOrigin")
	public void setWineCountryOfOrigin(String wineCountryOfOrigin) {
		this.wineCountryOfOrigin = wineCountryOfOrigin;
	}

	public String getGrapeVariety() {
		return grapeVariety;
	}

	@XmlElement(name = "grapeVariety")
	public void setGrapeVariety(String grapeVariety) {
		this.grapeVariety = grapeVariety;
	}

	public String getGoesWellWith() {
		return goesWellWith;
	}

	@XmlElement(name = "pairing")
	public void setGoesWellWith(String goesWellWith) {
		this.goesWellWith = goesWellWith;
	}

	public String getAlcoholContent() {
		return alcoholContent;
	}

	@XmlElement(name = "strength")
	public void setAlcoholContent(String alcoholContent) {
		this.alcoholContent = alcoholContent;
	}

	public String getPreparationRequired() {
		return preparationRequired;
	}

	@XmlElement(name = "cookingType")
	public void setPreparationRequired(String preparationRequired) {
		this.preparationRequired = preparationRequired;
	}

	public String getMainIngredient() {
		return mainIngredient;
	}

	@XmlElement(name = "foodIngredient")
	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	public String getHomeFeature2() {
		return homeFeature2;
	}

	@XmlElement(name = "homeFeature2")
	public void setHomeFeature2(String homeFeature2) {
		this.homeFeature2 = homeFeature2;
	}

    @XmlElement(name = "homeFeature3")
    public void setHomeFeature3(String homeFeature3) {
        this.homeFeature3 = homeFeature3;
    }

    @XmlElement(name = "homeCollection")
    public void setHomeCollection(String homeCollection) {
        this.homeCollection = homeCollection;
    }

	public String getHomeFillingType() {
		return homeFillingType;
	}

	@XmlElement(name = "homeFillingType")
	public void setHomeFillingType(String homeFillingType) {
		this.homeFillingType = homeFillingType;
	}

	public String getHomeFilledBeddingSeason() {
		return homeFilledBeddingSeason;
	}

	@XmlElement(name = "homeFilledBedding")
	public void setHomeFilledBeddingSeason(String homeFilledBeddingSeason) {
		this.homeFilledBeddingSeason = homeFilledBeddingSeason;
	}

	public String getFurnitureCollection() {
		return furnitureCollection;
	}

	@XmlElement(name = "furnitureCollection")
	public void setFurnitureCollection(String furnitureCollection) {
		this.furnitureCollection = furnitureCollection;
	}

	public String getFillingType() {
		return fillingType;
	}

	@XmlElement(name = "fillingType")
	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}

	public String getRoom() {
		return room;
	}

	@XmlElement(name = "room")
	public void setRoom(String room) {
		this.room = room;
	}

	public String getTog() {
		return tog;
	}

	@XmlElement(name = "tog")
	public void setTog(String tog) {
		this.tog = tog;
	}

	public String getHomeGSMWeight() {
		return homeGSMWeight;
	}

	@XmlElement(name = "homeGsmWeight")
	public void setHomeGSMWeight(String homeGSMWeight) {
		this.homeGSMWeight = homeGSMWeight;
	}

	public String getHomeLongevity() {
		return homeLongevity;
	}

	@XmlElement(name = "homeLongevity")
	public void setHomeLongevity(String homeLongevity) {
		this.homeLongevity = homeLongevity;
	}

	public String getHomeOccasion() {
		return homeOccasion;
	}

	@XmlElement(name = "homeOccasion")
	public void setHomeOccasion(String homeOccasion) {
		this.homeOccasion = homeOccasion;
	}

	public String getHomeScentFragrance() {
		return homeScentFragrance;
	}

	@XmlElement(name = "homeScent")
	public void setHomeScentFragrance(String homeScentFragrance) {
		this.homeScentFragrance = homeScentFragrance;
	}

	public String getHomeSize() {
		return homeSize;
	}

	@XmlElement(name = "homeSize")
	public void setHomeSize(String homeSize) {
		this.homeSize = homeSize;
	}

	public String getHomeStyle() {
		return homeStyle;
	}

	@XmlElement(name = "homeStyle")
	public void setHomeStyle(String homeStyle) {
		this.homeStyle = homeStyle;
	}

	public String getThreadCount() {
		return threadCount;
	}

	@XmlElement(name = "homeThreadCount")
	public void setThreadCount(String threadCount) {
		this.threadCount = threadCount;
	}

	public String getHomeVolumeCapacity() {
		return homeVolumeCapacity;
	}

	@XmlElement(name = "homeVolumeCapacity")
	public void setHomeVolumeCapacity(String homeVolumeCapacity) {
		this.homeVolumeCapacity = homeVolumeCapacity;
	}

	public String getOnOrOffWaist() {
		return onOrOffWaist;
	}

	@XmlElement(name = "shape")
	public void setshape(String shape) {
		this.shape = shape;
	}

	public String getshape() {
		return shape;
	}

	@XmlElement(name = "onOrOffWaist")
	public void setOnOrOffWaist(String onOrOffWaist) {
		this.onOrOffWaist = onOrOffWaist;
	}

	public String getCustomerFacingCharacterName() {
		return customerFacingCharacterName;
	}

	@XmlElement(name = "character")
	public void setCustomerFacingCharacterName(String customerFacingCharacterName) {
		this.customerFacingCharacterName = customerFacingCharacterName;
	}

	public String getFeaturedOnTVAdvertised() {
		return featuredOnTVAdvertised;
	}

	@XmlElement(name = "features")
	public void setFeaturedOnTVAdvertised(String featuredOnTVAdvertised) {
		this.featuredOnTVAdvertised = featuredOnTVAdvertised;
	}

	public String getFinish() {
		return finish;
	}

	@XmlElement(name = "finish")
	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getPriceRange() {
		return priceRange;
	}

	@XmlElement(name = "listPriceText")
	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public String getisPriceRange() {
		return ispriceRange;
	}

	@XmlTransient
	public void setisPriceRange(String ispriceRange) {
		this.ispriceRange = ispriceRange;
	}

	public String getisSale() {
		return isSale;
	}

	@XmlTransient
	public void setisSale(String isSale) {
		this.isSale = isSale;
	}

	public String getVolumeCapacity() {
		return volumeCapacity;
	}

	@XmlElement(name = "volume")
	public void setVolumeCapacity(String volumeCapacity) {
		this.volumeCapacity = volumeCapacity;
	}

	public String getWash() {
		return wash;
	}

	@XmlElement(name = "wash")
	public void setWash(String wash) {
		this.wash = wash;
	}

	public String getIcons4() {
		return icons4;
	}

	@XmlElement(name = "productIcon4")
	public void setIcons4(String icons4) {
		this.icons4 = icons4;
	}

	public String getIcons5() {
		return icons5;
	}

	@XmlElement(name = "productIcon5")
	public void setIcons5(String icons5) {
		this.icons5 = icons5;
	}

	public String getIcons6() {
		return icons6;
	}

	@XmlElement(name = "productIcon6")
	public void setIcons6(String icons6) {
		this.icons6 = icons6;
	}

	public String getControl() {
		return control;
	}

	public String getBeautyProductfinish() {
		return beautyProductfinish;
	}

	@XmlElement(name = "beautyFinish")
	public void setBeautyProductfinish(String beautyProductfinish) {
		this.beautyProductfinish = beautyProductfinish;
	}

    public String getBeautyProductCoverage() {
        return beautyProductCoverage;
    }

    @XmlElement(name = "beautyProductCoverage")
    public void setBeautyProductCoverage(String beautyProductCoverage) {
        this.beautyProductCoverage = beautyProductCoverage;
    }

    public String getBeautySkinTone() {
        return beautySkinTone;
    }

    @XmlElement(name = "beautySkinTone")
    public void setBeautySkinTone(String beautySkinTone) {
        this.beautySkinTone = beautySkinTone;
    }

    @XmlElement(name = "control")
	public void setControl(String control) {
		this.control = control;
	}

	public String getMultipacks() {
		return multipacks;
	}

	@XmlElement(name = "multipacks")
	public void setMultipacks(String multipacks) {
		this.multipacks = multipacks;
	}

	public String getLeadColour() {
		return leadColour;
	}

	@XmlElement(name = "productLeadColour")
	public void setLeadColour(String leadColour) {
		this.leadColour = leadColour;
	}

	public String getRecipient() {
		return recipient;
	}

	@XmlElement(name = "recipient")
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMultiPackQuantity() {
		return multiPackQuantity;
	}

	@XmlElement(name = "package")
	public void setMultiPackQuantity(String multiPackQuantity) {
		this.multiPackQuantity = multiPackQuantity;
	}

	public String getRegion() {
		return region;
	}

	@XmlElement(name = "region")
	public void setRegion(String region) {
		this.region = region;
	}

	public String getIsOutFit() {
		return isOutFit;
	}

	public void setIsOutFit(String isOutFit) {
		this.isOutFit = isOutFit;
	}

	public String getIsBuyable() {
		return isBuyable;
	}

	public void setIsBuyable(String isBuyable) {
		this.isBuyable = isBuyable;
	}

	public Boolean getshowPricePerUnit() {
		return showPricePerUnit;
	}

	public void setpreviousPrice(String prevPricePerUnit) {
		this.prevPricePerUnit = prevPricePerUnit;
	}

	public String getpreviousPrice() {
		return prevPricePerUnit;
	}

	@XmlTransient
	public void setshowPricePerUnit(Boolean showPricePerUnit) {
		this.showPricePerUnit = showPricePerUnit;
	}

	public String getBundle() {
		return bundle;
	}

	@XmlElement(name = "isBundle")
	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	public String getEcomExclusive() {
		return ecomExclusive;
	}

	@XmlElement(name = "onlineOnly")
	public void setEcomExclusive(String ecomExclusive) {
		this.ecomExclusive = ecomExclusive;
	}

	public String getProductLength() {
		return productLength;
	}

	@XmlElement(name = "productLength")
	public void setProductLength(String productLength) {
		this.productLength = productLength;
	}

	public String getFurnitureAssemblyType() {
		return furnitureAssemblyType;
	}

	@XmlElement(name = "furnitureAssemblyType")
	public void setFurnitureAssemblyType(String furnitureAssemblyType) {
		this.furnitureAssemblyType = furnitureAssemblyType;
	}

	public String getFastening() {
		return fastening;
	}

	@XmlElement(name = "fastening")
	public void setFastening(String fastening) {
		this.fastening = fastening;
	}

	public String getFit() {
		return fit;
	}

	@XmlElement(name = "fit")
	public void setFit(String fit) {
		this.fit = fit;
	}

	public String getRange() {
		return range;
	}

	@XmlElement(name = "range")
	public void setRange(String range) {
		this.range = range;
	}

	public String getFabricType() {
		return fabricType;
	}

	@XmlElement(name = "patternType")
	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public String getWiredOrNonWired() {
		return wiredOrNonWired;
	}

	@XmlElement(name = "wiredOrNonWired")
	public void setWiredOrNonWired(String wiredOrNonWired) {
		this.wiredOrNonWired = wiredOrNonWired;
	}

	public String getProductSize() {
		return productSize;
	}

	@XmlElement(name = "productSize")
	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getNeckShape() {
		return neckShape;
	}

	@XmlElement(name = "neckType")
	public void setNeckShape(String neckShape) {
		this.neckShape = neckShape;
	}

	public String getDesigner() {
		return designer;
	}

	@XmlElement(name = "designer")
	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getCareInstruction() {
		return careInstruction;
	}

	@XmlElement(name = "careInstruction")
	public void setCareInstruction(String careInstruction) {
		this.careInstruction = careInstruction;
	}

	public String getAgeRange() {
		return ageRange;
	}

	@XmlElement(name = "age")
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getShapeOrCut() {
		return shapeOrCut;
	}

	@XmlElement(name = "styles")
	public void setShapeOrCut(String shapeOrCut) {
		this.shapeOrCut = shapeOrCut;
	}

	public String getFabric() {
		return fabric;
	}

	@XmlElement(name = "fabric")
	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getImageSetId() {
		return imageSetId;
	}

	public void setImageSetId(String imageSetId) {
		this.imageSetId = imageSetId;
	}

	public String getGender() {
		return gender;
	}

	@XmlElement(name = "gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIcons2() {
		return icons2;
	}

	@XmlElement(name = "productIcon2")
	public void setIcons2(String icons2) {
		this.icons2 = icons2;
	}

	public String getIcons1() {
		return icons1;
	}

	@XmlElement(name = "productIcon1")
	public void setIcons1(String icons1) {
		this.icons1 = icons1;
	}

	public String getServings() {
		return servings;
	}

	@XmlElement(name = "servings")
	public void setServings(String servings) {
		this.servings = servings;
	}

	public String getProductKeywords() {
		return productKeywords;
	}

	@XmlElement(name = "keywords")
	public void setProductKeywords(String productKeywords) {
		this.productKeywords = productKeywords;
	}

	public String getIcons3() {
		return icons3;
	}

	@XmlElement(name = "productIcon3")
	public void setIcons3(String icons3) {
		this.icons3 = icons3;
	}

	public String getDietSuitability() {
		return dietSuitability;
	}

	@XmlElement(name = "dietSuitability")
	public void setDietSuitability(String dietSuitability) {
		this.dietSuitability = dietSuitability;
	}

	public String getSkinType() {
		return skinType;
	}

	@XmlElement(name = "skinType")
	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public String getPlatformProductType() {
		return platformProductType;
	}

	@XmlElement(name = "productType")
	public void setPlatformProductType(String platformProductType) {
		this.platformProductType = platformProductType;
	}

	public String getStrokeId() {
		return strokeId;
	}

	@XmlElement(name = "strokeId")
	public void setStrokeId(String strokeId) {
		this.strokeId = strokeId;
	}

	public String getProductDefinition() {
		return productDefinition;
	}

	@XmlElement(name = "productDefinition")
	public void setProductDefinition(String productDefinition) {
		this.productDefinition = productDefinition;
	}

	public String getBrand() {
		return brand;
	}

	@XmlElement(name = "brand")
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNewIndicator() {
		return newIndicator;
	}

	@XmlElement(name = "newIndicatorFlag")
	public void setNewIndicator(String newIndicator) {
		this.newIndicator = newIndicator;
	}

	public String getProductExternalId() {
		return productExternalId;
	}

	@XmlElement(name = "pid")
	public void setProductExternalId(String productExternalId) {
		this.productExternalId = productExternalId;
	}

	public String getMasterProductDescription() {
		return masterProductDescription;
	}

	@XmlElement(name = "title")
	public void setMasterProductDescription(String masterProductDescription) {
		this.masterProductDescription = masterProductDescription;
	}

	public List<Children> getChildren() {
		return children;
	}

	@XmlTransient
	public void setChildren(List<Children> children) {
		this.children = children;
	}

	public String getAvailableInMoreColours() {
		return availableInMoreColours;
	}

	@XmlElement(name = "displayAvailableInMoreColours")
	public void setAvailableInMoreColours(String availableInMoreColours) {
		this.availableInMoreColours = availableInMoreColours;
	}

	public String getProductAvailablity() {
		return productAvailablity;
	}

	@XmlTransient
	public void setProductAvailablity(String productAvailablity) {
		this.productAvailablity = productAvailablity;
	}

	public List<ProductCrossReferences> getProductCrossReferences() {
		return productCrossReferences;
	}

	@XmlTransient
	public void setProductCrossReferences(List<ProductCrossReferences> productCrossReferences) {
		this.productCrossReferences = productCrossReferences;
	}

	public List<AssetCrossReferences> getAssetCrossReferences() {
		return assetCrossReferences;
	}

	@XmlTransient
	public void setAssetCrossReferences(List<AssetCrossReferences> assetCrossReferences) {
		this.assetCrossReferences = assetCrossReferences;
	}

	public Navigation getNavigation() {
		return navigation;
	}

	@XmlTransient
	public void setNavigation(Navigation navigation) {
		this.navigation = navigation;
	}

	public String getSkuSize() {
		return skuSize;
	}

	public void setSkuSize(String skuSize) {
		this.skuSize = skuSize;
	}

	public String getStockIndicator() {
		return stockIndicator;
	}

	@XmlTransient
	public void setStockIndicator(String stockIndicator) {
		this.stockIndicator = stockIndicator;
	}

	public Price getPrice() {
		return price;
	}

	@XmlTransient
	public void setPrice(Price price) {
		this.price = price;
	}

	public WineLabel getWineLabel() {
		return winelabel;
	}

	@XmlTransient
	public void setWineLabel(WineLabel winelabel) {
		this.winelabel = winelabel;
	}

	public BundlePrice getBundlePrice() {
		return bundleprice;
	}

	@XmlTransient
	public void setBundlePrice(BundlePrice bundleprice) {
		this.bundleprice = bundleprice;
	}

	public String getId() {
		return id;
	}

	@XmlTransient
	public void setId(String id) {
		this.id = id;
	}

	public String getproductAwards() {
		return productAwards;
	}

	public void setproductAwards(String productAwards) {
		this.productAwards = productAwards;
	}

	public String getAverageOverallRating() {
		return averageOverallRating;
	}

	@XmlElement(name = "averageRating")
	public void setAverageOverallRating(String averageOverallRating) {
		this.averageOverallRating = averageOverallRating;
	}

	public Review getReviews() {
		return reviews;
	}

	@XmlTransient
	public void setReview(Review review) {
		this.reviews = review;
	}

	public String getAwardPresent() {
		return awardPresent;
	}

	@XmlElement(name = "awardPresent")
	public void setAwardPresent(String awardPresent) {
		this.awardPresent = awardPresent;
	}

	public String getBeautySunProtectionFactor() {
		return beautySunProtectionFactor;
	}

	@XmlElement(name = "beautySunProtectionFactor")
	public void setBeautySunProtectionFactor(String beautySunProtectionFactor) {
		this.beautySunProtectionFactor = beautySunProtectionFactor;
	}

	public String getProductSwatchImage() {
		return productSwatchImage;
	}

	@XmlTransient
	public void setProductSwatchImage(String productSwatchImage) {
		this.productSwatchImage = productSwatchImage;
	}

	public String getModelSwatchImage() {
		return modelSwatchImage;
	}

	@XmlTransient
	public void setModelSwatchImage(String modelSwatchImage) {
		this.modelSwatchImage = modelSwatchImage;
	}

	public String getCollectInDays() {
		return collectindays;
	}

	@XmlElement(name = "productCollectInXdays")
	public void setCollectInDays(String collectindays) {
		this.collectindays = collectindays;
	}

	public String getwineAwardAltText() {
		return wineAwardAltText;
	}

	@XmlElement(name = "wineAwardAltText")
	public void setwineAwardAltText(String wineAwardAltText) {
		this.wineAwardAltText = wineAwardAltText;
	}

	public String getwineAwardUrl() {
		return wineAwardUrl;
	}

	@XmlElement(name = "wineAwardUrl")
	public void setwineAwardUrl(String wineAwardUrl) {
		this.wineAwardUrl = wineAwardUrl;
	}

	public String getstockLevel() {
		return stockLevel;
	}

	@XmlElement(name = "product_level_stock")
	public void setstockLevel(String stockLevel) {
		this.stockLevel = stockLevel;
	}

	public String getTreeHeight() {
		return treeHeight;
	}

	@XmlElement(name = "treeHeight")
	public void setTreeHeight(String treeHeight) {
		this.treeHeight = treeHeight;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	@XmlElement(name = "powerSupply")
	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getLitOrNonLit() {
		return litOrNonLit;
	}

	@XmlElement(name = "litOrNonLit")
	public void setLitOrNonLit(String litOrNonLit) {
		this.litOrNonLit = litOrNonLit;
	}

	public String getBulbColour() {
		return bulbColour;
	}

	@XmlElement(name = "bulbColour")
	public void setBulbColour(String bulbColour) {
		this.bulbColour = bulbColour;
	}

	public String getLining() {
		return lining;
	}

	@XmlElement(name = "lining")
	public void setLining(String lining) {
		this.lining = lining;
	}

	public String getPile() {
		return pile;
	}

	@XmlElement(name = "pile")
	public void setPile(String pile) {
		this.pile = pile;
	}

	public String getIndoorOrOutdoor() {
		return indoorOrOutdoor;
	}

	@XmlElement(name = "indoorOrOutdoor")
	public void setIndoorOrOutdoor(String indoorOrOutdoor) {
		this.indoorOrOutdoor = indoorOrOutdoor;
	}

	public boolean isBlackListFlag() {
		return blackListFlag;
	}

	@XmlElement(name = "blackList")
	public void setBlackListFlag(boolean blackListFlag) {
		this.blackListFlag = blackListFlag;
	}

	public String getKidsSize() {
		return kidsSize;
	}

	@XmlElement(name = "kidsSize")
	public void setKidsSize(String kidsSize) {
		this.kidsSize = kidsSize;
	}

	public String getBabySize() {
		return babySize;
	}

	@XmlElement(name = "babySize")
	public void setBabySize(String babySize) {
		this.babySize = babySize;
	}

	public String getLeadCutoutImageID() {
		return leadCutoutImageID;
	}

	@XmlElement(name = "leadCutoutImage")
	public void setLeadCutoutImageID(String leadCutoutImageID) {
		this.leadCutoutImageID = leadCutoutImageID;
	}

	public String getLeadColourOverride() {
		return leadColourOverride;
	}

	@XmlElement(name = "leadColourOverride")
	public void setLeadColourOverride(String leadColourOverride) {
		this.leadColourOverride = leadColourOverride;
	}


	public List<Category> getCategories() {
		return categories;
	}
	@XmlTransient
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getName() {
		return name;
	}
	@XmlTransient
	public void setName(String name) {
		this.name = name;
	}

	public boolean getOnModel() {
		return onModel;
	}

	public void setOnModel(boolean onModel) {
		this.onModel = onModel;
	}

	public boolean isLandscapeImage() {
		return isLandscapeImage;
	}
	@XmlElement(name = "isLandscapeImage")
	public void setLandscapeImage(boolean landscapeImage) {
		isLandscapeImage = landscapeImage;
	}

	public String getOlderYounger() {
		return olderYounger;
	}

	@XmlElement(name = "olderYounger")
	public void setOlderYounger(String olderYounger) {
		this.olderYounger = olderYounger;
	}

	public void setDaysSinceLaunch(String daysSinceLaunch){
    this.daysSinceLaunch = daysSinceLaunch;
  }

  public String getDaysSinceLaunch(){
    return daysSinceLaunch;
  }

	@Getter
	@Setter
	private boolean christmasOnly;

	@Getter
	@Setter
	private String productCatchWeight;

	public int getStockQuantity() {
		return stockQuantity;
	}

	@XmlTransient
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public String getDietaryInformation() {
		return dietaryInformation;
	}

	@XmlElement(name = "dietaryInformation")
	public void setDietaryInformation(String dietaryInformation) {
		this.dietaryInformation = dietaryInformation;
	}

}
