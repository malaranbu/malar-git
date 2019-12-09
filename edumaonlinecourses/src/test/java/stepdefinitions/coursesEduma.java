package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class coursesEduma {
	public static WebDriver driver;
	
	@Given("^Launch the homepage \"([^\"]*)\"$")
	public void launch_the_homepage(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("http://sethuonline.com/lms/#");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	    
	}

	@Then("^Click on courses in the homepage$")
	public void click_on_courses_in_the_homepage() throws Throwable {
	    driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/header[@id='masthead']/div[@class='container']/div[@class='row']/div[@class='navigation col-sm-12']/div[@class='tm-table']/nav[@class='width-navigation table-cell table-right']/ul[@class='nav navbar-nav menu-main-menu']/li[@id='menu-item-8148']/a[1]")).click();
	}

	@When("^Check for courses page opened$")
	public void check_for_courses_page_opened() throws Throwable {
		String coursepage=driver.findElement(By.xpath("//h1[contains(text(),'All Courses')]")).getText();
		System.out.println(coursepage);
		if(coursepage.contains("ALL COURSES ")) {
			System.out.println("courses page is opened");
		}
		else {
			System.out.println("courses page is not opened");
			}
		Thread.sleep(3000);
	}

	@When("^Click on vertical icon$")
	public void click_on_vertical_icon() throws Throwable {
	   driver.findElement(By.xpath("//i[@class='fa fa-list-ul']")).click();
	   Thread.sleep(8000);
	}

	@Then("^Click on horizontal icon$")
	public void click_on_horizontal_icon() throws Throwable {
	    driver.findElement(By.xpath("//i[@class='fa fa-th-large']")).click();
	    Thread.sleep(3000);
	}

	@Given("^Enter the value in search box \"([^\"]*)\"$")
	public void enter_the_value_in_search_box(String arg1) throws Throwable {
	    driver.findElement(By.xpath("//input[@placeholder='Search our courses']")).sendKeys(arg1);
	    Thread.sleep(3000);
	}

	@Then("^Mouse hover on first image$")
	public void mouse_hover_on_first_image() throws Throwable {
		Thread.sleep(3000);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)");
		Actions actions = new Actions(driver);
		WebElement lmsplugin=driver.findElement(By.xpath("//div[@id='post-5428']//div[@class='course-thumbnail']//img"));
		actions.moveToElement(lmsplugin).perform();
		System.out.println("Done mousehover on image");
	}

	@Then("^Check for general page is opened$")
	public void check_for_general_page_is_opened() throws Throwable {
		driver.findElement(By.xpath("//div[@id='post-5428']//a[@class='course-readmore'][contains(text(),'Read More')]")).click();
		Thread.sleep(3000);
	    
	
	}

	@When("^Click on All courses$")
	public void click_on_All_courses() throws Throwable {
	    driver.findElement(By.xpath("//span[contains(text(),'All courses')]")).click();
	    Thread.sleep(3000);
	}

	@Given("^Click on Admin$")
	public void click_on_Admin() throws Throwable {
	    driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/div[@id='main-content']/section[@class='content-area']/div[@class='container site-content sidebar-right']/div[@class='row']/main[@id='main']/div[@id='lp-archive-courses']/div[@id='thim-course-archive']/div[@id='post-5428']/div[@class='course-item']/div[@class='thim-course-content']/div[@class='course-author']/div[@class='author-contain']/div[@class='value']/a[1]")).click();
	    Thread.sleep(3000);
	}

	@Then("^Check for profile page is opened$")
	public void check_for_profile_page_is_opened() throws Throwable {
		String profilepage=driver.findElement(By.xpath("//h1[contains(text(),'Profile')]")).getText();
		System.out.println(profilepage);
		if(profilepage.contains("PROFILE")) {
			System.out.println("profilepage is opened");
		}
		else {
			System.out.println("profilepage is not opened");
			}
		Thread.sleep(3000);
	    
	}

	@Then("^Click on courses in the profile page$")
	public void click_on_courses_in_the_profile_page() throws Throwable {
		driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/header[@id='masthead']/div[@class='container']/div[@class='row']/div[@class='navigation col-sm-12']/div[@class='tm-table']/nav[@class='width-navigation table-cell table-right']/ul[@class='nav navbar-nav menu-main-menu']/li[@id='menu-item-8148']/a[1]")).click();

		Thread.sleep(3000);
	}

	@When("^Click on introduction to learn press$")
	public void click_on_introduction_to_learn_press() throws Throwable {
	    driver.findElement(By.xpath("//div[@id='post-5428']//a[contains(text(),'Introduction LearnPress')]")).click();
	    Thread.sleep(3000);
	}

	@Given("^Check for general page$")
	public void check_for_general_page() throws Throwable {
		String generalpage=driver.findElement(By.xpath("//h2[contains(text(),'General')]")).getText();
		System.out.println(generalpage);
		if(generalpage.contains("GENERAL")) {
			System.out.println("generalpage is opened");
		}
		else {
			System.out.println("generalpage is not opened");
			}
	    
	}

	@Then("^Click on courses in the general page$")
	public void click_on_courses_in_the_general_page() throws Throwable {
		driver.findElement(By.xpath("//body[@id='thim-body']/div[@id='wrapper-container']/div[@class='content-pusher']/header[@id='masthead']/div[@class='container']/div[@class='row']/div[@class='navigation col-sm-12']/div[@class='tm-table']/nav[@class='width-navigation table-cell table-right']/ul[@class='nav navbar-nav menu-main-menu']/li[@id='menu-item-8148']/a[1]")).click();
		Thread.sleep(3000);
	   
	}



}
