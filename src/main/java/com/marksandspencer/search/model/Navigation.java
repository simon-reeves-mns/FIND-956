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
public class Navigation {

	private List<CategoryNode> categoryList;
	private String seoURL;

	private String error;
	private String status;
	private String statusCode;

	public String getSeoURL() {
		return seoURL;
	}

	public void setSeoURL(String seoURL) {
		this.seoURL = seoURL;
	}

	public List<CategoryNode> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(List<CategoryNode> categoryList) {
		this.categoryList = categoryList;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

}
