package com.cognixia.jumpcore.java;

public class Dog extends Canine {
	
	String breed;

	public Dog (double weight, String location, String breed){
		super(weight, location);
		this.breed = breed;

	}
	//Method override (keep sig the same and must have inheritance
	
	public void bark(String sound) {
		System.out.println("I'm a dog with weight " + this.weight + " in location: " + this.location + " and breed " + this.breed);
		
	}
	//Compile time polymorphism
	//Method overloading
	public String bark(String sound, int volume) {
		return sound + this.weight + " " + this.location + " " + this.breed;
	}
	
	public void bark( String sound, int volume, int time) {
		System.out.println("Overloaded method example " + time); 
	}
}
