package com.codingdojo.bookclub2.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.bookclub2.models.Book;
import com.codingdojo.bookclub2.models.LoginUser;
import com.codingdojo.bookclub2.models.User;
import com.codingdojo.bookclub2.services.BookService;
import com.codingdojo.bookclub2.services.UserService;

@Controller
public class Controller1 {

@Autowired
private UserService userService;
@Autowired
private BookService bookService;


	
	@GetMapping("/")
	public String index(
			@ModelAttribute("newUser") User user, 
			@ModelAttribute("newLogin") LoginUser loginUser) {
		return "loginRegistration.jsp";
	}
	
	// register a user
	@PostMapping("/registration")
	// valid checks for validations in entity
	public String registerUser(@Valid @ModelAttribute("newUser") User user,
			BindingResult result, HttpSession session,
			@ModelAttribute("newLogin") LoginUser loginUser) {
		// validate user
		userService.validate(user, result);
		if(result.hasErrors()) {
			return "loginRegistration.jsp";
		}
		// Register User
		userService.registerUser(user);
		// put User in Session
		session.setAttribute("loggedInUser", user);
		return "redirect:/dashboard";
	}
	
	
	
	// Login
	@PostMapping("/login")
	public String loginUser(@Valid @ModelAttribute("newLogin") LoginUser loginuser,
			BindingResult results, HttpSession session, @ModelAttribute("newUser") User user) {
		// authenticate
		userService.authenticateUser(loginuser, results);
		if(results.hasErrors()) {
			return "loginRegistration.jsp";
		}
		User loggedInUser=userService.findByEmail(loginuser.getEmail());
		// put user in session
		session.setAttribute("loggedInUser", loggedInUser);
		return "redirect:/dashboard";
	}
	
	
	
	//Logout
	@GetMapping("/logout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	
	
	@GetMapping("/dashboard")
	public String dashboard(HttpSession session, Model bookModel) {
		//Check if user is in session
		if(session.getAttribute("loggedInUser")!=null) {
			bookModel.addAttribute("books", bookService.allBooks());
		return "mainPage.jsp";
	}
	else {
		return "redirect:/";
	}	
}
	
	
	
	
	// new book
	@GetMapping("/new")
	public String newBook(HttpSession session, @ModelAttribute("newBook") Book book) {
		
		if(session.getAttribute("loggedInUser")!=null) {
			return "newBook.jsp";
		}
		else {
			return "redirect;/";
		}
		
	}
	
	
	// create book
	@PostMapping("/books/create")
	public String CreateBook(@Valid @ModelAttribute("newBook") Book book, BindingResult results) {
		if(results.hasErrors()) {
			return "newBook.jsp";
		}
		else {
			bookService.createBook(book);
			return "redirect:/dashboard";
		}
	}
	
	
	// Book Details
	@GetMapping("/books/bookDetails/{id}")
	public String bookDetails(@PathVariable Long id, Model bookModel, HttpSession session) {
		if(session.getAttribute("loggedInUser")!=null) {
			Book book=bookService.getOneBook(id);
			bookModel.addAttribute("book", book);
			return "viewBook.jsp";
			
		}
		else {
			return "redirect:/";
		}

	}
	
	
	
	
	
	
	
}
