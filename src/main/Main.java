package main;


import snakes.Constrictor;
import snakes.Venomous;

public class Main {
	public static void main(String [] args){
		Constrictor python = new Constrictor("Python");
		Venomous cobra = new Venomous("Cobra");
		
		System.out.println("Both make noise using super class methods");
		
		python.makeNoise();
		cobra.makeNoise();
		
		System.out.println("Both execute their class kill methods");
		
		python.constrict();
		cobra.invenomate();
		
	}
}
