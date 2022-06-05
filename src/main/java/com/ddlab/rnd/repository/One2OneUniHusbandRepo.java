package com.ddlab.rnd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ddlab.rnd.entity.uni.Husband;

@Repository
public interface One2OneUniHusbandRepo extends CrudRepository<Husband, Long>{

}
