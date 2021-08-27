package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonTest {
	@Test
	public void p() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Button")).click();

		driver.findElement(By.id("home")).click();
		driver.findElement(By.linkText("Button")).click();

		driver.findElement(By.cssSelector("button[id='position']")).click();
		driver.findElement(By.cssSelector("button[style='background-color:lightgreen']")).click();

		driver.findElement(By.xpath("//button[@id='size']")).click();

		driver.quit();
	}
}
