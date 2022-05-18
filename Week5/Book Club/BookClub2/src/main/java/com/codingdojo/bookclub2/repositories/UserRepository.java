package com.codingdojo.bookclub2.repositories;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.bookclub2.models.User;

public interface UserRepository extends CrudRepository<User, Long>{
	
	User findByEmail(String email);

}
