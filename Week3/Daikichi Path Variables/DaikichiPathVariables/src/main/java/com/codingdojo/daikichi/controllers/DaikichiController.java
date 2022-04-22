package com.codingdojo.daikichi.controllers;

//imports
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//allows to use request mapping
@RestController
//all routes below start with /daikichi
@RequestMapping("/daikichi")
public class DaikichiController {

	@RequestMapping("")
	public String daikichi() {
		return "Testing";
	}
	
		// @path variable is so it recognizes city in line 27
		// tells u your going to travel to the city you input
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable String city) {
		return "Congratulations! You will soon travel to " + city;
	}
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable int number) {
		// if even
		if (number % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers.";
		}
		// else/if odd
		else {
			return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
		}
	}
}
