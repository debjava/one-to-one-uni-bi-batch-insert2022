package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.uni.Mobile;

@Repository
public interface One2OneUniRepository extends CrudRepository<Mobile, Long>{

}
