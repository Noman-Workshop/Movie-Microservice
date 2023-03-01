package com.cineplex.moviecatalog.catalog.services.external;

import com.cineplex.moviecatalog.catalog.dto.MovieDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "movie-info")
public interface MovieInfoService {
	
	@GetMapping ("/movies/{movieId}")
	MovieDto getMovieInfo(@PathVariable String movieId);
}
