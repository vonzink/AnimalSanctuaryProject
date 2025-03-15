package com.skilldistillery.animals.app;

import java.util.Scanner; 
import com.skilldistillery.animals.entities.*;

public class AnimalSanctuaryApp {

	Sanctuary sanctuary; //TODO Instantiate a Sanctuary
	Attendant attendant; //TODO Instantiate an Attendant
	
	public static void main(String[] args) {

		//TODO Add attendant to sanctuary
		Attendant attendant = new Attendant();
		
		AnimalSanctuaryApp app = new AnimalSanctuaryApp();
		app.launchApp(); 
	}
//TODO Tell sanctuary to start attendant rounds
		private void launchApp() {
			System.out.println("");
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Welcome to the Sanctuary Database "); 
		System.out.println(" Welcome to the Sanctuary Database ");
		
		String input = sc.nextLine(); 

		sc.close();
	}

}

//TODO Create and add animals to sanctuary