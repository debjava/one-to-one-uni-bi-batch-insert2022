package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.uni.Movie;

@Repository
public interface One2ManyUniRepository extends CrudRepository<Movie, Long> {

}
