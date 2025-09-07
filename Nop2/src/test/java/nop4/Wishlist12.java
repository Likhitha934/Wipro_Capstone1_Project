package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Wishlist12 {
	WebDriver driver;
	WebDriverWait wait;
	@When("Check the website is in the home page")
	public void check_the_website_is_in_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
	}

	@Given("Find the product in Order to add into the wishlist")
	public void find_the_product_in_order_to_add_into_the_wishlist() {
		driver.findElement(By.xpath("//a[@href=\"/books\"]"));
	    driver.findElement(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]"));
	    driver.findElement(By.xpath(" //span[@class=\"wishlist-label\"]"));
	   
	 
		
	}

	@Then("Add the product to the wishlist")
	public void add_the_product_to_the_wishlist() {
	    
		
	}

}
