package com.codingdojo.fruityloops.models;
public class item {
    
    private String name;
    private double price;
    
    public item(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // getters and setters 1
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// getters and setters2
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}