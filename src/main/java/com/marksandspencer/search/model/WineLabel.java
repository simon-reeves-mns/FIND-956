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

public class WineLabel {
	
	@JsonProperty("collectindays")
	private String collectindays;	
	
	@JsonProperty("wineAwardUrl")
	private String wineAwardUrl;
	
	@JsonProperty("wineAwardAltText")
	private String wineAwardAltText;
	
    private String statusCode;	

	
	public String getCollectInDays() {
		return collectindays;
	}

	public void setCollectInDays(String collectindays) {
		this.collectindays = collectindays;
	}
	
	public String getWineAwardAltText() {
		return wineAwardAltText;
	}

	public void setWineAwardAltText(String wineAwardAltText) {
		this.wineAwardAltText = wineAwardAltText;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getWineAwardUrl() {
		return wineAwardUrl;
	}

	public void setWineAwardUrl(String wineAwardUrl) {
		this.wineAwardUrl = wineAwardUrl;
	}
	
	
}
