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
public class ProductLevelPromotion {
	
	@JsonProperty("shortDesc")
	private String shortDesc;
	
	@JsonProperty("adminsDesc")
	private String adminsDesc;
	
	@JsonProperty("displayLevel")
	private Integer displayLevel;
	

	public String getAdminsDesc() {
		return adminsDesc;
	}

	public void setAdminsDesc(String adminsDesc) {
		this.adminsDesc = adminsDesc;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}
	
	public Integer getdisplayLevel() {
		return displayLevel;
	}

	public void setdisplayLevel(Integer displayLevel) {
		this.displayLevel = displayLevel;
	}

	
}
