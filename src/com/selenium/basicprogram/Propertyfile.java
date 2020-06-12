package com.selenium.basicprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public static void main(String[] args) throws IOException {
		
		FileReader path= new FileReader(".//driver//data1.properties");
		
		Properties prop= new Properties();
		
		prop.load(path);
		
		System.out.println(prop.getProperty("username"));
		
		System.out.println(prop.getProperty("password"));
		
		System.out.println(prop.getProperty("para"));
		
		
		
		
	}

}
