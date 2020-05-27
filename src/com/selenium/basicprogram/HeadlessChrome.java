package com.selenium.basicprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HeadlessChrome {

	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {

		// Launch
		 driver = new HtmlUnitDriver();

		// load the url
		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		Thread.sleep(2000);


		System.out.println(driver.getTitle());

	}
}
