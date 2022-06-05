package com.ddlab.rnd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ddlab.rnd.entity.uni.Husband;
import com.ddlab.rnd.entity.uni.Mobile;
import com.ddlab.rnd.repository.One2OneUniHusbandRepo;
import com.ddlab.rnd.repository.One2OneUniRepository;
import com.ddlab.rnd.service.One2OneUniService;

@Service
public class One2OneUniServiceImpl implements One2OneUniService {
	
	@Autowired
	private One2OneUniRepository uniRepo;
	
	@Autowired
	private One2OneUniHusbandRepo husRepo;
	

	@Override
	public void saveMobile(Mobile mobile) {
		uniRepo.save(mobile);
	}


	@Override
	public void saveHusband(Husband husband) {
		husRepo.save(husband);
		
	}

}
