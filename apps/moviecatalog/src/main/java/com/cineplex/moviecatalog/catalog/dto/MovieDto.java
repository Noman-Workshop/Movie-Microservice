package com.cineplex.moviecatalog.catalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MovieDto {

	private String id;
	private String name;
	private String description;
}
