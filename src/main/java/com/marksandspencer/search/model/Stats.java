/**
 * 
 */
package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author 1574935
 *
 */
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Stats {
	@JsonProperty("recommendedCount")
	private String recommendedCount;

	@JsonProperty("averageOverallRating")
	private String averageOverallRating;

	@JsonProperty("totalReviewCount")
	private String totalReviewCount;

	public String getRecommendedCount() {
		return recommendedCount;
	}

	public void setRecommendedCount(String recommendedCount) {
		this.recommendedCount = recommendedCount;
	}

	public String getAverageOverallRating() {
		return averageOverallRating;
	}

	public void setAverageOverallRating(String averageOverallRating) {
		this.averageOverallRating = averageOverallRating;
	}

	public String getTotalReviewCount() {
		return totalReviewCount;
	}

	public void setTotalReviewCount(String totalReviewCount) {
		this.totalReviewCount = totalReviewCount;
	}

}
