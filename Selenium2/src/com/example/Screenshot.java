package com.example;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {
	@Test
	public void p() throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("JavaScript Alerts")).click();

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		String msg = driver.switchTo().alert().getText();

		System.out.println(msg);

		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("MYHCL");
		driver.switchTo().alert().accept();
		

TakesScreenshot t1=(TakesScreenshot) driver;

		File Source=t1.getScreenshotAs(OutputType.FILE);

		File Destination=new File("C:\\Users\\Vartika.Varshney\\Desktop\\New folder\\pic1.jpg");

		FileHandler.copy(Source, Destination);

		 driver.quit();

	}
}
