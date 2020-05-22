package com.selenium.testbgprograms;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.selenium.basicprogram.Alerts;
import com.selenium.basicprogram.Launchurl;

public class Testcase1 {
	
	
	Launchurl lu= new Launchurl();
	@BeforeTest
	
	public void launchurl() {
		lu.launchurlmethod();
		
		System.out.println(" Launch the browser");
	}
	
	@Test
	
	public void testcase1() throws InterruptedException {
		Alerts al= new Alerts();
		
		al.alertmethod();
		
		System.out.println("File flight details");
	}
	
	@AfterTest
	public void closebrowser() {
		lu.closethebrowser();
		System.out.println("close the browser");
		
	}

}
