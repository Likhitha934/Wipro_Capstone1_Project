package nop4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM {
    
	  WebDriver driver;
    WebDriverWait wait;

  
   



	

  


	public POM(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
       
	}




	public void teardown() {
        // Closes the browser after each test method
        if (driver != null) {
            driver.quit();
        }
    }

   
    public void testSuccessfulRegistration() {
        // Test case for successful user registration
        driver.get("https://demo.nopcommerce.com/register");

        

        // Find and fill registration fields
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Likhitha");
        driver.findElement(By.id("LastName")).sendKeys("GN");
        driver.findElement(By.id("Email")).sendKeys("Likhitha25@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Password123");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("Password123");

        // Click the register button
        driver.findElement(By.id("register-button")).click();

        // Verify the success message
      //  WebElement successMessage = driver.findElement(By.className("result"));
       // Assert.assertEquals(successMessage.getText(), "Your registration completed");
    }

    
    public void testValidLogin() {
        // Test case for a valid user login
        driver.get("https://demo.nopcommerce.com/login");

        // Enter valid credentials
        driver.findElement(By.id("Email")).sendKeys("gnlikhitha67@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("Password123");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        
    }

        
       
        
      
        public void testShopByCategoryAndAddToCart() {
        	
        	
                WebDriver driver = new ChromeDriver();
                driver.get("https://demo.nopcommerce.com/");

                driver.findElement(By.xpath("//a[@href=\"/books\"]"));
        		driver.findElement(By.xpath("//button[@type=\"button\"]"));
        		driver.findElement(By.xpath("//a[@href=\"/cart\"]"));
        		

               
        }

       
        public void testWishlist() {
           
           
            driver.findElement(By.xpath("//a[@href=\"/books\"]"));
    	    driver.findElement(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]"));
    	    driver.findElement(By.xpath(" //span[@class=\"wishlist-label\"]"));
    	   
            
        }
        
      
        public void testSearchByFullKeyword() {
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.id("small-searchterms")).sendKeys("camera");
            driver.findElement(By.cssSelector(".search-box-button")).click();
            
        }
        
      
        public void testSearchByPartialKeyword() {
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.id("small-searchterms")).sendKeys("cam");
            driver.findElement(By.cssSelector(".search-box-button")).click();
            
        }
        
        
        public void testSortProductsByPriceAscending() {
            driver.get("https://demo.nopcommerce.com/notebooks");
            Select sortDropdown = new Select(driver.findElement(By.id("products-orderby")));
            sortDropdown.selectByVisibleText("Price: Low to High");
            
        }
      
        public void testChangeCurrencyToEuro() {
            driver.get("https://demo.nopcommerce.com/");
            Select currencyDropdown = new Select(driver.findElement(By.id("customerCurrency")));
            currencyDropdown.selectByVisibleText("Euro");
            
           
        }

       
        public void testSortProductsAlphabetically() {
            driver.get("https://demo.nopcommerce.com/computers");
            driver.findElement(By.linkText("Notebooks")).click();

            Select sortDropdown = new Select(driver.findElement(By.id("products-orderby")));
            sortDropdown.selectByVisibleText("Name: A to Z");

           
        }
        
        
        public void testSearchForNonExistentProduct() {
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.id("small-searchterms")).sendKeys("nonexistentproduct123");
            driver.findElement(By.cssSelector("button.search-box-button")).click();

         
        }
      
        public void testCheckBlogPosts() {
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Blog")).click();

            
        }
      
        
        public void testCheckNewProducts() {
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("New products")).click();

            
        }
        
       

           
        }

        
        
        
    
    


