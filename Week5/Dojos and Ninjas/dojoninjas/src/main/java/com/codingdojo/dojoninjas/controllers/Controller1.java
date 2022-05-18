package com.codingdojo.dojoninjas.controllers;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojoninjas.models.Dojo;
import com.codingdojo.dojoninjas.models.Ninja;
import com.codingdojo.dojoninjas.services.DojoService;
import com.codingdojo.dojoninjas.services.NinjaService;

@Controller
public class Controller1 {

	// can use ninjas and dojos in any of the methods
@Autowired
private NinjaService ninjas;
@Autowired
private DojoService dojos;
	

	// Get Methods   -get from files
	// how to add anything to jsp files? A: Models

	@GetMapping("/dojos/new")
	public String newDojoForm(@ModelAttribute("dojo") Dojo dojo) {
		
		return "newDojo.jsp";
	}
	
	@GetMapping("/ninjas/new")
	public String newNinjaForm(@ModelAttribute("ninja") Ninja ninja, Model model) {
		// "dojos" after addAttribute is what your passing and can used in forEach items= "${dojos}" in jsp file
		model.addAttribute("dojos", dojos.getAllDojos());
		// above is so the new ninja page can list all the dojos
		return "newNinja.jsp";
	}
	
	@GetMapping("/dojos/{id}")
	public String showDojo(@PathVariable("id") Long id, Model model) {
		Dojo dojo = dojos.find(id);
		model.addAttribute("dojo", dojo);
		
		return "allNinjas.jsp";
	}
	
	// Post Methods   -post to database usually
	
	@PostMapping("/dojos")
	public String createDojo(@ModelAttribute("dojo") Dojo dojo) {
		
		Dojo newDojo = dojos.make(dojo);
		
		return String.format("redirect:/dojos/%s",newDojo.getId());
	}
	
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult results){
		if(results.hasErrors()) {
			return "newNinja.jsp";
		}
		ninja = ninjas.make(ninja);
		
		return "redirect:/dojos/" + ninja.getDojo().getId();
	}
	
	// Put mapping usually for editing pages-edits&posts
	// for delete use @DeleteMapping
}