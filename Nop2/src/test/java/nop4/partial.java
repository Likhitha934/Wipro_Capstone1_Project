package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class partial
{

	WebDriver driver;
	WebDriverWait wait;
	
	
	
		
	
	@When("the user enters the partial keyword {string} into the search bar")
	public void the_user_enters_the_partial_keyword_into_the_search_bar(String string) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
		driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.id("small-searchterms")).sendKeys("cam");
        driver.findElement(By.cssSelector(".search-box-button")).click();
        
	    
	}

	@Then("a product with the title {string} should be displayed in the search results")
	public void a_product_with_the_title_should_be_displayed_in_the_search_results(String string) {
	    
	}



}
