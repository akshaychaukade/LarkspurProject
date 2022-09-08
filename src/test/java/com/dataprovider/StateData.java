package com.dataprovider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StateData {
	@DataProvider(name = "FirstDP")
	@Test
	public Object[][] dataprovider() throws IOException {
		Object[][] obj = null;
		// Logic to read data from Exel
		FileInputStream fis = new FileInputStream("D:\\Larksupr21A\\TestData.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		obj = new Object[rows][sheet.getRow(0).getLastCellNum()-1];
		// System.out.println(row.getCell(1).getStringCellValue() +"\t"+
		// row.getCell(2).getStringCellValue());
		// How to Load data in objet Array

		for (int i = 1; i <= rows; i++) {
			XSSFRow row = sheet.getRow(i);
			int cells = row.getLastCellNum();
			for (int j = 1; j < cells; j++) {
				Cell cell = row.getCell(j);
				obj[i - 1][j - 1] = cell.getStringCellValue();
			}
		}

		return obj;
	}

}