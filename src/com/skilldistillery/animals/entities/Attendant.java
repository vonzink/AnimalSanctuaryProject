package com.skilldistillery.animals.entities;

public class Attendant {

	private int foodAmount;

	//Eclipse
	 public Attendant() {
		super();
	}
	 //Eclipse
	public Attendant(int foodAmount) {
		super();
		this.foodAmount = foodAmount;
	}
	//Eclipse
	public int getFoodAmount() {
		return foodAmount;
	}
	//Eclipse
	public void setFoodAmount(int foodAmount) {
		this.foodAmount = foodAmount;
	}
    public void makeRounds(Animal[] animals) {
    	System.out.println("I love taking care of animals!.");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null) { 
            	int foodAmount = (int)(Math.random() * 10) + 1; 
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