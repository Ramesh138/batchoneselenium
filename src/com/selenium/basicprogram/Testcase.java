package com.selenium.basicprogram;

public class Testcase {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Application.launchurl("https://testguild.com/");
		
		Application.maximiseTheWindow();
		
		Application.closethebrowser();
		
		
	}

}
