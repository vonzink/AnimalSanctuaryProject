package com.skilldistillery.animals.entities;
//Animal subclass

public class Dragon extends Animal {

	private static String noise = "Hello"; 
	//Eclipse
	public Dragon() {
		super();
	}
	//Eclipse
	public Dragon(String name) {
        super(name);
    }
    
    @Override
    public void makeNoise() {
        System.out.println(noise);
    }

    @Override
    public void eat(int amount) {
        System.out.println("I love eating these " + amount + " People.");
	}

}
