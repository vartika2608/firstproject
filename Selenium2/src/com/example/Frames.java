package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames");
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Vartika");

	//	driver.switchTo().defaultContent();// base screen
	//	driver.switchTo().parentFrame();

		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
        
		driver.quit();

	}
}
