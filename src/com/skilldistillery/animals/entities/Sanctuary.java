package com.skilldistillery.animals.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[8];
	private Attendant attendant;

	public Animal[] getAnimals() {
		return animals;
	}

	public void setAnimals(Animal[] animals) {
		this.animals = animals;
	}

	public Attendant getAttendant() {
		return attendant;
	}

	public void setAttendant(Attendant attendant) {
		this.attendant = attendant;
	}

	public void listAnimals() {
		System.out.println("List animals in sanctuary:");
		for (int i = 1; i <= animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("Enclosure " + i + ": " + animals[i].getName());
			} else {
				System.out.println("Enclosure " + i + ": This enclosure is empty.");
			}
		}
	}

	public void addAnimal(Animal animal) {
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] == null) { // Find first empty slot
				animals[i] = animal;
				System.out.println(animal + " has been added to enclosure " + (i) + ".");
			}
		}
		System.out.println("Sorry, the sanctuary is full.");
	}

	public void startAttendantRounds() {
		attendant.makeRounds(animals);
	}
}