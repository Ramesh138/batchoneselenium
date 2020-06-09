package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement ele=driver.findElement(By.id("sub-menu"));
		
		Actions act= new Actions(driver);
		
		act.moveToElement(ele).build().perform();
		

		Thread.sleep(2000);
		driver.findElement(By.id("link2")).click();
		Thread.sleep(2000);
		driver.quit();
		
	}
	

}
