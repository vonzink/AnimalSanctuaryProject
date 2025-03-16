package com.skilldistillery.animals.entities;
//Subclass//Subclass

public class Bird extends Animal{

	private static String noise = "Moo"; 
	
	public Bird() {
		super();
	}
	
	public Bird(String name) {
        super(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println(noise);
    }

    @Override
    public void eat(int amount) {
        System.out.println("I love eating these " + amount + " hays.");
        
    	}
    }