package com.task.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class alldata {
	public static void Row_Column() throws IOException {
		File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven31\\Alldata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(1);
		int rows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			Cell c = row.getCell(0);
			CellType type = c.getCellType();

			System.out.println(c);

		}
		System.out.println("------------------------>");
		Row row = sheet.getRow(0);
		int cells = row.getPhysicalNumberOfCells();
		for (int i = 0; i < cells; i++) {
			Cell c = row.getCell(i);
			CellType type = c.getCellType();
			System.out.println(c);
			
				}
		}
		public static void main(String[] args) throws IOException {
	Row_Column();
		
		}

}


			// for (int i = 0; i <sheetAt.getPhysicalNumberOfRows(); i++) {
			// Row r = sheetAt.getRow(i);

			// for (int j = 0; j< r.getPhysicalNumberOfCells(); j++) {
			// Cell c = r.getCell(j);
			// String value = r.getStringCellValue();
			// System.out.println(c);
			// }

//	}
	
