package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TextboxTest {

	@Test
	public void p() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("email")).sendKeys("Vartika");

		driver.findElement(By.cssSelector("input[value='Append ']")).sendKeys("V");

		driver.findElement(By.name("username")).sendKeys("Selenium");

		driver.findElement(By.xpath("//input[@value='Clear me!!']")).sendKeys("Clear");

		driver.findElement(By.cssSelector("input[style='width:350px;background-color:LightGrey;']")).click();

		driver.quit();

	}
}
