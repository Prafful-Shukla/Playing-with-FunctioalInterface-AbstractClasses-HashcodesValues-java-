package com.abstractclass.example;

public abstract class PersonAbstractClass {

	//[10000,5000,30000,45000,120000,34000]calculating factorial of this? using int, streams,and improve performance
	//Hiding the implementation details and only showing the functionality to the user 
	//can have both abstract method as well non abstract methods  
	//a non-abs class can not have abstract method
	protected abstract void getPersonDetails();
	//in interface its not allowed ,protected 
	//as in interface all methods are by deafult public and default
	
	public String getName(){
		return "Anshu";
	}
	
	
	
}
