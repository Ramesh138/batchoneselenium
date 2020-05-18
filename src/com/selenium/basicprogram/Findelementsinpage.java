package com.selenium.basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsinpage {

	public static void main(String[] args) {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("http://newtours.demoaut.com/");

		List<WebElement> li = driver.findElements(
				By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));

		for (int i = 1; i <= li.size(); i++) {

			String value = driver.findElement(
					By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr["
							+ i + "]"))
					.getText();

			System.out.println(value);
		}

		driver.close();

	}

}
