package com.hashmap.example;

import java.util.HashMap;


public class HashMapExmaple {

	public static void main(String[] args) {

		PersonClass obj = new PersonClass();
		obj.firstName = "Kartik";
		obj.lastName = "Aryan";
		obj.age = 25;

		PersonClass obj2 = new PersonClass();
		obj2.firstName = "Kartik";
		obj2.lastName = "Aryan";
		obj2.age = 25;

		System.out.println(obj.hashCode());
		System.out.println(obj2.hashCode());

		// System.out.println(obj);
		
		
		// System.out.println(obj2);
		//
		// System.out.println("----------------------------------------------------");
		//
		// System.out.println(obj.equals(obj2));

		// HashMap<Integer,Boolean> mapObj2 = new HashMap<>();

		HashMap<PersonClass, Boolean> mapObj = new HashMap<>();
		mapObj.put(obj, true);
		mapObj.put(obj2, true);

		System.out.println(mapObj);
		//this wont display value so we can write toString method in person class
		

//		System.out.println(mapObj.get(obj));

		// get method of hashcode?
		// it will caculate the hashcode or match the hashcode based on container we have given based on that it will get the value of the bucket 
		// it will use equals method and traverse the bucket correct and then
		// return the result

 	}

}


// if get valuse has to find the value , how will it do it?
