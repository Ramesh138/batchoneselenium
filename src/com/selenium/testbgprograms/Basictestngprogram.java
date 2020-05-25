package com.selenium.testbgprograms;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basictestngprogram {

	@BeforeSuite
	public void basetest() {

		System.out.println("Launching browser");
	}

	@AfterSuite

	public void closebrowser() {

		System.out.println("close the Browser");
	}

}
