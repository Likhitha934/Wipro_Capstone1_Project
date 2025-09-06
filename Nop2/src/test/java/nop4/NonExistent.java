package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NonExistent {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user3 is on the home page")
	public void the_user3_is_on_the_home_page() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	}

	@When("the user searches for a product with a non-existent keyword")
	public void the_user_searches_for_a_product_with_a_non_existent_keyword() {
		driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.id("small-searchterms")).sendKeys("nonexistentproduct123");
        driver.findElement(By.cssSelector("button.search-box-button")).click();
	    
	}

	@Then("a {string} message should be displayed")
	public void a_message_should_be_displayed(String string) {
	    
	}


}
