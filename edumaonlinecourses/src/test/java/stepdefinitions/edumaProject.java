package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class edumaProject {
	public static WebDriver driver;

	@Given("^Launch the LMS Url \"([^\"]*)\"$")
	public void launch_the_LMS_Url(String arg1) throws Throwable {
		
			System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
		    driver=new FirefoxDriver();
		    
		    driver.get("http://sethuonline.com/lms/");
		    driver.manage().window().maximize();
		    Thread.sleep(3000);
	    
	}

	@Then("^Click on home$")
	public void click_on_home() throws Throwable {
		driver.findElement(By.className("tc-menu-inner")).click();
	    
	}
	@Then("^Click on courses$")
	public void click_on_courses() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/header[@id='masthead']/div[@class='container']/div[@class='row']/div[@class='navigation col-sm-12']/div[@class='tm-table']/nav[@class='width-navigation table-cell table-right']/ul[@class='nav navbar-nav menu-main-menu']/li[@id='menu-item-8148']/a[1]")).click();
	    
	}

	@When("^Check for courses page is opened$")
	public void check_for_courses_page_is_opened() throws Throwable {
		String coursepage=driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).getText();
		System.out.println(coursepage);
		if(coursepage.contains("All Courses")) {
			System.out.println("courses page is opened");
		}
		else {
			System.out.println("courses page is not opened");
			}
		}
	   
	

	@When("^Click on Home$")
	public void click_on_Home() throws Throwable {
		
		
		driver.findElement(By.className("tc-menu-inner")).click();
		Thread.sleep(3000);
	}

	@Given("^Click on features$")
	public void click_on_features() throws Throwable {
		
		driver.findElement(By.xpath("//li[@id='menu-item-8110']//a[@class='tc-menu-inner'][contains(text(),'Features')]")).click();
		Thread.sleep(5000);
	    
	}

	@Then("^Check for features page is opened$")
	public void check_for_features_page_is_opened() throws Throwable {
		
	    
	}
	
	@Given("^Enter text in the search bar$")
	public void enter_text_in_the_search_bar() throws Throwable {
		driver.findElement(By.xpath("//input[@placeholder='What do you want to learn today?']")).sendKeys("test");
	    
	}

	@Then("^Click on Search button$")
	public void click_on_Search_button() throws Throwable {
	    driver.findElement(By.xpath("//i[@class='fa fa-search']")).click();
	}
	@Then("^Press home in all courses page$")
	public void press_home_in_all_courses_page() throws Throwable {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//li[@id='menu-item-8141']//a[@class='tc-menu-inner'][contains(text(),'Home')]")).click();
	    
	}

	@Given("^Click on Education word press theme$")
	public void click_on_Education_word_press_theme() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Education WordPress Theme')]")).click();
	    
	}

	@Then("^press return to home$")
	public void press_return_to_home() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menu-item-8141']//a[@class='tc-menu-inner'][contains(text(),'Home')]")).click();
	    
	}
	@Given("^Click on Best courses for photography$")
	public void click_on_Best_courses_for_photography() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Best Courses for Photography')]")).click();
	    
	}

	@Then("^press home in collections page$")
	public void press_home_in_collections_page() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menu-item-8141']//a[@class='tc-menu-inner'][contains(text(),'Home')]")).click();
		
	    
	}
	@Given("^Mouse hover on image introduction learn press -lms plugin$")
	public void mouse_hover_on_image_introduction_learn_press_lms_plugin() throws Throwable {
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Actions actions = new Actions(driver);
		WebElement imagelearnpress=driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/div[@id='main-content']/div[@id='main-home-content']/div[@class='vc_row wpb_row vc_row-fluid vc_custom_1471451798605']/div[@class='wpb_column vc_column_container vc_col-sm-12']/div[contains(@class,'vc_column-inner')]/div[@class='wpb_wrapper']/div[@class='thim-widget-courses']/div[@class='thim-course-grid']/div[1]/div[1]/div[1]/a[1]"));
		actions.moveToElement(imagelearnpress).perform();
		System.out.println("Done mousehover on image");
	    
	}

	@Then("^Click on READ MORE$")
	public void click_on_READ_MORE() throws Throwable {
		driver.findElement(By.xpath("//div[@class='thim-course-grid']//div[1]//div[1]//div[1]//a[2]")).click();
	   
	}

	@When("^General Page is opened$")
	public void general_Page_is_opened() throws Throwable {
		String generalpage=driver.findElement(By.xpath("//h2[contains(text(),'General')]")).getText();
		System.out.println(generalpage);
		if(generalpage.contains("General")) {
			System.out.println("General page is opened");
		}
		else {
			System.out.println("General page is not opened");
			}
		
	    
	}

	@Then("^click on home in General page$")
	public void click_on_home_in_General_page() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menu-item-8141']//a[@class='tc-menu-inner'][contains(text(),'Home')]")).click();
		
		
	}
	@Given("^Click on view all button$")
	public void click_on_view_all_button() throws Throwable {
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='view-all-courses position-bottom']")).click();
	    
	}

	@Then("^click on home in allcourses page$")
	public void click_on_home_in_allcourses_page() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@id='menu-item-8141']//a[@class='tc-menu-inner'][contains(text(),'Home')]")).click();
	    
	}







	



}
