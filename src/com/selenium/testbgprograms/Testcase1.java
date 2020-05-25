package com.selenium.testbgprograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.basicprogram.Alerts;
import com.selenium.basicprogram.Launchurl;

public class Testcase1 {
	
	

	@BeforeTest
	public void launchurl() {
	
		System.out.println(" Launching Url");
	}
	
	@Test
	public void testcase1() throws InterruptedException {
		
		System.out.println("testcase 1");
	}
	
	@AfterTest
	public void closebrowser() {
		System.out.println(" close the browser");
	}

}
