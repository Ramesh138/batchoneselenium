package com.selenium.basicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt {
	
	static WebDriver driver;
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.name("upload")).sendKeys("D:\\Public\\Sample.txt");

		
			Thread.sleep(1000);
			
			
			driver.quit();
			

	}

}
