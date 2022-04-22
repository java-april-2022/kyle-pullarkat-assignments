package com.codingdojo.fruityloops.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.fruityloops.models.item;

@Controller
public class controller {
	
	@RequestMapping("")
	public String index(Model model) {
		
		// adds all items
        ArrayList<item> fruits = new ArrayList<item>();
        fruits.add(new item("Kiwi", 1.5));
        fruits.add(new item("Mango", 2.0));
        fruits.add(new item("Goji Berries", 4.0));
        fruits.add(new item("Guava", .75));
        
        
        model.addAttribute("fruits", fruits);
		// returns to hmtl page
		return "index.jsp";
	}
}