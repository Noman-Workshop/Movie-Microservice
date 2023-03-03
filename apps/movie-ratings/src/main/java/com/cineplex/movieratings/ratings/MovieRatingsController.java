package com.cineplex.movieratings.ratings;

import com.cineplex.movieratings.ratings.dto.RatingsDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/ratings")
public class MovieRatingsController {
	
	@RequestMapping ("/{userId}/{movieId}")
	public RatingsDto getMovieRating(@PathVariable String userId, @PathVariable String movieId) {
		return new RatingsDto(movieId, userId, 4);
	}
}
