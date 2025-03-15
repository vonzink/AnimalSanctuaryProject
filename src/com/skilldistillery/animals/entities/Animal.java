package com.skilldistillery.animals.entities;
//Subclass

public class Animal {

	private String name; //Animal - Fields - name


	public Animal() {
		super();
	}
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public static Animal[] getAnimals() {
			return null;
		}
	public String getName() {return name;} //Method 1
	public void setName(String name) {this.name = name;}

	public void makeNoise() { //Method 2
		System.out.println(name + ""); 
	}
	public void eat(int amount) { //Method 3
		System.out.println(name + "I'm eating" + amount + " foods");
	}
	
	public void feedTimesPerDay() {
		System.out.println(0); 	
	}

	public void foodType() {
		System.out.println(""); 
		
	}

	public void aggressive(){
		System.out.println(false); 
		
	}

	public void feedTimePerDay() {
		System.out.println(0); 

	}
	}


