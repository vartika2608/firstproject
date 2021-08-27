package Functionality;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import elements.Locators;

public class Login {

@Test
	
	public void test() throws IOException {
		
		FileInputStream st=new FileInputStream("src\\Functionality\\Config.properties");
		
		Properties prop=new Properties();
		
		prop.load(st);
		
		String browser_name=prop.getProperty("browser");
		
		String Driver_path=prop.getProperty("driver_path");
		
		WebDriver driver;
		
		if (browser_name.equalsIgnoreCase("chrome")) {
			
		

		System.setProperty("webdriver.chrome.driver",Driver_path);
		driver=new ChromeDriver();
		
		}
		
		else if(browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",Driver_path);

		
		driver=new FirefoxDriver();
		}
		
		else
System.setProperty("webdriver.ie.driver",Driver_path);

		
		driver=new InternetExplorerDriver();
	
		//System.setProperty("webdriver.chrome.driver",

				//"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver.get("https://ksrtc.in/oprs-web/user/add.do");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=' Sign In']")).click();

		PageFactory.initElements(driver, Locators.class);
		Locators.emailid.sendKeys("vartika.varshney@hcl.com");
		Locators.Password.sendKeys("V@rtika2608");
		Locators.login_button.click();

		Locators.dropdown_1.sendKeys("Bengaluru");
		Locators.dropdown_1.sendKeys(Keys.ARROW_DOWN);
		Locators.dropdown_1.sendKeys(Keys.ENTER);

		Locators.dropdown_2.sendKeys("AATINGAL");
		Locators.dropdown_2.sendKeys(Keys.ARROW_DOWN);
		Locators.dropdown_2.sendKeys(Keys.ENTER);

		/*
		 * Locators.emailid(driver).sendKeys("vartika.varshney@hcl.com");
		 * Locators.Password(driver).sendKeys("V@rtika2608");
		 * Locators.login_button(driver).click();
		 * 
		 * Locators.dropdown_1(driver).sendKeys("Bengaluru");
		 * Locators.dropdown_1(driver).sendKeys(Keys.ARROW_DOWN);
		 * Locators.dropdown_1(driver).sendKeys(Keys.ENTER);
		 * 
		 * Locators.dropdown_2(driver).sendKeys("ADONI");
		 * Locators.dropdown_2(driver).sendKeys(Keys.ARROW_DOWN);
		 * Locators.dropdown_2(driver).sendKeys(Keys.ENTER);
		 */

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('txtJourneyDate').value='18/08/2021'");
		jse.executeScript("document.getElementById('txtReturnJourneyDate').value='28/08/2021'");

		jse.executeScript("scroll(0,450)");

		// Locators.search(driver).click();
		Locators.search.click();
		// driver.quit();
	}
}
