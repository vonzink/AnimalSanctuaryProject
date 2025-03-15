package com.skilldistillery.animals.entities;
//Subclass//Subclass
public class Bear extends Animal {

	private String noise = "growl"; ; 
	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	
	@Override
	public void eat(int amount) {
		makeNoise(); 
		System.out.println("yum");
	}
	
}
