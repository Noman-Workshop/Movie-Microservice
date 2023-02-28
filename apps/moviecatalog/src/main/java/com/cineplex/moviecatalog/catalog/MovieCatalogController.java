package com.cineplex.moviecatalog.catalog;

import com.cineplex.moviecatalog.catalog.dto.CatalogDto;
import com.cineplex.moviecatalog.catalog.dto.MovieDto;
import com.cineplex.moviecatalog.catalog.services.external.MovieCatalogService;
import com.cineplex.moviecatalog.catalog.services.external.MovieInfoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping ("/catalog")
@AllArgsConstructor
public class MovieCatalogController {
	
	private final MovieCatalogService movieCatalogService;
	private final MovieInfoService movieInfoService;
	
	@GetMapping ("/{userId}")
	public List<CatalogDto> getCatalog(@PathVariable String userId) {
		
		var userCatalog = movieCatalogService.getCatalog(userId);
		var catalogDto = userCatalog.stream()
		                            .map(catalog -> {
			                            MovieDto movieInfo = movieInfoService.getMovieInfo(catalog.getMovieId());
			                            return new CatalogDto(movieInfo.getId(),
			                                                  movieInfo.getName(),
			                                                  movieInfo.getDescription(),
			                                                  catalog.getPlaylist());
		                            });
		return catalogDto.collect(Collectors.toList());
	}
	
}
