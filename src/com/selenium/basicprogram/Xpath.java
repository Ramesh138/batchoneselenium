package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath extends Application {

	public static void main(String[] args) {
		
//		Basic Xpath 
		
		//Relative  ============ //tagename[@attribute=value]
			
		//Contains==============//*[contains(@type,'text')]
			
		//text()=================//*[text()='Selenium']

		Application app = new Application();

		app.launchurl("http://newtours.demoaut.com/");

		app.maximiseTheWindow();

		String homelabel = driver.findElement(By.xpath(".//*[text()='Home']")).getText();

		System.out.println(" Home label :" + homelabel);

	}

}
