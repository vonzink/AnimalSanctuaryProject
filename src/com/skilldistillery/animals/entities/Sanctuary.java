package com.skilldistillery.animals.entities;

public class Sanctuary {
	private Animal[] animals = new Animal[8];
	 private Attendant attendant;
	
	 public Sanctuary() {
	 this.attendant = new Attendant();
	 }
	// Eclipse
	public Animal[] getAnimals() {
		return animals;
	}

	public void listAnimals() {
		System.out.println("List animals in sanctuary:");
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("Enclosure " + (i + 1) + ": " + animals[i].getName());
			} else {
				System.out.println("Enclosure " + (i + 1) + ": This enclosure is empty.");
			}
		}
	}

	public void addAnimal(Animal animal) {
		for (int j = 0; j < animals.length; j++) {
			if (animals[j] == null) {
				animals[j] = animal;
				System.out.println(animal.getName() + "has been added to enclosure" + (j + 1));
				return;
			}
		}
		System.out.println("Sorry, the sanctuary is full.");
	}

	public void startAttendantRounds() {

		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				attendant.makeRounds(animals);
			} else {
				System.out.println("There are no animals in the sanctuary."); 
				 break; 
				}
			}
		}
	}