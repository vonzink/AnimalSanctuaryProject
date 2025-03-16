package com.skilldistillery.animals.entities;

public class Attendant {

	
	 public Attendant() {
		super();
	}
	public Attendant(int foodAmount) {
		super();
		this.foodAmount = foodAmount;
	}
	public int getFoodAmount() {
		return foodAmount;
	}
	public void setFoodAmount(int foodAmount) {
		this.foodAmount = foodAmount;
	}
	int foodAmount = (int)(Math.random() * 10) + 1; 

    public void makeRounds(Animal[] animals) {
    	System.out.println("I love Animals.");
        for (int i = 1; i < animals.length; i++) {
            if (animals[i] != null) { 
                System.out.println("I will feed " + animals[i].getName() + " " + foodAmount + " foods");
                animals[i].makeNoise();
                animals[i].eat(foodAmount);
                System.out.println();
            } else {
                System.out.println("This enclosure is empty, on to the next one.\n");
            }
        }
        System.out.println("Everyone's fed now, I can take a break.");
    }
}