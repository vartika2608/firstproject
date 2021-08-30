package Scripts;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class step1 {
	
	static WebDriver d1;
	
	@Given("open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vartika.Varshney\\Downloads\\chromedriver_win32\\chromedriver.exe");

		

		d1=new ChromeDriver();
		
		 d1.get("https://ksrtc.in/oprs-web/login/show.do");
		 d1.manage().window().maximize();
		
		System.out.println("given done");
	}
	
	@When("enter username and password")
	public void enter_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions

		d1.findElement(By.id("userName")).sendKeys("vartika.varshney@hcl.com");
		d1.findElement(By.id("password")).sendKeys("V@rtika2608");
		
		System.out.println("when done");
	}
	
	@Then("Login success")
	public void login_success() {
	    // Write code here that turns the phrase above into concrete actions
		 d1.findElement(By.id("submitBtn")).click();
		
		System.out.println("then done");
	}

	@Given("User successfully logged in into the application")
	public void user_successfully_logged_in_into_the_application() {
	    // Write code here that turns the phrase above into concrete actions
	    d1.get("https://ksrtc.in/oprs-web/guest/home.do?h=1");
	}
	@When("enter FromTo GoingTo DateOfDeparture and DateOfReturn")
	public void enter_from_to_going_to_date_of_departure_and_date_of_return() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element1 = d1.findElement(By.id("fromPlaceName"));

		WebElement element2 = d1.findElement(By.id("toPlaceName"));

		element1.sendKeys("Bengaluru");
		element1.sendKeys(Keys.ARROW_DOWN);
		element1.sendKeys(Keys.ENTER);

		element2.sendKeys("AATINGAL");
		element2.sendKeys(Keys.ARROW_DOWN);
		element2.sendKeys(Keys.ENTER);

		d1.findElement(By.id("txtJourneyDate")).click();
		d1.findElement(By.linkText("20")).click();

		d1.findElement(By.xpath("//*[@id='txtReturnJourneyDate']")).click();
		d1.findElement(By.linkText("25")).click();
	}
	@Then("Route found successfully")
	public void route_found_successfully() {
	
		JavascriptExecutor jse= (JavascriptExecutor)d1;
		jse.executeScript("scroll(0,450)");

		d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[2]/div/div[3]/div")).click();
		d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
	}
	
}


