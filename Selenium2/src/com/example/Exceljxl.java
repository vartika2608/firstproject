package com.example;

import java.awt.AWTException;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exceljxl {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException, BiffException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1 = new ChromeDriver();

		d1.manage().window().maximize();

		Workbook w1 = Workbook.getWorkbook(new File("C:\\Users\\Vartika.Varshney\\Documents\\Book1.xls"));

		Sheet s1 = w1.getSheet(0);

		for (int i = 1; i < s1.getRows(); i++) {
			String username = s1.getCell(0, i).getContents();
			String password = s1.getCell(1, i).getContents();

			d1.get("https://ksrtc.in/oprs-web/login/show.do");

			d1.findElement(By.id("userName")).sendKeys(username);
			d1.findElement(By.id("password")).sendKeys(password);

			d1.findElement(By.id("submitBtn")).click();
		}

	}

}