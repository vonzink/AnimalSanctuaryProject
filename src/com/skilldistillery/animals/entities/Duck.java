package com.skilldistillery.animals.entities;
//Animal subclass
public class Duck extends Animal {
	private static String noise = "Quack";
	//Eclipse
	public Duck() {
		super();
	}
	//Eclipse
	public Duck(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println(noise);
	}

	@Override
	public void eat(int amount) {
		System.out.println("I love eating these " + amount + " portions of bread.");
	}
}