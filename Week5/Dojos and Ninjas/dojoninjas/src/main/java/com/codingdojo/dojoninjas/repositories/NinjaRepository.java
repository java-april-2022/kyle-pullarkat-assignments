package com.codingdojo.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	List<Ninja> findAll();
	List<Ninja> findAllByDojo(Dojo dojo);
}