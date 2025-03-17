package com.skilldistillery.animals.entities;
//Animal subclass
public class Gorilla  extends Animal{

	//Animal subclass	
	private static String noise = "Woo Woo";
	//Eclipse
	public Gorilla() {
		super();
	}
	//Eclipse
	public Gorilla(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I love eating these " + amount + " bananas.");
	}
}
