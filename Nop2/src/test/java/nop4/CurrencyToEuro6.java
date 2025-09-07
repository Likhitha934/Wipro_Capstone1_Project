package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CurrencyToEuro6 {
	WebDriver driver;
	WebDriverWait wait;
	
		
	@Given("the user1 is on the home page")
	public void the_user1_is_on_the_home_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
		
		
	    
	}

	@When("the user selects {string} from the currency dropdown")
	public void the_user_selects_from_the_currency_dropdown(String string) {
		driver.get("https://demo.nopcommerce.com/");
        Select currencyDropdown = new Select(driver.findElement(By.id("customerCurrency")));
        currencyDropdown.selectByVisibleText("Euro");
        
       
        
        
	   
	}

	@Then("the prices of all products should be displayed in Euros")
	public void the_prices_of_all_products_should_be_displayed_in_euros() {
		
	   
	}



}
