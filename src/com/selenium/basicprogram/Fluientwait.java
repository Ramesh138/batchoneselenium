package com.selenium.basicprogram;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Fluientwait {

	public static void main(String[] args) {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		String eTitle = "Demo Guru99 Page";
		String aTitle = "";
		driver = new ChromeDriver();
	
		driver.get("https://www.google.com/");
	
		driver.manage().window().maximize();
		
		
	//List<WebElement>= new arraylis
		
		List<WebElement> li= new ArrayList<WebElement>();
		
		WebElement drop= driver.findElement(By.xpath(".//input[@name='uid1']"));

		
		Select value= new Select(drop);
		
		value.selectByVisibleText("");
		
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		.withTimeout(30,TimeUnit.SECONDS)
		.pollingEvery(5, TimeUnit.SECONDS)
		.ignoring(NoSuchElementException.class);
		
		WebElement clickseleniumlink = wait.until(new Function<WebDriver, WebElement>() {
			
			public WebElement apply(WebDriver driver) {
				System.out.println(" i am in");
				return driver.findElement(By.xpath(".//input[@name='uid1']"));
			}
		});
		// click on the selenium link
		clickseleniumlink.sendKeys("Rames");
		// close~ browser
		driver.quit();
	}
}
