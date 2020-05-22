package com.selenium.testbgprograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testcase3 {
	
	@BeforeTest
	
	public void launchurl() {
		System.out.println(" Launch the browser");
	}
	
	@Test
	
	public void testcase1() {
		
		
		System.out.println("File user details");
	}
	
	@AfterTest
	public void closebrowser() {
		


		
		
	}

}
