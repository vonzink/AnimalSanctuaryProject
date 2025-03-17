package com.skilldistillery.animals.entities;

public class Animal {
    private String name; 
    
  //Eclipse
    public Animal() {
	}
  //Eclipse
	public String getName() { 
		return name;
	}
	//Eclipse
	public Animal(String name) { 
		super();
		this.name = name;
	}

    public void makeNoise() {
    	System.out.println(" whats that sound ");

    }

    public void eat(int amount) {
        System.out.println("I'm eating " + amount + " foods.");
    }
}
