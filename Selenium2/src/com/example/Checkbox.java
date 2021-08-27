package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Checkbox {
  @Test
  public void p() {
	  
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Checkbox")).click();

		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/input")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();
	driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div[1]/input")).click();

		driver.quit();
	  
  }
}
