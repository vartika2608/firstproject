package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CaseStudy {
	@Test
	public void p() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();



		driver.get("https://ksrtc.in/oprs-web/user/add.do");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		// Sign-UP
		driver.findElement(By.id("email")).sendKeys("vartika.varshney@hcl.com");
		driver.findElement(By.id("fullName")).sendKeys("Vartika Varshney");
		driver.findElement(By.id("mobileNo")).sendKeys("9873830959");
		driver.findElement(By.name("SaveBtn")).click();
		driver.switchTo().alert().accept();
		// login
		driver.findElement(By.xpath("//a[text()=' Sign In']")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.findElement(By.id("userName")).sendKeys("vartika.varshney@hcl.com");
		driver.findElement(By.id("password")).sendKeys("V@rtika2608");
		driver.findElement(By.name("submitBtn")).click();

		WebElement x = driver.findElement(By.xpath("//*[@id='routeSlider']/div/div[1]/div/div/ul/li[4]/a"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(x).build().perform();

		// Search Location
		WebElement element1 = driver.findElement(By.id("fromPlaceName"));

		WebElement element2 = driver.findElement(By.id("toPlaceName"));

		element1.sendKeys("Bengaluru");
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);

		element2.sendKeys("AATINGAL");
		element2.sendKeys(Keys.ARROW_DOWN);
		element2.sendKeys(Keys.ENTER);

		driver.findElement(By.id("txtJourneyDate")).click();
		driver.findElement(By.linkText("12")).click();

		driver.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
		driver.findElement(By.linkText("25")).click();
		
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[2]/div/div[3]/div")).click();
		driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();

	}
}
