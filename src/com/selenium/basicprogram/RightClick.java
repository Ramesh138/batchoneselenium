package com.selenium.basicprogram;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
	
static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement loc=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		
		
		WebElement ope= driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[3]/span"));
		
		
		Actions act= new Actions(driver);
		
		Thread.sleep(3000);
		act.contextClick(loc).moveToElement(ope).click().build().perform();
		
		Thread.sleep(3000);
		Alert ale= driver.switchTo().alert();
		Thread.sleep(3000);
		ale.accept();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
