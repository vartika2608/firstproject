package com.example;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import jxl.read.biff.BiffException;

public class Datepicker {
  @Test
  public void f() {
	  
  }
	  public static void main(String[] args) throws  AWTException, BiffException, InterruptedException {

	  
	  
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('datepicker1').value='18/08/2021'");
  }
}
