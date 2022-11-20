package com.task.org;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class alldata_row {

	public static void specific_data() throws IOException {
		File f = new File("C:\\Users\\Priya\\eclipse-workspace\\Maven31\\Alldata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheet = wb.getSheetAt(1);
		int rows = sheet.getPhysicalNumberOfRows();
		for (int i = 0; i < rows; i++) {
			Row row = sheet.getRow(i);
			int cells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < cells; j++) {
				Cell c = row.getCell(j);
				CellType type = c.getCellType();

				if (type.equals(CellType.STRING)) {
					String stringCellValue = c.getStringCellValue();
					System.out.println(stringCellValue);

				} else if (type.equals(CellType.NUMERIC)) {
					double numeric = c.getNumericCellValue();
					int i2 = (int) numeric;
					String valueOf = String.valueOf(i2);
					System.out.println(valueOf);

				}

			}

		}
		wb.close();
	}

	public static void main(String[] args) throws IOException {
		specific_data();
	}

}
