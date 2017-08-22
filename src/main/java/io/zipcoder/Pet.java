package io.zipcoder;

import java.util.Scanner;

public class Pet implements Comparable<Pet>{
	private String name;
	
//	public int compareTo(Pet other){
//		if(this.name.toLowerCase().compareTo(other.name.toLowerCase())==0){
//			return this.getClass().getSimpleName().compareTo(other.getClass().getSimpleName());
//		}
//		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
		
//	}
	
	public int compareTo(Pet other){
		if(this.getClass().getSimpleName().compareTo(other.getClass().getSimpleName())==0) {
			return this.name.toLowerCase().compareTo(other.name.toLowerCase());
		}
		return this.name.toLowerCase().compareTo(other.name.toLowerCase());
	}
	
	

	public Pet(String name)
	{ 
		this.name= name;
	}
	
	public void setName(String name){
		this.name= name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String speak()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("I am a speaking PET, What would you like me to say?");
		String userInput = scanner.nextLine();
		String output = "Okay..... " + userInput;
		return output;
	}
	
	
	
	
	
	

}
