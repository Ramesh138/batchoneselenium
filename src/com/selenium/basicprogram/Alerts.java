package com.selenium.basicprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		 
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

			driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			
			driver.findElement(By.name("alert")).click();
			
			Thread.sleep(1000);
			
			Alert alert = driver.switchTo().alert();  // Switch to pop up 
			
			
			String value =alert.getText();
			
			System.out.println(value);
			
			alert.accept();
		
			Thread.sleep(1000);
			
			driver.quit();
			
			

	}

}
