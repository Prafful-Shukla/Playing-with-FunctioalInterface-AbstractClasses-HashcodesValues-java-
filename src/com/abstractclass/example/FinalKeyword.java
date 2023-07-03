package com.abstractclass.example;

public class FinalKeyword {
	
	
	//Final variable 
	//1st way->while declaring we can initialse 
	//2nd way-> we can initialise in constructor
	//3rd way-> you can initialse in static block or non-static block 
	//Final Functions
	//Functions which are final it can not be override in child class
	//Final class 
	//if a class is declared as final it can not be inherited
	//if a class final by default all the method are final 
	//attribute also. 
	
	
	public final int count;
	public final static int count2;
	
	//static block can have only static variable  
	// so making count2 as static also to make this work
	static {
		count2 = 100;
	}
	
//	FinalKeyword(){
//		this.count = 100;
//	}
	
	//non static block
	{
		this.count =100;
	}
	//will be called evertime the object will be created before the calling of the constructor.
	
	
	

	public static void main(String[] args) {
		
		FinalKeyword obj = new FinalKeyword();
		//obj.count = 200;
		System.out.println("default value --> "+  obj.count);// will ve having zero 

	}

}
