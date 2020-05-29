package com.selenium.basicprogram;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows1 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://the-internet.herokuapp.com/windows");

		String parentwindow = driver.getWindowHandle();

		System.out.println(" the parent window session is " + parentwindow);

		driver.findElement(By.linkText("Click Here")).click();

		Set<String> noofwindows = driver.getWindowHandles();

		System.out.println(noofwindows.size());

		for (String string : noofwindows) {
			System.out.println(string);

			driver.switchTo().window(string);

			String tittle = driver.getTitle();

			System.out.println(tittle);
		}

		String ctittle = driver.getTitle();

		System.out.println(ctittle);

		driver.switchTo().window(parentwindow);

		String ptittle = driver.getTitle();

		System.out.println(ptittle);

		driver.quit();
	}

}
