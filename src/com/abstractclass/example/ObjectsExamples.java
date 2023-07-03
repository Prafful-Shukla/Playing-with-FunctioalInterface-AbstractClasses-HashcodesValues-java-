package com.abstractclass.example;

public class ObjectsExamples {
	
	private String firstName;
	private String lastName;
	private int age;
	
	
//
//	@Override
//	public String toString() {
//		return "ObjectsExamples [firstName=" + firstName + ", age=" + age + "]";
//	}






	public static void main(String[] args) {
		ObjectsExamples obj =new ObjectsExamples();
		obj.firstName = "Kartik";
		obj.lastName = "Aryan";
		obj.age = 25;
		
		ObjectsExamples obj2 =new ObjectsExamples();
		obj2.firstName = "Kartik";//if we use here only obj instead of obj2 the values on output will be null or 0 in age
		obj2.lastName = "Aryan";
		obj2.age = 25;
		
		//obj2=obj;
		//equal sign compare two object not values.
		//now the hashcode will be same?
		//both are pointing to saame memory location
		
		System.out.println(obj);
		//we will get output from tostring method that is returning string.
		//but if this is not present it will give reference to the memory location where object is present
		//native ? hashcode method in object class
		//native implementation will be present in os library of the os we r using
		//jvm is not responsible for memory allocation.
		System.out.println(obj2);
		
		System.out.println("----------------------------------------------------");
		
		System.out.println(obj.equals(obj2));
		//will check for memory location which will be different so will return false.
		
		
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectsExamples other = (ObjectsExamples) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		return true;
	}
	//i geneerated this code using source hashcode and equals.lol trick

}
