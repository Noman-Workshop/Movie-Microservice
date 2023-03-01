package com.cineplex.moviecatalog.catalog.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class RatingsDto {
	
	private String movieId;
	private String userId;
	private int rating;
}
