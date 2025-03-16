package com.skilldistillery.animals.entities;
//Animal subclass

public class Dragon extends Animal {

	private static String noise = "Moo"; 
	
	public Dragon() {
		super();
	}
	
	public Dragon(String name) {
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
