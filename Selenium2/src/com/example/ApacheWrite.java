package com.example;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.io.File;
public class ApacheWrite {

	@Test
	public void f() throws IOException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String filepath = ("C:\\Users\\Vartika.Varshney\\Documents\\Book1.xlsx");

		WebDriver d1;

		d1 = new ChromeDriver();

		d1.manage().window().maximize();

		String filepath1 = ("C:\\Users\\Vartika.Varshney\\Documents\\Book1.xlsx");

		File f1 = new File(filepath1);

		FileOutputStream fos = new FileOutputStream(f1);

		XSSFWorkbook w1 = new XSSFWorkbook();

		XSSFSheet s1 = w1.createSheet("Selenium");

		Row r1 = s1.createRow(6);

		Cell c1 = r1.createCell(5);

		c1.setCellType(CellType.STRING);

		c1.setCellValue("Passed");

		w1.write(fos);
	}

}
