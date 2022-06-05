package com.ddlab.rnd.entity.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "StarCast")
@Table(name = "starcast")
@Getter @Setter
public class StarCast {

	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
}
