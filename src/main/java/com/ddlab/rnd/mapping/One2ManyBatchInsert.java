package com.ddlab.rnd.mapping;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.uni.Movie;
import com.ddlab.rnd.entity.uni.StarCast;
import com.ddlab.rnd.service.One2ManyUniService;

@Component
public class One2ManyBatchInsert {
	
	@Autowired
	private One2ManyUniService service;

	public void save() {
		Instant start = Instant.now();
		
		List<Movie> movieList = new ArrayList<>();
		for(int i = 0; i < 100; i++) {
			Movie movie = new Movie();
			movie.setName("Movie Name "+(i+1));
			
			for(int j = 0; j < 5; j++) {
				StarCast cast = new StarCast();
				cast.setName("Cast Name "+ (j+1));
				movie.getStarCasts().add(cast);
			}
			movieList.add(movie);
		}
		service.saveAllMovies(movieList);
		
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
		
		// Without Batch Insert - 551 milliseconds
		// With Batch Insert - 518 milliseconds

	}
}
