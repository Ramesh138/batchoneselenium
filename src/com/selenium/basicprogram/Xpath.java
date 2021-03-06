package com.selenium.basicprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath extends Application {

	public static void main(String[] args) {
		
//		Basic Xpath 
		
		//Relative  ============ //tagename[@attribute=value]
			
		//Contains==============//*[contains(@type,'text')]
			
		//text()=================//*[text()='Selenium']
		
		//starts-with===========.//*[starts-with(@href,'mercury')]
		
		//following =========	//*[@name='passCount']//following::select[1]
		
		//preceding========//*[@name='airline']//preceding::select[1]

		
		Application app = new Application();

		app.launchurl("http://newtours.demoaut.com/");

		app.maximiseTheWindow();

		String homelabel = driver.findElement(By.xpath(".//*[text()='Home']")).getText();

		System.out.println(" Home label :" + homelabel);

	}

}
