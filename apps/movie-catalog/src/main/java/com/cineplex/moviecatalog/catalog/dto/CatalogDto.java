package com.cineplex.moviecatalog.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDto {
	
	private String movieId;
	private String name;
	private String description;
	private int rating;
	private String playlist;
}
