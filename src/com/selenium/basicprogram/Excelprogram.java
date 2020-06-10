package com.selenium.basicprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelprogram {
	
	 public static void main(String[] args) throws IOException {
		
		 
		 File path =new File(".//driver//data.xlsx");
		 
		 FileInputStream src= new FileInputStream(path);
		 
		 XSSFWorkbook wb=new XSSFWorkbook(src);
		 
		 XSSFSheet ws= wb.getSheet("TC1");
		 
		 String username=ws.getRow(2).getCell(0).getStringCellValue();
		 
		 System.out.println(username);
		 
		 wb.close();
		 
	}

}
