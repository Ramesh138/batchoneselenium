package com.selenium.basicprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gettittle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url = "http://newtours.demoaut.com/mercurysignon.php";

		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.MILLISECONDS);
		
	//	driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.MILLISECONDS);
		
		String page=driver.getPageSource();
		
		//System.out.println(page);

		String tittle=driver.getTitle();
		
		System.out.println("Tittle of the project:"+tittle);
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Flights")).click();
		
		driver.findElement(By.linkText("Home")).click();
		
		driver.findElement(By.linkText("Hotels")).click();
		
		String actualvalue=driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[3]/a")).getText();
		
		System.out.println(actualvalue);
		
		driver.quit();
		
	}

}
