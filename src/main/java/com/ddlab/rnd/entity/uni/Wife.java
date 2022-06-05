package com.ddlab.rnd.entity.uni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity(name = "Wife") @Table(name = "wife")
@Getter @Setter
public class Wife {

	@Id @GeneratedValue
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(mappedBy = "wife") // For Bidirectional
	private Husband husband;
	
}
