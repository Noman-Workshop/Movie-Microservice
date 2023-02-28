package com.cineplex.movieinfo.movies;

import com.cineplex.movieinfo.movies.dto.MovieDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/movies")
public class MovieInfoController {
	
	@RequestMapping ("/{id}")
	public MovieDto getMovieInfo(@PathVariable ("id") String id) {
		return new MovieDto(id, "Transformers");
	}
}
