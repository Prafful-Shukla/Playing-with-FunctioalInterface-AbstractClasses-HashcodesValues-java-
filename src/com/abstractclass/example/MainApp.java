package com.abstractclass.example;

public class MainApp extends PersonAbstractClass {
//if extend parent class then we have to implement all the abstract method of that class
	public static void main(String[] args) {
		MainApp obj = new MainApp();
		obj.getPersonDetails();

	}

	@Override
	protected void getPersonDetails() {
		System.out.println("Inside class MainApp:: getPersonDetails()");
		
	}
	
	

	//Abstract 
	//It can have both abstract and non abs method
	//it can extends an another java class 
	//an abstract class can have access specifers as public private protected no modifier
	//in case of partial implementation but have the base method details you can got with this
	
	//Interface 
	//Will have attributes and  method by default public and abstract 
	//java 8 onwards we were provided with default and static so that an interface can have method with body
	//to solve the problem of multiple inheritance in java you can with interface 
	//suppose you you have requirements properly you can go for implementing the interface 
	//we can also impose certain rules to the class which is inheriting
	
	
}
