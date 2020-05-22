package com.selenium.basicprogram;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launchurl extends Basedriver {
	
	public void launchurlmethod() {
		
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
	}
	
	
	public void closethebrowser() {
		driver.quit();
	}

}
