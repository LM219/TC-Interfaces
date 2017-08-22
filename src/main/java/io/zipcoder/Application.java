package io.zipcoder;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("How many pets do you have?");

		int numberOfPets = scanner.nextInt();
		scanner.nextLine();

		Pet[] petArray = new Pet[numberOfPets];

		for (int x = 0; x < numberOfPets; x++) {
			System.out.println("AWESOME, what type of pet?");
			String pet = scanner.nextLine();

			System.out.println("And what is its name?");
			String name = scanner.nextLine();

			switch (pet) {
			case "Dog":
				Dog dog = new Dog(name);
				petArray[x] = dog;
				break;
			case "Cat":
				Cat cat = new Cat(name);
				petArray[x] = cat;
				break;
			case "Possum":
				Possum possum = new Possum(name);
				petArray[x] = possum;
				break;
			default:
				System.out.println("Sorry I do not want your pet....");
				break;
			}
		}
		
		//Sorting the array so that the name of the pet is arranged alphabetically.
		Arrays.sort(petArray);
		String output = "";
		for (int x = 0; x < petArray.length; x++) {
			output += "My name is " + petArray[x].getName() + " and I like to " + petArray[x].speak() + "\n";
		}
		System.out.println(output);
		
		

	}

}
