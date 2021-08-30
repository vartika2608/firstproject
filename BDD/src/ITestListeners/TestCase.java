package ITestListeners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ITestListeners.Listener.class)

public class TestCase {

	@Test
	public void Login() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver",

				"C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/user/add.do");
		// signin
		driver.findElement(By.id("email")).sendKeys("vartika.varshney@hcl.com");
		driver.findElement(By.id("fullName")).sendKeys("Vartika Varshney");
		driver.findElement(By.id("mobileNo")).sendKeys("9873830959");
		driver.findElement(By.name("SaveBtn")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);

		// Login the KSRTC by using creadtials.
		// driver.findElement(By.xpath("//a[contains(text(),'Sign
		// In')]")).click();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("userName")).sendKeys("vartika.varshney@hcl.com");
		driver.findElement(By.id("password")).sendKeys("V@rtika2608");
		driver.findElement(By.id("submitBtn")).click();

		// selecting location
		driver.findElement(By.xpath("//a[normalize-space()='Ballari - Bengaluru']")).click();
		driver.findElement(By.linkText("26")).click();
		driver.findElement(By.id("txtReturnJourneyDate")).click();
		driver.findElement(By.linkText("30")).click();

		// selecting the check box.
		driver.findElement(By.id("corover-close-btn")).click();
		// driver.findElement(By.id("singleLady")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary btn-lg btn-block btn-booking']")).click();
	}
}
