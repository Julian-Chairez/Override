package com.cognixia.jumpcore.java;

public class MethodDriver {
	public static void main(String[]args) {
		
		//make a canine and see the effect of .bark()
		
		Canine canine = new Canine(20.0, "US");
		
		//use the default canine bark
		canine.bark();
		
		//make a dog object bark that uses .bark as well
		Dog dog = new Dog(15.0, "Europe", "lab");
				dog.bark();
				
				dog.bark();
				System.out.println(dog.bark("Woof ", 5));
				
				dog.bark("bark",5, 10);
	}

}
