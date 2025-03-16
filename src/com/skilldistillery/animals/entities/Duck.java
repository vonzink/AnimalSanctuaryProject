package com.skilldistillery.animals.entities;
//Animal subclass
public class Duck extends Animal {
	private static String noise = "Moo";

	public Duck() {
		super();
	}

	public Duck(String name) {
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