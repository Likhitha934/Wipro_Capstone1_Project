package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchFullKeyword11
{
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
	}

	@When("the user enters the full keyword {string} into the search bar")
	public void the_user_enters_the_full_keyword_into_the_search_bar(String string) {
		 driver.get("https://demo.nopcommerce.com/");
         driver.findElement(By.id("small-searchterms")).sendKeys("camera");
        
         
	    
	}

	@Then("clicks the search button")
	public void clicks_the_search_button() {
		 driver.findElement(By.cssSelector(".search-box-button")).click();
	   
	}
}