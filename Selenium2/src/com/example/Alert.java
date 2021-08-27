package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert {
	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Alert")).click();

		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();

		String msg = driver.switchTo().alert().getText();

		System.out.println(msg);

		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		driver.switchTo().alert().sendKeys("MYHCL");
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@id='btn']")).click();
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		driver.quit();

	}
}
