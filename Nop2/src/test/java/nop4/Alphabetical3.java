package nop4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alphabetical3 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("the user is on the notebooks1 category page")
	public void the_user_is_on_the_notebooks1_category_page() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
	    
	}

	@When("the user selects {string} from the sort dropdown")
	public void the_user_selects_from_the_sort_dropdown(String string) {
		 driver.get("https://demo.nopcommerce.com/computers");
         driver.findElement(By.linkText("Notebooks")).click();

         Select sortDropdown = new Select(driver.findElement(By.id("products-orderby")));
         sortDropdown.selectByVisibleText("Name: A to Z");

         List<WebElement> productTitleElements = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
         List<String> productTitles = productTitleElements.stream()
                 .map(WebElement::getText)
                 .collect(Collectors.toList());

         List<String> sortedTitles = new ArrayList<>(productTitles);
         Collections.sort(sortedTitles);

       
      
		
	    
	}

	@Then("the products should be listed in ascending alphabetical order")
	public void the_products_should_be_listed_in_ascending_alphabetical_order() {
		
	   
	}



}
