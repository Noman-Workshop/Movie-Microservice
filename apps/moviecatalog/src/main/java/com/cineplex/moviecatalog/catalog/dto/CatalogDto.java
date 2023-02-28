package com.cineplex.moviecatalog.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogDto {
	
	private String name;
	private String description;
	private int rating;
}
