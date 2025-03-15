package com.skilldistillery.animals.entities;
//Animal subclass
public class Bear extends Animal {

	
	private static String noise = "growl"; 
	private static String eat = "nom, nom, nom";
	private static  int feedTimesPerDay = 1; 
	private static String foodType = "Salmon"; 	
	private static boolean aggressive = true; 
	

	
	@Override
	public void makeNoise() {
		System.out.println(noise);
	}
	@Override
	public void eat(int amount) {
		makeNoise(); 
		System.out.println(eat);
	}
	@Override
	public void feedTimePerDay() {
		System.out.println(feedTimesPerDay);
		
	}
	@Override
	public void foodType() {
		System.out.println(foodType);
	}
	@Override
	public void aggressive() {
		System.out.println(aggressive);
	}
}
