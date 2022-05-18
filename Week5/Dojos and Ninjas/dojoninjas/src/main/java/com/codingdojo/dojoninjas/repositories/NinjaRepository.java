package com.codingdojo.dojoninjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;

public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	
	// we can use findAll() & findAllByDojo because we extend CrudRepository
	List<Ninja> findAll();
	
	List<Ninja> findAllByDojo(Dojo dojo);
	
	
}