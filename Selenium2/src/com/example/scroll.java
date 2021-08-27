package com.example;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class scroll {
  
	  
	  
	  public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		  System.setProperty("webdriver.chrome.driver",

					"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

			WebDriver d1;

			d1=new ChromeDriver();

			d1.manage().window().maximize();

			d1.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");


			JavascriptExecutor jse=(JavascriptExecutor) d1;
			WebElement ele1=d1.findElement(By.xpath("/html/body/div[2]/section/div[3]/div[1]/div/p[9]/textarea"));

			jse.executeScript("arguments[0].scrollIntoView(true);",ele1);

			ele1.sendKeys("Vartika");


  }
}
