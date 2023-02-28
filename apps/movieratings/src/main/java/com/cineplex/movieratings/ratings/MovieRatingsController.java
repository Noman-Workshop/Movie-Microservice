package com.cineplex.movieratings.ratings;

import com.cineplex.movieratings.ratings.dto.RatingsDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping ("/ratings")
public class MovieRatingsController {
	
	@RequestMapping ("/{movieId}")
	public List<RatingsDto> getMovieRating(@PathVariable String movieId) {
		return Stream.of(
				new RatingsDto(movieId, 4),
				new RatingsDto(movieId, 5)
		).collect(Collectors.toList());
	}
}
