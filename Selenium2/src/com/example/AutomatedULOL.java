package com.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatedULOL {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/AutoComplete.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("searchbox")).sendKeys("A");

		Thread.sleep(4000);

		List<WebElement> ele1 = driver.findElements(By.className("ui-menu-item"));

		int len = ele1.size();

		System.out.println(len);

		Thread.sleep(4000);

		for (WebElement list_values : ele1) {
			if (list_values.getText().equalsIgnoreCase("Afghanistan")) {

				list_values.click();

				break;
			}
		}

	}

}