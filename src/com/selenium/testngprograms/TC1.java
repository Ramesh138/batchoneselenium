package com.selenium.testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC1 {
	@BeforeClass
	public void beforeclassm1() {
		System.out.println(" BC.t1");
	}
	
	
	@AfterClass
	public void afterclassm1() {
		System.out.println(" AC.t1");
	}
	@BeforeMethod
	
	public void beforem1() {
	System.out.println(" B1.t1");	
	}
	
	@AfterMethod
	public void afterm1() {
		System.out.println("A1.t1");
	}
	
	
	@Test
	@Parameters({"fullname","lname","fname"})
	public void t1(String fullname,String lname,String fname) {
		System.out.println(" t1");
		System.out.println("my full name :"+fullname);
		
		System.out.println("my last name :"+lname);
		
		System.out.println("my first name :"+fname);
	}
	
	

}
