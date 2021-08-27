package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators {
	
	//simplified code
	@FindBy(id="userName")
	public static WebElement emailid;
	
	@FindBy(id="password")
	public static WebElement Password;
	@FindBy(name="submitBtn")
	public static WebElement login_button;
	
	@FindBy(id="fromPlaceName")
	public static WebElement dropdown_1;
	
	@FindBy(id="toPlaceName")
	public static WebElement dropdown_2;
	
	@FindBy(xpath="//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")
	public static WebElement search;
	
	
}


/*	public static WebElement emailid(WebDriver driver) {

		return driver.findElement(By.id("userName"));
	}

	public static WebElement Password(WebDriver driver) {

		return driver.findElement(By.id("password"));

	}

	public static WebElement login_button(WebDriver driver) {

		return driver.findElement(By.name("submitBtn"));

	}

	public static WebElement dropdown_1(WebDriver driver) {

		 WebElement element1 = driver.findElement(By.id("fromPlaceName"));
		return element1;
		
	}
			public static WebElement dropdown_2(WebDriver driver) {
		WebElement element2 = driver.findElement(By.id("toPlaceName"));
		return element2;
		
		
	}
			
			
			public static WebElement search(WebDriver driver) {
				return driver.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button"));*/
