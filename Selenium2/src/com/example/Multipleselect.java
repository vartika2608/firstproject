package com.example;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multipleselect {
	
	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Selectable.html");
		driver.manage().window().maximize();
		 
		 
		  List<WebElement> element1=driver.findElements(By.className("ui-widget-content"));
		  
		  int length=element1.size();
		  
		  System.out.println(length);
		  
		  
		  Actions act1=new Actions(driver);
		  
		  act1.keyDown(Keys.CONTROL)
		      .click(element1.get(0))
		      .click(element1.get(2))
		      .click(element1.get(4))
		      .click(element1.get(6)).build().perform();
			  
		  }
		  
	}
