package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Register1
{
	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
       

        

        

	    
	}

	@When("the user fills in all required registration fields")
	public void the_user_fills_in_all_required_registration_fields() {
       
        

        // Find and fill registration fields
        POM pm = new POM(driver);
        pm.testSuccessfulRegistration();
        

        
        
		
	}

	@When("clicks the register button")
	public void clicks_the_register_button() {
		
		
        
		
	   
	}

}
