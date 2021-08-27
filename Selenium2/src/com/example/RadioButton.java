package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RadioButton {
  @Test
  public void p() {
	  
	  
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		driver.findElement(By.linkText("Radio Button")).click();

		driver.findElement(By.xpath("//*[@id='yes']")).click();
		driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input")).click();

		driver.findElement(By.cssSelector("input[value='2']")).click();

		driver.quit();
	  
  }
}
