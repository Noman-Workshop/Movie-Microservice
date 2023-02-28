package com.cineplex.moviecatalog.catalog;

import com.cineplex.moviecatalog.catalog.dto.CatalogDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping ("/catalog")
public class MovieCatalogController {
	
	@GetMapping ("/{userId}")
	public List<CatalogDto> getCatalog(@PathVariable String userId) {
		return Stream.of(new CatalogDto("Transformers", "Transformers movie", 4),
		                 new CatalogDto("Avenge", "Avengers movie", 5))
		             .collect(Collectors.toList());
	}
	
}
