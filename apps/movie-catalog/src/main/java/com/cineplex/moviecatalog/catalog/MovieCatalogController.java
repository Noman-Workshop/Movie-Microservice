package com.cineplex.moviecatalog.catalog;

import com.cineplex.moviecatalog.catalog.dto.CatalogDto;
import com.cineplex.moviecatalog.catalog.dto.MovieDto;
import com.cineplex.moviecatalog.catalog.dto.RatingsDto;
import com.cineplex.moviecatalog.catalog.dto.UserMovieCatalogDto;
import com.cineplex.moviecatalog.catalog.services.MovieCatalogService;
import com.cineplex.moviecatalog.catalog.services.external.MovieInfoService;
import com.cineplex.moviecatalog.catalog.services.external.MovieRatingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;


@RestController
@RequestMapping ("/catalog")
@AllArgsConstructor
public class MovieCatalogController {
	
	private final MovieCatalogService movieCatalogService;
	private final MovieInfoService movieInfoService;
	
	private final MovieRatingService movieRatingService;
	
	@GetMapping ("/{userId}")
	public UserMovieCatalogDto getCatalog(@PathVariable String userId) {
		
		var userCatalog = movieCatalogService.getCatalog(userId);
		var catalogDto = userCatalog.stream()
		                            .map(catalog -> {
			                            MovieDto movieInfo = movieInfoService.getMovieInfo(catalog.getMovieId());
			                            RatingsDto movieRating = movieRatingService.getMovieRating(userId,
			                                                                                       catalog.getMovieId());
			                            return CatalogDto.builder()
			                                             .movieId(catalog.getMovieId())
			                                             .name(movieInfo.getName())
			                                             .description(movieInfo.getDescription())
			                                             .rating(movieRating.getRating())
			                                             .playlist(catalog.getPlaylist())
			                                             .build();
		                            })
		                            .collect(Collectors.toList());
		
		return UserMovieCatalogDto.builder()
		                          .userId(userId)
		                          .catalog(catalogDto)
		                          .build();
	}
	
}
