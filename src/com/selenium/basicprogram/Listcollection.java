package com.selenium.basicprogram;

import java.util.ArrayList;
import java.util.List;

public class Listcollection {
	
	public static void main(String[] args) {
		String arr[]= {"Ram","Raj"};
		
		List<Integer> li= new ArrayList<Integer>();   //{"Ram","Raj"};  mani sam  
		
	
		li.add(1);
		
		li.add(2);
		
		li.add(3);
		
		li.add(4);
		
		System.out.println(li);
		
		li.remove(2);
		
		System.out.println(li);
		
		System.out.println(li.size());
		
	}

}
