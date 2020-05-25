package com.selenium.testngprograms;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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
	public void t1() {
		System.out.println(" t1");
	}
	
	@Test
	public void t11() {
		System.out.println(" t11");
	}
	
	@Test
	public void t12() {
		System.out.println(" t12");
	}
	
	
	

}
