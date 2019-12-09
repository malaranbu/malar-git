package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class examFile {
	public static WebDriver driver;
	
	@Given("^Launch the web browser url \"([^\"]*)\"$")
	public void launch_the_web_browser_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    driver.get("http://automationpractice.com/index.php");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@Then("^click on Sign in button$")
	public void click_on_Sign_in_button() throws Throwable {
		driver.findElement(By.className("login")).click();
		Thread.sleep(3000);
	    
	}

	@When("^Create an account page opens$")
	public void create_an_account_page_opens() throws Throwable {
		String accountpage=driver.findElement(By.xpath("//h3[contains(text(),'Create an account')]")).getText();
		System.out.println(accountpage);
		if(accountpage.contains("Create an account")) {
			System.out.println("account page is opened");
			
		}else {
			System.out.println("Failed:account page is not opened");
		}
	    
	}

	@Given("^Enter the email address$")
	public void enter_the_email_address() throws Throwable {
		driver.findElement(By.id("email_create")).sendKeys("malar.cse@gmail.com");
	    
	}

	@Then("^Click on create an account button$")
	public void click_on_create_an_account_button() throws Throwable {
		driver.findElement(By.xpath("//form[@id='create-account_form']//span[1]")).click();
		Thread.sleep(3000);
	    
	}

	@When("^Your personal information page should open$")
	public void your_personal_information_page_should_open() throws Throwable {
		String personalpage=driver.findElement(By.xpath("//h3[contains(text(),'Your personal information')]")).getText();
		System.out.println(personalpage);
		if(personalpage.contains("Create an account")) {
			System.out.println("personal page is opened");
			
		}else {
			System.out.println("Failed:personal page is not opened");
		}
	    
	}

	@Given("^Click on the\"([^\"]*)\" radio button in the title$")
	public void click_on_the_radio_button_in_the_title(String arg1) throws Throwable {
	    
	}

	@Then("^Enter Firstname$")
	public void enter_Firstname() throws Throwable {
	    
	}

	@Then("^Enter Last name$")
	public void enter_Last_name() throws Throwable {
	    
	}

	@Given("^Enter the Emailid$")
	public void enter_the_Emailid() throws Throwable {
	   
	}

	@Then("^Enter the Password$")
	public void enter_the_Password() throws Throwable {
	    
	}



}
