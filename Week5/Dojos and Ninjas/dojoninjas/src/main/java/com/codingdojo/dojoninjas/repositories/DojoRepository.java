package com.codingdojo.dojoninjas.repositories;


import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.dojoninjas.models.Dojo;

public interface DojoRepository extends CrudRepository<Dojo, Long> {

	List<Dojo> findAll();
}