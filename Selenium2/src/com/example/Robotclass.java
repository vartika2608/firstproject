package com.example;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Robotclass {
	@Test
	public void p() throws IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("JavaScript Alerts")).click();

		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		String msg = driver.switchTo().alert().getText();

		System.out.println(msg);

		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		driver.switchTo().alert().sendKeys("MYHCL");
		driver.switchTo().alert().accept();
		

		Robot r1=new Robot();

		Dimension sc_size=Toolkit.getDefaultToolkit().getScreenSize();


		Rectangle rect1=new Rectangle(sc_size);
		
		BufferedImage source=	r1.createScreenCapture(rect1);
		
		File Destination=new File("C:\\Users\\Vartika.Varshney\\Desktop\\New folder\\pic2.jpg");
		
		ImageIO.write(source, "jpg", Destination);
	//	driver.quit();
	}
}
