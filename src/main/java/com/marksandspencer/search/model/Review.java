package com.marksandspencer.search.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)

public class Review {
	
		private Stats stats;
		public Stats getStats() {
			return stats;
		}
		public void setStats(Stats stats) {
			this.stats = stats;
		}
	
	
}
