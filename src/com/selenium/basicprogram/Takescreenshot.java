package com.selenium.basicprogram;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Takescreenshot {
	
	static  WebDriver driver;
	 
	 public static void main(String[] args) throws IOException {
		
		 
		 System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		 
		 driver = new ChromeDriver();
		 
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 
	
		 File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		 
		 FileUtils.copyFile(file, new File(".//Images//sample1.png"));
		 
		 
		 
		 driver.quit();

		 
	
	}

}
