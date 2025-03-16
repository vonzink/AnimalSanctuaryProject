package com.skilldistillery.animals.entities;

public class Animal {
    private String name; 

    public Animal() {
		super();
	}

	public String getName() { 
		return name;
	}

	public void setName(String name) { 
		this.name = name;
	}

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
