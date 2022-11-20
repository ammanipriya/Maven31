package com.task.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data {
	static Logger log = Logger.getLogger(Write_data.class);
	public static void data_excel(String sheetname) throws IOException {
File f =new File("C:\\Users\\Priya\\Desktop\\Alldata.xlsx");
FileInputStream fis = new FileInputStream(f);
Workbook wb = new XSSFWorkbook(fis);
wb.createSheet(sheetname).createRow(0).createCell(0).setCellValue("oneplus");
wb.getSheet(sheetname).getRow(0).createCell(1).setCellValue("123");
wb.getSheet(sheetname).createRow(1).createCell(0).setCellValue("samsung");
wb.getSheet(sheetname).getRow(1).createCell(1).setCellValue("567");
wb.getSheet(sheetname).createRow(2).createCell(0).setCellValue("nokia");
wb.getSheet(sheetname).getRow(2).createCell(1).setCellValue("8776");
FileOutputStream fos =new FileOutputStream(f);
wb.write(fos);
wb.close();
		
	}
public static void main(String[] args) throws IOException {
	BasicConfigurator.configure();
	log.info("Row created successfully");
	data_excel("data3");
}
	
	
}
