package com.selenium.testngprograms;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sample {
	
	@BeforeTest
	public void m1() {
		System.out.println(" Before Method");
	}
	
	@Test
	@Parameters({"name","email"})
	public void m2(String name,String email) {
		Reporter.log("test Method");
		Reporter.log("my name is "+name);
		Reporter.log("my Email id is"+email);
		
		int a =10;
		int b=0;
		
		int c;
		try {
			c = a/b;
			Reporter.log(" my calculation is "+c);
		} catch (Exception e) {
			Reporter.log(" result failed ");
						
		}
		
		
		
	}
	
	@AfterTest
	public void m3() {
		System.out.println(" After method ");
	}

}
