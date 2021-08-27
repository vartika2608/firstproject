package com.example;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	@Test
	public void p() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.com/demo");

		driver.findElement(
				By.xpath("//*[@id='Main']/section[1]/div/div/div[2]/div/div/div[2]/div/div/div[1]/div/a/small"))
				.click();

		Set<String> window_values = driver.getWindowHandles();

		java.util.Iterator<String> it1 = window_values.iterator();

		String w1 = it1.next();

		System.out.println(w1);

		String w2 = it1.next();

		System.out.println(w2);

		driver.switchTo().window(w2);

		System.out.println(driver.getTitle());

		driver.switchTo().window(w1);

	 driver.quit();
	}

}
