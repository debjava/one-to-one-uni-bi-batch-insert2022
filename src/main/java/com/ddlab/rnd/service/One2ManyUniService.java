package com.ddlab.rnd.service;

import java.util.List;

import com.ddlab.rnd.entity.uni.Movie;

public interface One2ManyUniService {

	void saveAllMovies(List<Movie> movies);
}
