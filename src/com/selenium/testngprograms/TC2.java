package com.selenium.testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC2 {

	
	@BeforeClass
	public void beforeclassm1() {
		System.out.println(" BC.t2");
	}
	
	
	@AfterClass
	public void afterclassm1() {
		System.out.println(" AC.t2");
	}
	@BeforeMethod
	
	public void beforem1() {
	System.out.println(" B1.t2");	
	}
	
	@AfterMethod
	public void afterm1() {
		System.out.println("A1.t2");
	}
	@Test
	public void t2() {
		System.out.println(" t2");
	}
	
	@Test
	public void t21() {
		System.out.println(" t21");
	}
	
	@Test
	public void t22() {
		System.out.println(" t22");
	}
	
}
