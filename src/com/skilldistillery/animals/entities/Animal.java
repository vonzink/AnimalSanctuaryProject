package com.skilldistillery.animals.entities;
//Subclass

public class Animal extends Sanctuary{

	private String name; 
	
	public Animal(String name) {
		this.name = name; 
	}
	
	
	private void makeNoise () {
		return; 
		}
	private int eat(int amount) {
		return 0;
		}
	
	public Animal getAnimals() {
		return animals;
	}
	public void setAnimals(Animal animals) {
		this.animals = animals;
	}

	}

