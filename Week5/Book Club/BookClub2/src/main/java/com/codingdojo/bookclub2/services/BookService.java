package com.codingdojo.bookclub2.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.bookclub2.models.Book;
import com.codingdojo.bookclub2.repositories.BookRepository;

@Service
public class BookService {

@Autowired
private BookRepository bookRepo;

	// List All Books
	public List<Book> allBooks(){
		return bookRepo.findAll();
	}
	
	// Create a Book
	public Book createBook(Book book) {
		return bookRepo.save(book);
	}
	
	// Get One book descrip
	public Book getOneBook(Long id) {
		return bookRepo.findById(id).orElse(null);
	}
	
	
	
	
	
	
	
	
}
