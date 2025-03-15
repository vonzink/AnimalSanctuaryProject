package com.skilldistillery.animals.entities;

//Subclass
public class Attendant {


	
	public void makeRounds(Animal[] animals) {
		for(int i = 0; i < animals.length; i++) {
			System.out.println(animals[i].getName());
		}
		public static void main (String[] args) {
			makeRounds(); 
	} // Makes Rounds Array of Animals return void
}
	 Attendant attendant = new Attendant();
	 Animal[] animals = Animal.getAnimals();
	 attendant.makeRounds(animals);
}