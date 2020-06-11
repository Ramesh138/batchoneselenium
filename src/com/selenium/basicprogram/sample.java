package com.selenium.basicprogram;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample {
	
	public static String getdata(String testcasename,int cellnumber) throws IOException {
		
		File path= new File(".//driver//Testdata.xlsx");
		
		FileInputStream src=new FileInputStream(path);
		
		XSSFWorkbook wb= new XSSFWorkbook(src);
		
		XSSFSheet ws= wb.getSheet(testcasename);
		
		String data = ws.getRow(1).getCell(cellnumber).getStringCellValue();
		
		return data;
		
	}

}
