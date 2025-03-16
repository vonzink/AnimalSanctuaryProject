package com.skilldistillery.animals.entities;

import java.util.Arrays;

public class Sanctuary {
	private Animal[] animals = new Animal[8];
	Attendant attendant; 
	int choice; 

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
		for (int i = 0; i < animals.length; i++) {
			if (animals[i] != null) {
				System.out.println("Enclosure " + i  + ": " + animals[i].getName());
			} else {
				System.out.println("Enclosure " + i  + ": This enclosure is empty.");
			}
		}
	}
	
	public void addAnimal(Animal animal) {
		for (int j = 0; j < animals.length; j++) {
			if (animals[j] == null) {
				animals[j] = animal;
				System.out.println(animal + " has been added to enclosure " + (j + 1) + ".");
				return; 
			}
		}
		System.out.println("Sorry, the sanctuary is full.");
	}

	public void startAttendantRounds() {
		if (animals == null) {
		    System.out.println("Error: Animal list is not initialized.");
		    return;
		}
		if (animals.length == 0) {
		    System.out.println("There are no animals in the sanctuary.");
		    return;
		}
		attendant.makeRounds(animals);
	}

	@Override


	
	
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Sanctuary [animals=");
		builder.append(Arrays.toString(animals));
		builder.append(", attendant=");
		builder.append(attendant);
		builder.append(", choice=");
		builder.append(choice);
		builder.append(", getAnimals()=");
		builder.append(Arrays.toString(getAnimals()));
		builder.append(", getAttendant()=");
		builder.append(getAttendant());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
}
