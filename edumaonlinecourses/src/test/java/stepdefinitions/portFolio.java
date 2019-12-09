package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class portFolio {
	public static WebDriver driver;
	String baseUrl = "http://sethuonline.com/lms/";
	
	@Given("^Launch the LMS url\"([^\"]*)\"$")
	public void launch_the_LMS_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("http://sethuonline.com/lms/");
	    driver.manage().window().maximize();
	    Thread.sleep(8000);
	    
	}

	@Then("^Click on the Portfolio$")
	public void click_on_the_Portfolio() throws Throwable {
		driver.findElement(By.xpath("//li[@id='menu-item-8134']//a[@class='tc-menu-inner'][contains(text(),'Portfolio')]")).click();
                 //driver.get(baseUrl);					
        
        //driver.findElement(By.linkText("Portfolio")).click();	
        //System.out.println("title of page is: " + driver.getTitle());							
        //driver.quit();
		Thread.sleep(3000);
	    
	}

	@When("^Check for the portfolio page is opened$")
	public void check_for_the_portfolio_page_is_opened() throws Throwable {
		String portfoliopage=driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).getText();
		System.out.println(portfoliopage);
		if(portfoliopage.contains("PORFOLIO MANSONRY")) {
			System.out.println("portfoliopage is opened");
		}
		else {
			System.out.println("portfoliopage is not opened");
			}
		}
	

	@When("^Click on the home$")
	public void click_on_the_home() throws Throwable {
	    driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
	}

	@Given("^Click on the courses$")
	public void click_on_the_courses() throws Throwable {
	    driver.findElement(By.xpath("//a[@class='filter'][contains(text(),'Courses')]")).click();
	}

	@Then("^Click on the Books$")
	public void click_on_the_Books() throws Throwable {
		 driver.findElement(By.xpath("//a[@class='filter'][contains(text(),'Books')]")).click();
	}

	@Given("^mouse hover on the first image$")
	public void mouse_hover_on_the_first_image() throws Throwable {
		
		Actions actions = new Actions(driver);
		WebElement imageopenedbook=driver.findElement(By.xpath("//li[6]//div[1]//div[2]"));
		actions.moveToElement(imageopenedbook).perform();
		System.out.println("Done mousehover on image");
	}

	@Then("^Click on the homework$")
	public void click_on_the_homework() throws Throwable {
	    driver.findElement(By.className("portfolio-hover")).click();
	}

	@Then("^Check for the product description page$")
	public void check_for_the_product_description_page() throws Throwable {
		String portfoliopage=driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).getText();
		System.out.println(portfoliopage);
		if(portfoliopage.contains("PORFOLIO MANSONRY")) {
			System.out.println("portfoliopage is opened");
		}
		else {
			System.out.println("portfoliopage is not opened");
			}
	}

	@When("^Click on the home in the product description page$")
	public void click_on_the_home_in_the_product_description_page() throws Throwable {
	    
	}

	@Given("^Click on portfolio again$")
	public void click_on_portfolio_again() throws Throwable {
	    
	}

	@Then("^Again mouse over on first image$")
	public void again_mouse_over_on_first_image() throws Throwable {
	    
	}

	@Then("^Click on courses on image$")
	public void click_on_courses_on_image() throws Throwable {
	    
	}

	@When("^Check for project type courses page$")
	public void check_for_project_type_courses_page() throws Throwable {
	    
	}

	@Given("^Click on back button of the driver$")
	public void click_on_back_button_of_the_driver() throws Throwable {
	    
	}

	@Then("^Click on books$")
	public void click_on_books() throws Throwable {
	    
	}

	@Given("^Mouse hover on the image$")
	public void mouse_hover_on_the_image() throws Throwable {
	    
	}

	@Then("^Click on opened books$")
	public void click_on_opened_books() throws Throwable {
	    
	}

	@When("^Check for the opened books page$")
	public void check_for_the_opened_books_page() throws Throwable {
	    
	}

	@When("^Click home in the page$")
	public void click_home_in_the_page() throws Throwable {
	    
	}



}
