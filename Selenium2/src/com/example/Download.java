package com.example;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Download {
	public static void main(String[] args) throws InterruptedException, IOException, AWTException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d1;

		d1 = new ChromeDriver();
		d1.manage().window().maximize();

		d1.get("http://demo.automationtesting.in/FileDownload.html");
		d1.findElement(By.linkText("Download")).click();
		File flocation = new File("C:\\Users\\Vartika.Varshney\\Downloads");

		File[] total_files = flocation.listFiles();
		for (File file : total_files)

			if (file.getName().equalsIgnoreCase("samplefile.pdf")) {

				System.out.println("File downloaded");
				break;
			}
		

	}
}
