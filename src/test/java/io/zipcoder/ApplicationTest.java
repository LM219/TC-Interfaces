package io.zipcoder;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {
	
	@Test
    public void speakTest(){
		
		Dog Bessie = new Dog("Bessie");
		Bessie.setName("Bessie");

		
		String expected =  "WOOF!";
		
		String actual = Bessie.speak();

		Assert.assertEquals(expected, actual);

   
		
		
	}
	@Test
	   public void speakTestPossum(){
			
			Possum Po = new Possum("Po");
			Po.setName("Po");

			
			String expected =  "HISSSS!";
			
			String actual = Po.speak();

			Assert.assertEquals(expected, actual);

	   
			
			
		}
	
	// Cannot do tests for anything else as everything else requires user Input which I was advised not to use tests for.


	
	
}
