package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BlogPosts {
	WebDriver driver;
	WebDriverWait wait;
	@Given("Should be in the nopCommerce homepage")
	public void should_be_in_the_nop_commerce_homepage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https://demo.nopcommerce.com/register");
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		
	    }

	@When("click on the {string} link")
	public void click_on_the_link(String string) {
		driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Blog")).click();

	    
	}

	@Then("should see a list of blog posts")
	public void should_see_a_list_of_blog_posts() {
	    
	}



}
