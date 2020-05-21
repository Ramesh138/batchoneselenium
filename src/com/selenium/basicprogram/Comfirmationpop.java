package com.selenium.basicprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Comfirmationpop {
	
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		 
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			driver.findElement(By.name("confirmation")).click();
			
			Thread.sleep(1000);
			
			Alert alert = driver.switchTo().alert();  // Switch to pop up 
			
			alert.dismiss();
		
			Thread.sleep(1000);
			
			driver.quit();
			
			

	}

}
