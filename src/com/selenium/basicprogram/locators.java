package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		String url = "http://newtours.demoaut.com/";

		driver.get(url);
		
		driver.manage().window().maximize();

		System.out.println("Launch the url " + url);

		driver.findElement(By.name("userName")).sendKeys("Pradeephnk@gmail.com");

		Thread.sleep(1000);

		driver.findElement(By.name("password")).sendKeys("Hansika2010");
		
		Thread.sleep(1000);
		
		
		
		// Id >> name >>xpath >>css >> class >> tagname>> linktext >>partialtext

		// textbox ===============input is the html tag
		
		//for click action =========html tags are href and a ..otherwise src will be present
		
		//for checkbox and radio .............type will be Radio or check
		
		driver.findElement(By.name("login")).click();
		
	
		WebElement depfrom= driver.findElement(By.name("fromPort"));
		
		Select depdropdown= new Select(depfrom);
		
		depdropdown.selectByVisibleText("london");
		
		depdropdown.selectByIndex(6);
		
		
		
		
		depdropdown.selectByValue("Paris");
		
		
		// for dropdown ===== Select is the html tag
		
		Thread.sleep(1000);

		driver.quit();
	
	}

}
