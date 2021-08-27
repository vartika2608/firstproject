package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class NestedFrames {
	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.findElement(By.linkText("Frame")).click();
		driver.switchTo().frame(0);

		driver.findElement(By.xpath("//button[@id='Click']")).click();
		String msg = driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(msg);
		driver.switchTo().defaultContent();// base screen
		// driver.switchTo().parentFrame();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//*[@id='Click1']")).click();

		driver.quit();

	}
}
