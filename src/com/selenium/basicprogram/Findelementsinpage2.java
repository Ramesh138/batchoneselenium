package com.selenium.basicprogram;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementsinpage2 {

	public static void main(String[] args) {

		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");

		driver = new ChromeDriver();

		driver.navigate().to("http://newtours.demoaut.com/");

		List<WebElement> li = driver
				.findElements(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td"));

		for (int i = 1; i <= li.size(); i++) {

			String arr[] = { "SIGN-ON", "REGISTER", "SUPPORT", "CONTACT" };
			String value = driver
					.findElement(By.xpath(
							"/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[" + i + "]"))
					.getText();
			
			if (value.trim().equals(arr[i-1].trim())) {

				System.out.println(" Content is Correct" + arr[i-1] + "  ====" + value);
			} else {
				System.out.println(" Something is wrong"+arr[i-1] + "  !====" + value);
			}

			System.out.println(value);
		}

		driver.close();

	}

}
