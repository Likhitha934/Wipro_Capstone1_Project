package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_to_cart7 {
	WebDriver driver;
	WebDriverWait wait;
	
	@Given("Present in the Nop commerce Website Home Page")
	public void present_in_the_nop_commerce_website_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	   
	}

	@When("Select the Required Product")
	public void select_the_required_product() {
		driver.findElement(By.xpath("//a[@href=\"/books\"]"));
		driver.findElement(By.xpath("//button[@type=\"button\"]"));
		driver.findElement(By.xpath("//a[@href=\"/cart\"]"));
		
	    
	}

	@Then("Perform Add to cart1 operation")
	public void perform_add_to_cart1_operation() {
	    
	}

	


}
