package com.skilldistillery.animals.entities;
//Subclass

public class Animal extends Sanctuary {

	private String name;

	public Animal() {}; 
	
	public Animal(String name) {
		this.name = name;
	}

	public void makeNoise() {
	
	}

	public void eat(int amount) {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
