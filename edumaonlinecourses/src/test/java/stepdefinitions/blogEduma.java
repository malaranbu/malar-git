package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class blogEduma {
	public static WebDriver driver;
	
	@Given("^Launch the lms url \"([^\"]*)\"$")
	public void launch_the_lms_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("http://sethuonline.com/lms/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);

	    
	}

	@Then("^Click on blog$")
	public void click_on_blog() throws Throwable {
	    driver.findElement(By.xpath("//li[@id='menu-item-8113']//a[@class='tc-menu-inner'][contains(text(),'Blog')]")).click();
	    Thread.sleep(3000);
	}

	@When("^Check for blog page is opened$")
	public void check_for_blog_page_is_opened() throws Throwable {
		String blogpage=driver.findElement(By.xpath("//h1[contains(text(),'Blog')]")).getText();
		System.out.println(blogpage);
		if(blogpage.contains("BLOG")) {
			System.out.println("blogpage is opened");
		}
		else {
			System.out.println("blogpage is not opened");
			}
		Thread.sleep(3000);
	}

	@Given("^Click on image$")
	public void click_on_image() throws Throwable {
		driver.findElement(By.xpath("//img[@class='attachment-full size-full wp-post-image']")).click();
		Thread.sleep(3000);
	   
	}

	@Then("^Check for Business page is opened$")
	public void check_for_Business_page_is_opened() throws Throwable {
		String businesspage=driver.findElement(By.xpath("//h2[contains(text(),'Business')]")).getText();
		System.out.println(businesspage);
		if(businesspage.contains("BUSINESS")) {
			System.out.println("businesspage is opened");
		}
		else {
			System.out.println("businesspage is not opened");
			}
		Thread.sleep(3000);
	    
	}
	@Then("^Click on blog in business page$")
	public void click_on_blog_in_business_page() throws Throwable {
	   driver.findElement(By.xpath("//li[@id='menu-item-8113']//a[@class='tc-menu-inner'][contains(text(),'Blog')]")).click();
	   Thread.sleep(3000);
	}


	@Given("^Click on admin$")
	public void click_on_admin() throws Throwable {
		driver.findElement(By.xpath("//article[@id='post-3696']//a[contains(text(),'admin')]")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^Check for admin page is opened$")
	public void check_for_admin_page_is_opened() throws Throwable {
		String adminpage=driver.findElement(By.xpath("//span[@class='vcard']")).getText();
		System.out.println(adminpage);
		if(adminpage.contains("ADMIN")) {
			System.out.println("adminpage is opened");
		}
		else {
			System.out.println("adminpage is not opened");
			}	    
	}
	
	@Then("^Click on comment$")
	public void click_on_comment() throws Throwable {
	    driver.findElement(By.xpath("//article[@id='post-3696']//a[contains(text(),'0 comment')]")).click();
	    Thread.sleep(3000);
	}


	@When("^Check for comment section$")
	public void check_for_comment_section() throws Throwable {
		String commentsection=driver.findElement(By.xpath("//h3[@id='reply-title']")).getText();
		System.out.println(commentsection);
		if(commentsection.contains("LEAVE A REPLY")) {
			System.out.println("commentsection is opened");
		}
		else {
			System.out.println("commentsection is not opened");
			}	    
	}

	@Given("^Click on Blog in new page$")
	public void click_on_Blog_in_new_page() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement Element=driver.findElement(By.xpath("//li[@id='menu-item-8113']//a[@class='tc-menu-inner'][contains(text(),'Blog')]"));
		js.executeScript("arguments[0].scrollIntoView();", Element);
	    driver.findElement(By.xpath("//li[@id='menu-item-8113']//a[@class='tc-menu-inner'][contains(text(),'Blog')]")).click();
	    Thread.sleep(3000);
	}

	@Then("^Click on read more button$")
	public void click_on_read_more_button() throws Throwable {
	    driver.findElement(By.xpath("//article[@id='post-3696']//a[contains(text(),'Read More')]")).click();
	    Thread.sleep(3000);
	}

	@When("^Business page is opened$")
	public void business_page_is_opened() throws Throwable {
		String tagsection=driver.findElement(By.xpath("//span[contains(text(),'Tag:')]")).getText();
		System.out.println(tagsection);
		if(tagsection.contains("Tag")) {
			System.out.println("tagsection is opened");
		}
		else {
			System.out.println("tagsection is not opened");
			}	    
		 Thread.sleep(3000);
	    
	}

	@When("^Click on blog in new page$")
	public void click_on_blog_in_new_page() throws Throwable {
		driver.findElement(By.xpath("//li[@id='menu-item-8113']//a[@class='tc-menu-inner'][contains(text(),'Blog')]")).click();
	    
	}


}
