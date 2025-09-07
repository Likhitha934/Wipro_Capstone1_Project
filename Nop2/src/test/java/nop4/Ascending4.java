package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Ascending4
{
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is on the notebooks category page")
	public void the_user_is_on_the_notebooks_category_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
       
		
	   
	}

	@When("the user selects {string} from the sort by dropdown")
	public void the_user_selects_from_the_sort_by_dropdown(String string) {
		 driver.get("https://demo.nopcommerce.com/notebooks");
         Select sortDropdown = new Select(driver.findElement(By.id("products-orderby")));
         sortDropdown.selectByVisibleText("Price: Low to High");
	    
	}

	@Then("the products should be sorted by price in ascending order")
	public void the_products_should_be_sorted_by_price_in_ascending_order() {
	    
	}



}