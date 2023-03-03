package com.cineplex.movieratings.ratings.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RatingsDto {
	
	private String movieId;
	private String userId;
	private int rating;
}
