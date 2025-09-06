package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
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
		 driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		
        driver.findElement(By.id("Email")).sendKeys("Likhitha@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Password123");
        
	}

	@And("clicks the login button")
	public void clicks_the_login_button() {
		driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]")).click();
	   
	}

	@Then("the user should be redirected to the home page")
	public void the_user_should_be_redirected_to_the_home_page() {
	    
	}


}