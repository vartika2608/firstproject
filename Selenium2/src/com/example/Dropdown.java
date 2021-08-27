package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown {
	@Test
	public void p() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Drop down")).click();

		Select select1 = new Select(driver.findElement(By.id("dropdown1")));
		select1.selectByVisibleText("Selenium");
		Select select2 = new Select(driver.findElement(By.name("dropdown2")));

		select2.selectByValue("3");
		Select select3 = new Select(driver.findElement(By.id("dropdown3")));
		select3.selectByIndex(3);

		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/select/option[5]")).click();
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select/option[2]")).click();

		Boolean msg = select3.isMultiple();
		System.out.println(msg);
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select/option[4]")).click();
		driver.quit();

	}
}
