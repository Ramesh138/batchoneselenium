package com.selenium.basicprogram;

import java.io.IOException;

import org.testng.annotations.Test;

public class Testcase1 extends sample {

	@Test
	
	public void tc1() throws IOException {
		
		
		System.out.println("username  :"+getdata("TC1", 0));
		
		System.out.println("password  :"+getdata("TC1", 1));
		
		System.out.println("fullname   :"+getdata("TC1", 2));
		
		System.out.println("firstname  :"+getdata("TC1",3 ));
		
	
	}
	
	
	@Test
	
	public void tc2() throws IOException {
		
		
		System.out.println("username  :"+getdata("TC2", 0));
		
		System.out.println("password  :"+getdata("TC2", 1));
		
		System.out.println("fullname   :"+getdata("TC2", 2));
		
		System.out.println("firstname  :"+getdata("TC2",3 ));
		
		/*
		 * for (int i = 0; i < 4; i++) { System.out.println("username  :"+getdata("TC2",
		 * i)); }
		 */
		
		
		for (int i = 0; i < 4; i++) {
			System.out.println("username  :"+getdata("TC2", 0));
		}
		
	
	}
}
