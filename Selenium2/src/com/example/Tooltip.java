package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Tooltip {
	@Test
	public void f() {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/tooltip.html");
		driver.manage().window().maximize();
//getAttribute
		WebElement element = driver.findElement(By.id("age"));
		 String tool_tip= element.getAttribute("title");

		 System.out.println(tool_tip);

		// Using Action Class

		WebElement element1 = driver.findElement(By.id("age"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element1).build().perform();
//javascript Executor
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('age')");
	}
}