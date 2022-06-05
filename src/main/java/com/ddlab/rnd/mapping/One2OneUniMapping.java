package com.ddlab.rnd.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ddlab.rnd.entity.uni.Cover;
import com.ddlab.rnd.entity.uni.Husband;
import com.ddlab.rnd.entity.uni.Mobile;
import com.ddlab.rnd.entity.uni.Wife;
import com.ddlab.rnd.service.One2OneUniService;

@Component
public class One2OneUniMapping {
	
	@Autowired
	private One2OneUniService service;
	
	public void save() {
		Husband husband = new Husband();
		husband.setName("John");
		Wife wife = new Wife();
		wife.setName("Nilofer");
		wife.setHusband(husband);
		husband.setWife(wife);
		
		service.saveHusband(husband);
	}
	
	public void save11() {
		Mobile mobile = new Mobile();
		mobile.setName("Samsung Mobile");
		Cover cover = new Cover();
		cover.setName("Sony Cover");
		mobile.setCover(cover);
		
		service.saveMobile(mobile);
	}
}
