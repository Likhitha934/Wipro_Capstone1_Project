package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Register
{
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is on the registration page")
	public void the_user_is_on_the_registration_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
       

        

        

	    
	}

	@When("the user fills in all required registration fields")
	public void the_user_fills_in_all_required_registration_fields() {
driver.get("https://demo.nopcommerce.com/register");

        

        // Find and fill registration fields
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Likhitha");
        driver.findElement(By.id("LastName")).sendKeys("GN");
        driver.findElement(By.id("Email")).sendKeys("Likhitha@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Password123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Password123");

        // Click the register button
        
		
	}

	@When("clicks the register button")
	public void clicks_the_register_button() {
		driver.findElement(By.id("register-button")).click();

		
	   
	}

}
