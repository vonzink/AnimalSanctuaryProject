package com.skilldistillery.animals.app;

import com.skilldistillery.animals.entities.*;

import java.util.Scanner;

public class AnimalSanctuaryApp {
	
	private Sanctuary sanctuary = new Sanctuary();
	
	public AnimalSanctuaryApp() {
		super();
	}

	public Sanctuary getSanctuary() {
		return sanctuary;
	}

	public void setSanctuary(Sanctuary sanctuary) {
		this.sanctuary = sanctuary;

	}
	public void launchApp (AnimalSanctuaryApp animalSanctuaryApp) {
	}

		//MAIN
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		AnimalSanctuaryApp animalSanctuaryApp = new AnimalSanctuaryApp(); 
		
				launchApp(animalSanctuaryApp); 
				
				for(int i = 0; i <=10; i++) {
				
					System.out.println("** Welcome to my animal Sanctuary **");
					System.out.println("--------------------------------------");
					System.out.println("Please select an option");
					System.out.println("--------------------------------------");
					System.out.println("1. Get a list of Animals ");
					System.out.println("2. Add a New Animal");
					System.out.println("3. ");
					System.out.println("4. ");
					

					String answer = sc.nextLine();
					
					//...
					switch (answer) {
					  case 1:
						  animal.getName();
					    break; 
					  case 2:
						  System.out.print("What species would you like to add to? ");
							System.out.println("2. Add a New Animal");
							System.out.println("3. ");
							System.out.println("4. ");
							System.out.println("4. ");
							System.out.println("4. ");
							System.out.println("4. ");
							String species = sc.nextLine();
							
					     sanctuary.addAnimals();
					    break;
					  case 3:
						  attendant.startAttendantRounds()
					    break;
					  case 4:
						  System.out.print("Goodbye");
					  	break; 
					  	
					  default:
					}
					
					
				}
			}
	}