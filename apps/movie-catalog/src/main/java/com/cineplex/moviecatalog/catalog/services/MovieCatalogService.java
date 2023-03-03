package com.cineplex.moviecatalog.catalog.services;

import com.cineplex.moviecatalog.catalog.Catalog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class MovieCatalogService {
	
	public List<Catalog> getCatalog(String userId) {
		
		return Stream.of(new Catalog("t15", "Favorite"),
		                 new Catalog("a1", "Watched"))
		             .collect(Collectors.toList());
	}
	
}
