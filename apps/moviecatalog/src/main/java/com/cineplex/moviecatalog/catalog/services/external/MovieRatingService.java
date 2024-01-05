package com.cineplex.moviecatalog.catalog.services.external;

import com.cineplex.moviecatalog.catalog.dto.RatingsDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "movie-ratings")
public interface MovieRatingService {
	
	@GetMapping ("/ratings/{userId}/{movieId}")
	RatingsDto getMovieRating(@PathVariable String userId, @PathVariable String movieId);
}
