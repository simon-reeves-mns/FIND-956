package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import javax.xml.bind.annotation.XmlTransient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class Attributes implements Serializable {

    static final long serialVersionUID = 1L;

	@JsonProperty("MasterProductDescription")
	private String masterProductDescription;

	@JsonProperty("Brand")
	private String brand;

	@JsonProperty("ProductDefinition")
	private String productDefinition;

	@JsonProperty("PlatformProductType")
	private String platformProductType;

	@JsonProperty("SkinType")
	private String skinType;

	@JsonProperty("DietSuitability")
	private String dietSuitability;

	@JsonProperty("CustomerFriendlyPrimarySize")
	private String customerFriendlyPrimarySize;

	@JsonProperty("CustomerFriendlySecondarySize")
	private String customerFriendlySecondarySize;

	@JsonProperty("CustomerFriendlyPrimarySecondarySize")
	private String customerFriendlyPrimarySecondarySize;

	@JsonProperty("primarySizeRange")
	private String primarySizeRange;

	@JsonProperty("Icons3")
	private String icons3;

	@JsonProperty("Fabric")
	private String fabric;

	@JsonProperty("IEIntlFlag")
	private String iEIntlFlag;

	@JsonProperty("Icons2")
	private String icons2;

	@JsonProperty("Icons1")
	private String icons1;

	@JsonProperty("ProductKeywords")
	private String productKeywords;

	@JsonProperty("Servings")
	private String servings;

	@JsonProperty("Gender")
	private String gender;

	@JsonProperty("ImageSetId")
	private String imageSetId;

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

	@JsonProperty("UPC")
	private String uPC;

	@JsonProperty("ColourGroup")
	private String colourGroup;

	@JsonProperty("Fastening")
	private String fastening;

	@JsonProperty("FurnitureAssemblyType")
	private String furnitureAssemblyType;

	@JsonProperty("ProductLength")
	private String productLength;

	@JsonProperty("EcomExclusive")
	private String ecomExclusive;

	@JsonProperty("ColourExact_Copy")
	private String colourExactCopy;

	@JsonProperty("PrimarySizeDescription_Copy")
	private String primarySizeDescriptionCopy;

	@JsonProperty("PrimarySizeIndex")
	private String primarySizeIndex;

	@JsonProperty("PlanA")
	private String planA;

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

	@JsonProperty("WineTaste")
	private String wineTaste;

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

	@JsonProperty("TogValue")
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

	@JsonProperty("ThreadCount")
	private String threadCount;

	@JsonProperty("HomeVolumeCapacity")
	private String homeVolumeCapacity;

    @Getter
    @Setter
    @JsonProperty("HomeFeature3")
    private String homeFeature3;

    @Getter
    @Setter
    @JsonProperty("HomeCollection")
    private String homeCollection;

	@JsonProperty("OnOrOffWaist")
	private String onOrOffWaist;

	@JsonProperty("CustomerFacingCharacterName")
	private String customerFacingCharacterName;

	@JsonProperty("FeaturedOnTVAdvertised")
	private String featuredOnTVAdvertised;

	@JsonProperty("Finish")
	private String finish;

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
	private String beautyProductFinish;

    @Getter
    @Setter
    @JsonProperty("BeautyProductCoverage")
    private String beautyProductCoverage;

    @Getter
    @Setter
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

	@JsonProperty("LeadMainImageID")
	private String leadMainImageID;

	@JsonProperty("LeadColourOverride")
	private String leadColourOverride;

	@JsonProperty("DrinkStyle")
	private String drinkStyle;

	@JsonProperty("StoryOrCollection")
	private String storyOrCollection;

	@JsonProperty("Beauty_Key_ingredient")
	private String beautyKeyIngredient;

	@JsonProperty("Beauty_Fragrance_Flavour")
	private String beautyFragranceFlavour;

	@Getter
    @Setter
    @JsonProperty("Beauty_Fragrance_Family")
    private String beautyFragranceFamily;

	@JsonProperty("Awards")
	private String productAwards;
	@JsonProperty("LeadCutoutImageID")
	private String LeadCutoutImageID;

	@JsonProperty("HomeShapes")
	private String shape;

	@JsonProperty("BeautySunProtectionFactor")
	private String beautySunProtectionFactor;

	@JsonProperty("ToeStyle")
	private String toeStyle;

	@JsonProperty("WaistToHemLength")
	private String waistToHemLength;

	@JsonProperty("SkinBenefit")
	private String benefit;

	@JsonProperty("Beauty_Hair_type")
	private String hairtype;


	@JsonProperty("TypeOfAdjustability")
	private String adjustableType;

	@JsonProperty("PartSet")
	private String partSet;

	@JsonProperty("BeautyProductForm")
	private String productTexture;

	@JsonProperty("FlowerType")
	private String flowerType;

	@JsonProperty("FlowerColour")
	private String flowerColour;

	@JsonProperty("GiftType")
	private String giftType;

	@JsonProperty("occasion")
	private String occasion;

	@JsonProperty("TreeHeight")
	private String treeHeight;

	@JsonProperty("PowerSupply")
	private String powerSupply;

	@JsonProperty("LitOrNonLit")
	private String litOrNonLit;

	@JsonProperty("BulbColour")
	private String bulbColour;

	@JsonProperty("Lining")
	private String lining;

	@JsonProperty("Pile")
	private String pile;

	@JsonProperty("Indoor/Outdoor")
	private String indoorOrOutdoor;

	@Getter
	@Setter
	@JsonProperty("OlderYounger")
	private String olderYounger;

    @Setter
    @JsonProperty("PreviewFlag")
    private String previewFlag;

    @XmlTransient
    public String getPreviewFlag() {
        return previewFlag;
    }
    
	@Getter
	@Setter
	@JsonProperty("SterlingMinimumPrice")
	private String sterlingMinimumPrice;

	@Getter
	@Setter
	@JsonProperty("EuroMinimumPrice")
	private String euroMinimumPrice;

  @Getter
  @Setter
  @JsonProperty("CFTOFlag")
  private String CFTOFlag;


  public String getoccasion() {
		return occasion;
	}

	public void setoccasion(String occasion) {
		this.occasion = occasion;
	}

	public String getgiftType() {
		return giftType;
	}

	public void setgiftType(String giftType) {
		this.giftType = giftType;
	}

	public String getflowerType() {
		return flowerType;
	}

	public void setflowerType(String flowerType) {
		this.flowerType = flowerType;
	}

	public String getflowerColour() {
		return flowerColour;
	}

	public void setflowerColour(String flowerColour) {
		this.flowerColour = flowerColour;
	}

	@JsonProperty("SplitByColour")
	private String splitByColour;
	private String colourWayStatus;
	private String pid;

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getColourWayStatus() {
		return colourWayStatus;
	}

	public void setColourWayStatus(String colourWayStatus) {
		this.colourWayStatus = colourWayStatus;
	}

	public String getsplitByColour() {
		return splitByColour;
	}

	public void setsplitByColour(String splitByColour) {
		this.splitByColour = splitByColour;
	}

	@JsonProperty("ColourSwatch")
	private String cSwatch;

	public String getcSwatch() {
		return cSwatch;
	}

	public void setcSwatch(String cSwatch) {
		this.cSwatch = cSwatch;
	}

	public String getProductTexture() {
		return productTexture;
	}

	public void setProductTexture(String productTexture) {
		this.productTexture = productTexture;
	}

	public String getPartSet() {
		return partSet;
	}

	public void setPartSet(String partSet) {
		this.partSet = partSet;
	}

	public String getAdjustableType() {
		return adjustableType;
	}

	public void setAdjustableType(String adjustableType) {
		this.adjustableType = adjustableType;
	}

	public String getHairType() {
		return hairtype;
	}

	public void setHairType(String hairtype) {
		this.hairtype = hairtype;
	}

	public String getBenefit() {
		return benefit;
	}

	public void setBenefit(String benefit) {
		this.benefit = benefit;
	}

	public String getWaistToHemLength() {
		return waistToHemLength;
	}

	public void setWaistToHemLength(String waistToHemLength) {
		this.waistToHemLength = waistToHemLength;
	}

	public String getToeStyle() {
		return toeStyle;
	}

	public void setToeStyle(String toeStyle) {
		this.toeStyle = toeStyle;
	}

	public String getBeautySunProtectionFactor() {
		return beautySunProtectionFactor;
	}

	public void setBeautySunProtectionFactor(String beautySunProtectionFactor) {
		this.beautySunProtectionFactor = beautySunProtectionFactor;
	}

	public String getBeautyFragranceFlavour() {
		return beautyFragranceFlavour;
	}

	public void setBeautyFragranceFlavour(String beautyFragranceFlavour) {
		this.beautyFragranceFlavour = beautyFragranceFlavour;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getproductAwards() {
		return productAwards;
	}

	public void setproductAwards(String productAwards) {
		this.productAwards = productAwards;
	}

	public String getBeautyKeyIngredient() {
		return beautyKeyIngredient;
	}

	public void setBeautyKeyIngredient(String beautyKeyIngredient) {
		this.beautyKeyIngredient = beautyKeyIngredient;
	}

	public String getStoryOrCollection() {
		return storyOrCollection;
	}

	public void setStoryOrCollection(String storyOrCollection) {
		this.storyOrCollection = storyOrCollection;
	}

	public String getDrinkStyle() {
		return drinkStyle;
	}

	public void setDrinkStyle(String drinkStyle) {
		this.drinkStyle = drinkStyle;
	}

	public String getLeadColourOverride() {
		return leadColourOverride;
	}

	public void setLeadColourOverride(String leadColourOverride) {
		this.leadColourOverride = leadColourOverride;
	}

	public String getPlanA() {
		return planA;
	}

	public void setPlanA(String planA) {
		this.planA = planA;
	}

	public String getPrimarySizeIndex() {
		return primarySizeIndex;
	}

	public void setPrimarySizeIndex(String primarySizeIndex) {
		this.primarySizeIndex = primarySizeIndex;
	}

	public String getCustomerFriendlyPrimarySize() {
		return customerFriendlyPrimarySize;
	}

	public void setCustomerFriendlyPrimarySize(String customerFriendlyPrimarySize) {
		this.customerFriendlyPrimarySize = customerFriendlyPrimarySize;
	}

	public String getCustomerFriendlySecondarySize() {
		return customerFriendlySecondarySize;
	}

	public void setCustomerFriendlySecondarySize(String customerFriendlySecondarySize) {
		this.customerFriendlySecondarySize = customerFriendlySecondarySize;
	}

	public String getPrimarySizeRange() {
		return primarySizeRange;
	}

	public void setPrimarySizeRange(String primarySizeRange) {
		this.primarySizeRange = primarySizeRange;
	}

	public String getCustomerFriendlyPrimarySecondarySize() {
		return customerFriendlyPrimarySecondarySize;
	}

	public void setCustomerFriendlyPrimarySecondarySize(String customerFriendlyPrimarySecondarySize) {
		this.customerFriendlyPrimarySecondarySize = customerFriendlyPrimarySecondarySize;
	}

	public String getMasterProductDescription() {
		return masterProductDescription;
	}

	public void setMasterProductDescription(String masterProductDescription) {
		this.masterProductDescription = masterProductDescription;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductDefinition() {
		return productDefinition;
	}

	public void setProductDefinition(String productDefinition) {
		this.productDefinition = productDefinition;
	}

	public String getPlatformProductType() {
		return platformProductType;
	}

	public void setPlatformProductType(String platformProductType) {
		this.platformProductType = platformProductType;
	}

	public String getSkinType() {
		return skinType;
	}

	public void setSkinType(String skinType) {
		this.skinType = skinType;
	}

	public String getDietSuitability() {
		return dietSuitability;
	}

	public void setDietSuitability(String dietSuitability) {
		this.dietSuitability = dietSuitability;
	}

	public String getIcons3() {
		return icons3;
	}

	public void setIcons3(String icons3) {
		this.icons3 = icons3;
	}

	public String getFabric() {
		return fabric;
	}

	public void setFabric(String fabric) {
		this.fabric = fabric;
	}

	public String getiEIntlFlag() {
		return iEIntlFlag;
	}

	public void setiEIntlFlag(String iEIntlFlag) {
		this.iEIntlFlag = iEIntlFlag;
	}

	public String getIcons2() {
		return icons2;
	}

	public void setIcons2(String icons2) {
		this.icons2 = icons2;
	}

	public String getIcons1() {
		return icons1;
	}

	public void setIcons1(String icons1) {
		this.icons1 = icons1;
	}

	public String getProductKeywords() {
		return productKeywords;
	}

	public void setProductKeywords(String productKeywords) {
		this.productKeywords = productKeywords;
	}

	public String getServings() {
		return servings;
	}

	public void setServings(String servings) {
		this.servings = servings;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getImageSetId() {
		return imageSetId;
	}

	public void setImageSetId(String imageSetId) {
		this.imageSetId = imageSetId;
	}

	public String getShapeOrCut() {
		return shapeOrCut;
	}

	public void setShapeOrCut(String shapeOrCut) {
		this.shapeOrCut = shapeOrCut;
	}

	public String getAgeRange() {
		return ageRange;
	}

	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}

	public String getCareInstruction() {
		return careInstruction;
	}

	public void setCareInstruction(String careInstruction) {
		this.careInstruction = careInstruction;
	}

	public String getDesigner() {
		return designer;
	}

	public void setDesigner(String designer) {
		this.designer = designer;
	}

	public String getNeckShape() {
		return neckShape;
	}

	public void setNeckShape(String neckShape) {
		this.neckShape = neckShape;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getWiredOrNonWired() {
		return wiredOrNonWired;
	}

	public void setWiredOrNonWired(String wiredOrNonWired) {
		this.wiredOrNonWired = wiredOrNonWired;
	}

	public String getFabricType() {
		return fabricType;
	}

	public void setFabricType(String fabricType) {
		this.fabricType = fabricType;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getFit() {
		return fit;
	}

	public void setFit(String fit) {
		this.fit = fit;
	}

	public String getuPC() {
		return uPC;
	}

	public void setuPC(String uPC) {
		this.uPC = uPC;
	}

	public String getColourGroup() {
		return colourGroup;
	}

	public void setColourGroup(String colourGroup) {
		this.colourGroup = colourGroup;
	}

	public String getFastening() {
		return fastening;
	}

	public void setFastening(String fastening) {
		this.fastening = fastening;
	}

	public String getFurnitureAssemblyType() {
		return furnitureAssemblyType;
	}

	public void setFurnitureAssemblyType(String furnitureAssemblyType) {
		this.furnitureAssemblyType = furnitureAssemblyType;
	}

	public String getProductLength() {
		return productLength;
	}

	public void setProductLength(String productLength) {
		this.productLength = productLength;
	}

	public String getEcomExclusive() {
		return ecomExclusive;
	}

	public void setEcomExclusive(String ecomExclusive) {
		this.ecomExclusive = ecomExclusive;
	}

	public String getColourExactCopy() {
		return colourExactCopy;
	}

	public void setColourExactCopy(String colourExactCopy) {
		this.colourExactCopy = colourExactCopy;
	}

	public String getPrimarySizeDescriptionCopy() {
		return primarySizeDescriptionCopy;
	}

	public void setPrimarySizeDescriptionCopy(String primarySizeDescriptionCopy) {
		this.primarySizeDescriptionCopy = primarySizeDescriptionCopy;
	}

	public String getSuitabilityCategory() {
		return suitabilityCategory;
	}

	public void setSuitabilityCategory(String suitabilityCategory) {
		this.suitabilityCategory = suitabilityCategory;
	}

	public String getSpecialColour() {
		return specialColour;
	}

	public void setSpecialColour(String specialColour) {
		this.specialColour = specialColour;
	}

	public String getCollarType() {
		return collarType;
	}

	public void setCollarType(String collarType) {
		this.collarType = collarType;
	}

	public String getCuffs() {
		return cuffs;
	}

	public void setCuffs(String cuffs) {
		this.cuffs = cuffs;
	}

	public String getDenier() {
		return denier;
	}

	public void setDenier(String denier) {
		this.denier = denier;
	}

	public String getHeelType() {
		return heelType;
	}

	public void setHeelType(String heelType) {
		this.heelType = heelType;
	}

	public String getHeelHeightGroup() {
		return heelHeightGroup;
	}

	public void setHeelHeightGroup(String heelHeightGroup) {
		this.heelHeightGroup = heelHeightGroup;
	}

	public String getPaddedOrNonPadded() {
		return paddedOrNonPadded;
	}

	public void setPaddedOrNonPadded(String paddedOrNonPadded) {
		this.paddedOrNonPadded = paddedOrNonPadded;
	}

	public String getSleeveLength() {
		return sleeveLength;
	}

	public void setSleeveLength(String sleeveLength) {
		this.sleeveLength = sleeveLength;
	}

	public String getHomeFeature1() {
		return homeFeature1;
	}

	public void setHomeFeature1(String homeFeature1) {
		this.homeFeature1 = homeFeature1;
	}

	public String getWaistbandType() {
		return waistbandType;
	}

	public void setWaistbandType(String waistbandType) {
		this.waistbandType = waistbandType;
	}

	public String getWineTaste() {
		return wineTaste;
	}

	public void setWineTaste(String wineTaste) {
		this.wineTaste = wineTaste;
	}

	public String getWineCountryOfOrigin() {
		return wineCountryOfOrigin;
	}

	public void setWineCountryOfOrigin(String wineCountryOfOrigin) {
		this.wineCountryOfOrigin = wineCountryOfOrigin;
	}

	public String getGrapeVariety() {
		return grapeVariety;
	}

	public void setGrapeVariety(String grapeVariety) {
		this.grapeVariety = grapeVariety;
	}

	public String getGoesWellWith() {
		return goesWellWith;
	}

	public void setGoesWellWith(String goesWellWith) {
		this.goesWellWith = goesWellWith;
	}

	public String getAlcoholContent() {
		return alcoholContent;
	}

	public void setAlcoholContent(String alcoholContent) {
		this.alcoholContent = alcoholContent;
	}

	public String getPreparationRequired() {
		return preparationRequired;
	}

	public void setPreparationRequired(String preparationRequired) {
		this.preparationRequired = preparationRequired;
	}

	public String getMainIngredient() {
		return mainIngredient;
	}

	public void setMainIngredient(String mainIngredient) {
		this.mainIngredient = mainIngredient;
	}

	public String getHomeFeature2() {
		return homeFeature2;
	}

	public void setHomeFeature2(String homeFeature2) {
		this.homeFeature2 = homeFeature2;
	}

	public String getHomeFillingType() {
		return homeFillingType;
	}

	public void setHomeFillingType(String homeFillingType) {
		this.homeFillingType = homeFillingType;
	}

	public String getHomeFilledBeddingSeason() {
		return homeFilledBeddingSeason;
	}

	public void setHomeFilledBeddingSeason(String homeFilledBeddingSeason) {
		this.homeFilledBeddingSeason = homeFilledBeddingSeason;
	}

	public String getFurnitureCollection() {
		return furnitureCollection;
	}

	public void setFurnitureCollection(String furnitureCollection) {
		this.furnitureCollection = furnitureCollection;
	}

	public String getFillingType() {
		return fillingType;
	}

	public void setFillingType(String fillingType) {
		this.fillingType = fillingType;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public String getTog() {
		return tog;
	}

	public void setTog(String tog) {
		this.tog = tog;
	}

	public String getHomeGSMWeight() {
		return homeGSMWeight;
	}

	public void setHomeGSMWeight(String homeGSMWeight) {
		this.homeGSMWeight = homeGSMWeight;
	}

	public String getHomeLongevity() {
		return homeLongevity;
	}

	public void setHomeLongevity(String homeLongevity) {
		this.homeLongevity = homeLongevity;
	}

	public String getHomeOccasion() {
		return homeOccasion;
	}

	public void setHomeOccasion(String homeOccasion) {
		this.homeOccasion = homeOccasion;
	}

	public String getHomeScentFragrance() {
		return homeScentFragrance;
	}

	public void setHomeScentFragrance(String homeScentFragrance) {
		this.homeScentFragrance = homeScentFragrance;
	}

	public String getHomeSize() {
		return homeSize;
	}

	public void setHomeSize(String homeSize) {
		this.homeSize = homeSize;
	}

	public String getHomeStyle() {
		return homeStyle;
	}

	public void setHomeStyle(String homeStyle) {
		this.homeStyle = homeStyle;
	}

	public String getThreadCount() {
		return threadCount;
	}

	public void setThreadCount(String threadCount) {
		this.threadCount = threadCount;
	}

	public String getHomeVolumeCapacity() {
		return homeVolumeCapacity;
	}

	public void setHomeVolumeCapacity(String homeVolumeCapacity) {
		this.homeVolumeCapacity = homeVolumeCapacity;
	}

	public String getOnOrOffWaist() {
		return onOrOffWaist;
	}

	public void setOnOrOffWaist(String onOrOffWaist) {
		this.onOrOffWaist = onOrOffWaist;
	}

	public String getCustomerFacingCharacterName() {
		return customerFacingCharacterName;
	}

	public void setCustomerFacingCharacterName(String customerFacingCharacterName) {
		this.customerFacingCharacterName = customerFacingCharacterName;
	}

	public String getFeaturedOnTVAdvertised() {
		return featuredOnTVAdvertised;
	}

	public void setFeaturedOnTVAdvertised(String featuredOnTVAdvertised) {
		this.featuredOnTVAdvertised = featuredOnTVAdvertised;
	}

	public String getFinish() {
		return finish;
	}

	public void setFinish(String finish) {
		this.finish = finish;
	}

	public String getVolumeCapacity() {
		return volumeCapacity;
	}

	public void setVolumeCapacity(String volumeCapacity) {
		this.volumeCapacity = volumeCapacity;
	}

	public String getWash() {
		return wash;
	}

	public void setWash(String wash) {
		this.wash = wash;
	}

	public String getIcons4() {
		return icons4;
	}

	public void setIcons4(String icons4) {
		this.icons4 = icons4;
	}

	public String getIcons5() {
		return icons5;
	}

	public void setIcons5(String icons5) {
		this.icons5 = icons5;
	}

	public String getIcons6() {
		return icons6;
	}

	public void setIcons6(String icons6) {
		this.icons6 = icons6;
	}

	public String getBeautyProductFinish() {
		return beautyProductFinish;
	}

	public void setBeautyProductFinish(String beautyProductFinish) {
		this.beautyProductFinish = beautyProductFinish;
	}

	public String getControl() {
		return control;
	}

	public void setControl(String control) {
		this.control = control;
	}

	public String getMultipacks() {
		return multipacks;
	}

	public void setMultipacks(String multipacks) {
		this.multipacks = multipacks;
	}

	public String getLeadColour() {
		return leadColour;
	}

	public void setLeadColour(String leadColour) {
		this.leadColour = leadColour;
	}

	public String getRecipient() {
		return recipient;
	}

	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}

	public String getMultiPackQuantity() {
		return multiPackQuantity;
	}

	public void setMultiPackQuantity(String multiPackQuantity) {
		this.multiPackQuantity = multiPackQuantity;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getLeadMainImageID() {
		return leadMainImageID;
	}

	public void setLeadMainImageID(String leadMainImageID) {
		this.leadMainImageID = leadMainImageID;
	}

	public String getLeadCutoutImageID() {
		return LeadCutoutImageID;
	}

	public void setLeadCutoutImageID(String LeadCutoutImageID) {
		this.LeadCutoutImageID = LeadCutoutImageID;
	}

	public String getTreeHeight() {
		return treeHeight;
	}

	public void setTreeHeight(String treeHeight) {
		this.treeHeight = treeHeight;
	}

	public String getPowerSupply() {
		return powerSupply;
	}

	public void setPowerSupply(String powerSupply) {
		this.powerSupply = powerSupply;
	}

	public String getLitOrNonLit() {
		return litOrNonLit;
	}

	public void setLitOrNonLit(String litOrNonLit) {
		this.litOrNonLit = litOrNonLit;
	}

	public String getBulbColour() {
		return bulbColour;
	}

	public void setBulbColour(String bulbColour) {
		this.bulbColour = bulbColour;
	}

	public String getLining() {
		return lining;
	}

	public void setLining(String lining) {
		this.lining = lining;
	}

	public String getPile() {
		return pile;
	}

	public void setPile(String pile) {
		this.pile = pile;
	}

	public String getIndoorOrOutdoor() {
		return indoorOrOutdoor;
	}

	public void setIndoorOrOutdoor(String indoorOrOutdoor) {
		this.indoorOrOutdoor = indoorOrOutdoor;
	}

	@Getter
	@Setter
	@JsonProperty("ProductMinimumSize_CatchWeight")
	private String productMinimumSizeCatchWeight;

	@Getter
	@Setter
	@JsonProperty("ProductMaximumSize_CatchWeight")
	private String productMaximumSizeCatchWeight;

	@Getter
	@Setter
	@JsonProperty("Weight")
	private String weight;

	@Getter
	@Setter
	@JsonProperty("IS_CFTO_XMAS_COLLECTION_ONLY")
	private String christmasOnly;

	public boolean hasValidUPC() {
		if (this.getuPC() == null) {
			return false;
		}
		if(this.getuPC().isEmpty()) {
			return false;
		}
		return true;
	}

  @JsonProperty("LaunchDateCopy")
  private String launchDateCopy;

  public void setLaunchDateCopy(String launchDateCopy){
    this.launchDateCopy = launchDateCopy;
  }


  public String getLaunchDateCopy(){
    return launchDateCopy;
  }

}
