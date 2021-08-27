
package com.example;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.read.biff.BiffException;

public class RobotFramework {



	public static void main(String[] args) throws  AWTException, BiffException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");


		WebDriver driver;

		driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.id("pickfiles")).click();
		
	
	String file="C:\\Users\\Vartika.Varshney\\Documents\\name.docx";
	
	StringSelection select1=new StringSelection(file);
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select1, null);
	
	Thread.sleep(4000);
	
	Robot robot1=new Robot();
	
	robot1.keyPress(KeyEvent.VK_CONTROL);
	
	robot1.keyPress(KeyEvent.VK_V);
	
	robot1.keyRelease(KeyEvent.VK_V);
	
	robot1.keyRelease(KeyEvent.VK_CONTROL);
	
	robot1.keyPress(KeyEvent.VK_ENTER);
	
	 }
}
