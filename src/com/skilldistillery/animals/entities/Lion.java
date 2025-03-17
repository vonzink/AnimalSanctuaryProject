package com.skilldistillery.animals.entities;
//Animal subclass
public class Lion extends Animal {
   
	
	private static String noise = "Roar"; 
	//Eclipse
    	public Lion() {
		super();
	}
    	//Eclipse
	public Lion(String name) {
		super(name);
	}

        @Override
        public void makeNoise() {
            System.out.println(noise);
        }

        @Override
        public void eat(int amount) {
            System.out.println("I love eating these " + amount + " portions of meat.");
        }  
    }

