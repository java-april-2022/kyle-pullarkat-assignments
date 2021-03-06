package com.codingdojo.bookclub2.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.bookclub2.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findAll();

}
