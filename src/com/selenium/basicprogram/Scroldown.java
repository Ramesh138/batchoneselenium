package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroldown {
	
	
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/");
		
		Thread.sleep(1000);
		
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,1000)");  // vertical  down
		
		Thread.sleep(1000);
		
		js.executeScript("window.scrollBy(0,-1000)");// vertical up
		
		Thread.sleep(3000);
		
		/*
		 * js.executeScript("window.scrollBy(1000,0)");// horzontal forward
		 * 
		 * Thread.sleep(3000);
		 * 
		 * js.executeScript("window.scrollBy(-1000,0)");// horzontal backwardr
		 * 
		 * Thread.sleep(3000);
		 * 
		 * js.executeScript("return window.scrollMaxY"); //vertical max up
		 * 
		 * js.executeScript("return window.scrollMaxX"); // horzontal max horizontal
		 * 
		 * 
		 */
		
		WebElement Element = driver.findElement(By.linkText("Typos"));
		
		js.executeScript("arguments[0].scrollIntoView();", Element);
		
		Thread.sleep(3000);
		
		Element.click();
		
	}

}
