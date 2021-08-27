package com.example;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.File;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import jxl.read.biff.BiffException;

public class ApacheRead {

	public static void main(String args[]) throws IOException, BiffException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		File src = new File("C:\\Users\\Vartika.Varshney\\Documents\\Book2.xlsx");
		FileInputStream file = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(file);

		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();

		for (int i = 1; i < rowcount; i++) {

			String username = sheet1.getRow(i).getCell(0).getStringCellValue();

			String password = sheet1.getRow(i).getCell(1).getStringCellValue();

			driver.get("https://ksrtc.in/oprs-web/login/show.do");

			driver.findElement(By.id("userName")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);

			driver.findElement(By.id("submitBtn")).click();
		}
		wb.close();
		driver.close();
	}

}