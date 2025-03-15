package com.skilldistillery.animals.entities;

//Subclass
public class Attendant {

	public Attendant() {
		super();
	}

	static Animal[] animals = Animal.getAnimals();

	public static void makeRounds(Animal[] animals) {
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getName());
			animals[i].makeNoise();
		}
	}

	public static void main(String[] args) {
		Attendant.makeRounds(animals);
	}
}