package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Linktextexample {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		String url = "http://newtours.demoaut.com/";

		driver.get(url);
		
		driver.manage().window().maximize();

		System.out.println("Launch the url " + url);
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Destina")).click();
		Thread.sleep(3000);

		driver.quit();
	
	}

}
