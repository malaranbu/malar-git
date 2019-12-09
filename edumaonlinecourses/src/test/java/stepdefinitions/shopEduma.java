package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class shopEduma {
	public static WebDriver driver;
	//String baseUrl ="http://sethuonline.com/lms/shop/?orderby=popularity";
	String baseUrl1 ="http://sethuonline.com/lms/product/cup-princely-break/";
	String baseUrl2 ="http://sethuonline.com/lms/cart/";
	
	
	@Given("^Launch the LMS url \"([^\"]*)\"$")
	public void launch_the_LMS_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("http://sethuonline.com/lms/");
	    driver.manage().window().maximize();
	    Thread.sleep(8000);
		
	}

	@Then("^Click on the Shop$")
	public void click_on_the_Shop() throws Throwable {
		driver.findElement(By.xpath("//li[@id='menu-item-8114']//a[@class='tc-menu-inner'][contains(text(),'Shop')]")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^Check for the Shop page is opened$")
	public void check_for_the_Shop_page_is_opened() throws Throwable {
		String shoppage=driver.findElement(By.xpath("//h1[contains(text(),'Shop')]")).getText();
		System.out.println(shoppage);
		if(shoppage.contains("SHOP")) {
			System.out.println("shoppage is opened");
			
		}else {
			System.out.println("Failed:shoppage is not opened");
		}
		Thread.sleep(3000);
	}

	@Given("^Click on home in the shop page$")
	public void click_on_home_in_the_shop_page() throws Throwable {
		driver.findElement(By.xpath("//ul[@id='breadcrumbs']//a[contains(text(),'Home')]")).click();
		Thread.sleep(3000);
	   
	}
	
	@When("^Click on Shop$")
	public void click_on_Shop() throws Throwable {
		driver.findElement(By.xpath("//li[@id='menu-item-8114']//a[@class='tc-menu-inner'][contains(text(),'Shop')]")).click();
		Thread.sleep(8000);


	    
	}


	@Then("^Select sort by popularity in the Drop down$")
	public void select_sort_by_popularity_in_the_Drop_down() throws Throwable {
	    Select product=new Select(driver.findElement(By.xpath("//select[@name='orderby']")));
	    product.selectByVisibleText("Sort by popularity");
	    product.selectByIndex(1);
	    Thread.sleep(8000);

	}

	@Given("^Click on cup princely break$")
	public void click_on_cup_princely_break() throws Throwable {

        //driver.get(baseUrl);					
        
        driver.findElement(By.xpath("//a[contains(text(),'Cup princely break')]")).click();	
        //System.out.println("title of page is: " + driver.getTitle());							
        //driver.quit();
        	
		
	}

	@Then("^Product description page should open$")
	public void product_description_page_should_open() throws Throwable {
		String productpage=driver.findElement(By.xpath("//h1[@class='product_title entry-title']")).getText();
		System.out.println(productpage);
		if(productpage.contains("Cup princely break")) {
			System.out.println("productpage is opened");
			
		}else {
			System.out.println("Failed:productpage is not opened");
		}
		Thread.sleep(8000);
	}

	@When("^Click on add to cart button$")
	public void click_on_add_to_cart_button() throws Throwable {
		driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();
		Thread.sleep(8000);
	}

	@When("^Click on view cart button$")
	public void click_on_view_cart_button() throws Throwable {
          driver.get(baseUrl1);					
        
        driver.findElement(By.linkText("View Cart")).click();	
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();
        	
	    
	}

	@Given("^Click on proceed to checkout$")
	public void click_on_proceed_to_checkout() throws Throwable {
        driver.get(baseUrl2);					
        
        driver.findElement(By.linkText("Proceed to checkout")).click();	
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();
		
	   
	}

	@Then("^Enter the first name \"([^\"]*)\"$")
	public void enter_the_first_name(String arg1) throws Throwable {
		driver.findElement(By.id("billing_first_name")).sendKeys(arg1);
	    
	}

	@When("^Enter the last name \"([^\"]*)\"$")
	public void enter_the_last_name(String arg1) throws Throwable {
		driver.findElement(By.id("billing_last_name")).sendKeys(arg1);
	    
	}

	@When("^Enter the company name \"([^\"]*)\"$")
	public void enter_the_company_name(String arg1) throws Throwable {
		driver.findElement(By.id("billing_company")).sendKeys(arg1);
	    
	}

	@Given("^Select the country as \"([^\"]*)\"$")
	public void select_the_country_as(String arg1) throws Throwable {
		Select country=new Select(driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")));
		country.selectByVisibleText("United Kingdom (UK)");
		country.selectByIndex(1);
	    Thread.sleep(8000);
		
	    
	}

	@Then("^Enter the First line address \"([^\"]*)\"$")
	public void enter_the_First_line_address(String arg1) throws Throwable {
		driver.findElement(By.id("billing_address_1")).sendKeys(arg1);
	    
	}

	@When("^Enter the second line address \"([^\"]*)\"$")
	public void enter_the_second_line_address(String arg1) throws Throwable {
		driver.findElement(By.id("billing_address_2")).sendKeys(arg1);
	}

	@When("^Enter the town as \"([^\"]*)\"$")
	public void enter_the_town_as(String arg1) throws Throwable {
		driver.findElement(By.id("billing_city")).sendKeys(arg1);
	}

	@Then("^Enter the country as \"([^\"]*)\"$")
	public void enter_the_country_as(String arg1) throws Throwable {
		driver.findElement(By.id("billing_state")).sendKeys(arg1);
	}

	@When("^Enter the postcode \"([^\"]*)\"$")
	public void enter_the_postcode(String arg1) throws Throwable {
		driver.findElement(By.id("billing_postcode")).sendKeys(arg1);
	}



}
