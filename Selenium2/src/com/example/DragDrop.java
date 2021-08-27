package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragDrop {

	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Edit")).click();

		WebElement element1 = driver.findElement(By.id("email"));
		WebElement element2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(element1).click().sendKeys("Vartika");
		act1.keyDown(Keys.CONTROL).sendKeys("A");
		act1.sendKeys("X");
		act1.moveToElement(element2).click().keyDown(Keys.CONTROL).sendKeys("V");
		act1.keyUp(Keys.CONTROL).build().perform();
		driver.quit();

		// 2 method try
		// act1.doubleClick(driver.findElement(By.xpath("//input[@id='email']")))
		// .moveToElement(driver.findElement(By.xpath("//input[@type='text']"))).release().build().perform();

		// 1 method try
		// act1.dragAndDrop(element1, element2).build().perform();

	}
}
