package com.codingdojo.bookclub2.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import com.codingdojo.bookclub2.models.LoginUser;
import com.codingdojo.bookclub2.models.User;
import com.codingdojo.bookclub2.repositories.UserRepository;

@Service
public class UserService {
	
@Autowired //injection
private UserRepository userRepo;

	// Validate user , look for duplicate email and password mismatch
	public void validate(User newUser, Errors errors) {
		// checks for password mismatch
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			errors.rejectValue("password", "Mismatch", "Password does not match!");
		}
		// checks for email duplication
		if(userRepo.findByEmail(newUser.getEmail())!=null) {
			errors.rejectValue("email", "unique", "Email is already taken!");
		}
		
	}
	
	

	// Hash users password and add to database
	public User registerUser(User newUser) {
		String hashedPass=BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashedPass);
		userRepo.save(newUser);
		return null;
	}
	
	// find user by email
	public User findByEmail(String email) {
		return userRepo.findByEmail(email);
	}
	
	// find user by id
	public User findById(Long id) {
		return userRepo.findById(id).orElse(null);
	}
	
	// Authenticate user-- for login portion
	public boolean authenticateUser(LoginUser newLogin, Errors errors) {
		
		User user= userRepo.findByEmail(newLogin.getEmail());
		if(user==null) {
			errors.rejectValue("email", "missingEmail","Email not found!");
			return false;
		}else {
			if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())){
				errors.rejectValue("password", "Matches", "Invalid Password!");
				return false;
			}
			
		}
		
		// if user is found check if passowds match, return true , else retuen false
		return true;
	}
	
	
	
	

}
