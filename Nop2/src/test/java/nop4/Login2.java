package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login2
{
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	    
       
	    
	}

	@When("the user enters a valid email and password")
	public void the_user_enters_a_valid_email_and_password() {
		 driver.get("https://demo.nopcommerce.com/");
		
	}

	@And("clicks the login button")
	public void clicks_the_login_button() {
		POM pm = new POM(driver);
		pm.testValidLogin();
		
	}

	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() {
	    
	}


}