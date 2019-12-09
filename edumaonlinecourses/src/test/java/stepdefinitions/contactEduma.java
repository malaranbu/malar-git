package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class contactEduma {
	public static WebDriver driver;
	
	
	@Given("^Launch the webdriver url \"([^\"]*)\"$")
	public void launch_the_webdriver_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("http://sethuonline.com/lms/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@Then("^Click on the contact$")
	public void click_on_the_contact() throws Throwable {
	    driver.findElement(By.xpath("//li[@id='menu-item-8112']//a[@class='tc-menu-inner'][contains(text(),'Contact')]")).click();
	}

	@When("^Check for contact page is opened$")
	public void check_for_contact_page_is_opened() throws Throwable {
		String contactpage=driver.findElement(By.xpath("//h1[contains(text(),'Contact')]")).getText();
		System.out.println(contactpage);
		if(contactpage.contains("CONTACT")) {
			System.out.println("contactpage is opened");
		}
		else {
			System.out.println("contactpage is not opened");
			}
	}

	@Given("^Enter the name \"([^\"]*)\"$")
	public void enter_the_name(String arg1) throws Throwable {
	    driver.findElement(By.xpath("//input[@placeholder='Name *']")).sendKeys(arg1);
	}

	@When("^Enter the Email \"([^\"]*)\"$")
	public void enter_the_Email(String arg1) throws Throwable {
	    driver.findElement(By.xpath("//input[@placeholder='Email *']")).sendKeys(arg1);
	}

	@Then("^Enter the Subject \"([^\"]*)\"$")
	public void enter_the_Subject(String arg1) throws Throwable {
	   driver.findElement(By.xpath("//input[@placeholder='Subject *']")).sendKeys(arg1);
	}

	@Then("^Enter the message \"([^\"]*)\"$")
	public void enter_the_message(String arg1) throws Throwable {
	    driver.findElement(By.xpath("//textarea[@placeholder='Message *']")).sendKeys(arg1);
	}

	@Given("^Click on submit button$")
	public void click_on_submit_button() throws Throwable {
	   driver.findElement(By.xpath("//input[@class='wpcf7-form-control wpcf7-submit']")).click();
	   Thread.sleep(8000);  
	}



}
