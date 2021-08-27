package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitTypes {
	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Edit")).click();

		// driver.findElement(By.id("email")).sendKeys("Vartika");
		// Explicit Wait
		WebDriverWait var1 = new WebDriverWait(driver, 20);
		var1.until(ExpectedConditions.presenceOfElementLocated(By.id("email"))).sendKeys("Vartika");
		String value1 = driver.findElement(By.id("email")).getText();
		System.out.println(value1);

		// driver.quit();

	}
}
