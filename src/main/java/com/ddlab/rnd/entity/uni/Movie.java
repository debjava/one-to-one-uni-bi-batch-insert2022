package com.ddlab.rnd.entity.uni;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Movie")
@Table(name = "movie")
@Getter @Setter
public class Movie {
	
	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<StarCast> starCasts = new HashSet<>();

}
