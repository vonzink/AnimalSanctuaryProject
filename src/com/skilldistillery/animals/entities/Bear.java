package com.skilldistillery.animals.entities;

//Animal subclass
public class Bear extends Animal {
	private static String noise = "Moo";

	public Bear() {
		super();
	}

	public Bear(String name) {
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