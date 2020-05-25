package com.selenium.testngprograms;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TC {
	
	@BeforeSuite
	public void beforesuitem1() {
		System.out.println(" before Suite");
	}
	
	@AfterSuite
	public void aftersuitem1() {
		System.out.println(" After Suite");
	}
	
	@BeforeTest
	public void beforetestm1() {
		System.out.println("before test");
	}

	
	@AfterTest
	public void aftertestm1() {
		System.out.println("after test");
	}
}
