package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.*;

import java.util.Scanner;

public class AnimalSanctuaryApp {

	private Sanctuary sanctuary = new Sanctuary();
	private Scanner sc = new Scanner(System.in);

	public AnimalSanctuaryApp() {
	}

	public Sanctuary getSanctuary() {
		return sanctuary;
	}
	public void setSanctuary(Sanctuary sanctuary) {
		this.sanctuary = sanctuary;
	}

	public void launchApp() {

		int answer;
		int species; 

		do {
			System.out.println("** Welcome to my animal Sanctuary **");
			System.out.println("--------------------------------------");
			System.out.println("Please select an option");
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
					System.out.println("What species would you like to add to? ");
					System.out.println("1. Bear");
					System.out.println("2. Bird ");
					System.out.println("3. Cow ");
					System.out.println("4. Dragon ");
					System.out.println("5. Duck ");
					System.out.println("6. Gorilla ");
					System.out.println("7. Lion ");

					species = sc.nextInt();
					sc.nextLine();

					System.out.println("what is the name of the animal? ");
					String name = sc.nextLine();

					switch (species) {
					case 1:
						this.getSanctuary().addAnimal(new Bear(name));
						break;
					case 2:
						this.getSanctuary().addAnimal(new Bird(name));
						break;
					case 3:
						this.getSanctuary().addAnimal(new Cow(name));
						break;
					case 4:
						this.getSanctuary().addAnimal(new Dragon(name));
						break;
					case 5:
						this.getSanctuary().addAnimal(new Duck(name));
						break;
					case 6:
						this.getSanctuary().addAnimal(new Gorilla(name));
						break;
					case 7:
						this.getSanctuary().addAnimal(new Lion(name));
						break;
					default:
						System.out.println("Invalid species. Try again.");
						break;
					}
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
// MAIN
	
	
	
	
	
	
public static void main(String[] args) {

AnimalSanctuaryApp app = new AnimalSanctuaryApp();	
	app.launchApp();
}

}