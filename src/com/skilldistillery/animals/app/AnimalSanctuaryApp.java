package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.*;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	private Sanctuary sanctuary = new Sanctuary();
	private Scanner sc = new Scanner(System.in);

	public Sanctuary getSanctuary() {
		return sanctuary;
	}
	
	public void launchApp() {

		System.out.println("** Welcome to my animal Sanctuary **");
		int answer;
		do {
			System.out.println("--------------------------------------");
			System.out.println("Please select an option 1 thru 4");
			System.out.println("--------------------------------------");
			System.out.println("1. Get a list of Animals ");
			System.out.println("2. Add a New Animal");
			System.out.println("3. Start attendant rounds ");
			System.out.println("4. Quit");

			answer = sc.nextInt();
			sc.nextLine();

			if (answer < 1 || answer > 4) {
				System.out.println("please enter a valid option");
			} else {

				switch (answer) {
				case 1:
					this.getSanctuary().listAnimals();
					break;

				case 2:
					int theChoice = species();
					nameAnimal(theChoice);
					break;
					
				case 3:
					this.getSanctuary().startAttendantRounds();
					break; 
					
				case 4:
					System.out.println("Goodbye");
					break;

				default:
					System.out.println("Invalid selection, please try again");
					break;
				}
			}
		} while (answer != 4);
		sc.close();
	}

	int species() {
		System.out.println("What species would you like to add to? ");
		System.out.println("1. Bear");
		System.out.println("2. Bird ");
		System.out.println("3. Cow ");
		System.out.println("4. Dragon ");
		System.out.println("5. Duck ");
		System.out.println("6. Gorilla ");
		System.out.println("7. Lion ");

		int species = sc.nextInt();
		sc.nextLine();

		return species;
	}
			
	String nameAnimal(int choice) {
				
		
		System.out.println("what is the animals name? ");
		String name = sc.nextLine();		
		
		
			switch (choice) {
			case 1:
				this.getSanctuary().addAnimal(new Bear(name));
				System.out.println(name +  " the Bear has been added to Sanctuary");
	
				break;
			case 2:
				this.getSanctuary().addAnimal(new Bird(name));
				System.out.println(name +  " the Bird has been added to Sanctuary ");
				break;
			case 3:
				this.getSanctuary().addAnimal(new Cow(name));
				System.out.println(name +  " the Cow has been added to Sanctuary ");
				break;
			case 4:
				this.getSanctuary().addAnimal(new Dragon(name));
				System.out.println(name +  " the Dragon has been added to Sanctuary");
				break;
			case 5:
				this.getSanctuary().addAnimal(new Duck(name));
				System.out.println(name +  " the Duck has been added to the Sanctuary");
				break;
			case 6:
				this.getSanctuary().addAnimal(new Gorilla(name));
				System.out.println(name +  " the Gorilla has been added to the Sanctuary");
				break;
			case 7:
				this.getSanctuary().addAnimal(new Lion(name));
				System.out.println(name +  " the Lion has been added to the Sanctuary ");
				break;
			}	return name;		
		}
//MAIN	

	public static void main(String[] args) {
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp();


	}
}