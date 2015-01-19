package com.tests;

class Car {
	/* blueprint for Car class */
	private int noOfTyres = 4;
	private int noOfDoors = 4;
	
	public void startEngine(){
		System.out.println("Engine Started");
	}
	public void stopEngine(){
		System.out.println("Engine Stopped");
	}
	public void run(){
		System.out.println("Car is Running");
	}
	public void stop(){
		System.out.println("Car is Stopped");
	}	
	public void listAttributes(){
		System.out.println("No Of Tyres: " + this.noOfTyres);
		System.out.println("No of Doors: " + this.noOfDoors);
	}	
	
}

public class CarExample{
	/* Simulate Car */
	public static void main(String args[]){
		Car obj = new Car();
		obj.listAttributes();
		obj.startEngine();
		obj.run();
		obj.stop();
		
		obj.startEngine();
		System.out.println();
	}
}



