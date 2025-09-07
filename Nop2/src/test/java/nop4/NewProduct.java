package nop4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewProduct {
	WebDriver driver;
	WebDriverWait wait;
	@Given("Present on the nopCommerce homepage")
	public void present_on_the_nop_commerce_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	    
	}

	@When("click on the new products")
	public void click_on_the_new_products() {
		driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("New products")).click();

        List<WebElement> newProductElements = driver.findElements(By.cssSelector("div.product-grid div.product-item"));
       
	}

	@Then("should see a list of new products")
	public void should_see_a_list_of_new_products() {
	    
	}



	


}
