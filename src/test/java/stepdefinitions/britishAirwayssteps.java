package stepdefinitions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class britishAirwayssteps {
	public static WebDriver driver;
	

	
	@Given("^launch british airways url \"([^\"]*)\"$")
	public void launch_british_airways_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
	    driver=new FirefoxDriver();
	    
	    driver.get("https://www.britishairways.com/travel/home/public/en_gb/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

	@Given("^click on the Registration link$")
	public void click_on_the_Registration_link() throws Throwable {
		driver.findElement(By.className("register")).click();
		Thread.sleep(3000);
	    
	}

	@Then("^check for the registration page is opened$")
	public void check_for_the_registration_page_is_opened() throws Throwable {
		String regpage=driver.getTitle();
		if(regpage.contains("Registration page")) {
			System.out.println("Registration page is opened");
			
		}else {
			System.out.println("Failed: Registration page is not opened");
		}
		
	}
		@Given("^enter the email id \"([^\"]*)\"$")
		public void enter_the_email_id(String arg1) throws Throwable {
			driver.findElement(By.id("email")).sendKeys(arg1);
		    
		}

		@Then("^confirm the email id \"([^\"]*)\"$")
		public void confirm_the_email_id(String arg1) throws Throwable {
			driver.findElement(By.id("confirm-email")).sendKeys(arg1);
		}

		@Given("^enter the password \"([^\"]*)\"$")
		public void enter_the_password(String arg1) throws Throwable {
			driver.findElement(By.id("pass")).sendKeys(arg1);
		}

		@Then("^confirm the same \"([^\"]*)\"$")
		public void confirm_the_same(String arg1) throws Throwable {
			driver.findElement(By.id("confirm-password")).sendKeys(arg1);
		}

		@Given("^Select the title \"([^\"]*)\"$")
		public void select_the_title(String arg1) throws Throwable {
			Select dropdown = new Select(driver.findElement(By.id(("title"))));
			dropdown.selectByValue(arg1);
		}

		

		@Given("^enter the first name$")
		public void enter_the_first_name() throws Throwable {
			driver.findElement(By.id("first-name")).sendKeys("malar");
		}

		

		@Given("^enter the last name$")
		public void enter_the_last_name() throws Throwable {
			driver.findElement(By.id("family-name")).sendKeys("anbu");
		}

		

		@Given("^click on \"([^\"]*)\" Radio button$")
		public void click_on_Radio_button(String arg1) throws Throwable {
			driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]")).click();
			
		}

		
		@Given("^Click on Join Now button$")
		public void click_on_Join_Now_button() throws Throwable {
			driver.findElement(By.id("submitButton")).click();
		}
		
		@Then("^Check for user already exist message$")
		public void check_for_Hello_Malarvizhi_welcome_to_BA_page_is_opened() throws Throwable {
			String welcomepage=driver.findElement(By.id("appErrors")).getText();
			System.out.println(welcomepage);
			if(welcomepage.contains("Username is already taken")) {
				System.out.println("Register or join now page is opened");
				
			}else {
				System.out.println("Failed:Register or join now page is not opened");
			}
			
		}
		@Given("^Click on the Book link$")
		public void click_on_the_Book_link() throws Throwable {
				driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
		   
		}

		@When("^Click on the Book a flight link$")
		public void click_on_the_Book_a_flight_link() throws Throwable {
		   driver.findElement(By.linkText("Book a flight")).click();
		}

		@Then("^British Airways flights page should open$")
		public void british_Airways_flights_page_should_open() throws Throwable {
		    String flightpage=driver.findElement(By.id("1483931525196")).getText();
		    System.out.println(flightpage);
		    if(flightpage.contains("Where would you like to go?\r\n" + 
		    		"We can help you get to more than 170 destinations worldwide from the four London airports (London Heathrow, London Gatwick, London City and London Stansted). Whether you're thinking of a weekend break in Europe or exploring the ancient cultures of Asia we can take you there."))
		    {
		    	System.out.println("British Airways flight page is opened");
		    	}
		    	else {
		    		System.out.println("Failed:British Airways flight page is not opened");
		    	}
		    }


		@Given("^Click on the More destination link in Europe section$")
		public void click_on_the_More_destination_link_in_Europe_section() throws Throwable {
		    driver.findElement(By.xpath("//body[@id='threeColumnResp']/div[@id='bodyWrapper']/section[@id='baBody']/section[@id='page']/div[@class='large-10 medium-9 small-12 columns']/div[@class='row']/div[@id='pageContentMain']/section[@id='1483931534136']/article[2]/a[1]")).click();
		}

		@Given("^Our cheapest fares from London in economy page should open$")
		public void our_cheapest_fares_from_London_in_economy_page_should_open() throws Throwable {
			String cheapestpage=driver.findElement(By.xpath("//h1[contains(text(),'Our cheapest fares from')]")).getText();
			System.out.println(cheapestpage);
			if(cheapestpage.contains("Our cheapest fares from London in economy"))
				{
					System.out.println("Our cheapest fares from London in economy page is opened");
					}
				else {
					System.out.println("Failed:Our cheapest fares from London in economy page is not opened");
				
				}
		    
		}

		@Given("^Enter the To as \"([^\"]*)\"$")
		public void enter_the_To_as(String arg1) throws Throwable {
		    //driver.findElement(By.id("toFilter")).sendKeys("France,paris(par)");
			 driver.findElement(By.id("toFilter")).sendKeys("PAR");
			 
			 Thread.sleep(3000); 
			 List<WebElement> toFilter =driver.findElements(By.xpath("//ul[@id='destChoices']/ul/li"));
			 
			 System.out.println(toFilter.size());
			 
			 for(int i=0 ; i<=toFilter.size(); i++) {
			 if(toFilter.get(i).getText().contains("Spain")) {
				 toFilter.get(i).click(); break;
			 }

		}
		}

		@Given("^Click on One-way radio button$")
		public void click_on_One_way_radio_button() throws Throwable {
		    driver.findElement(By.xpath("//span[contains(text(),'one')]")).click();
		}

		@Then("^Select the Travel \"([^\"]*)\"$")
		public void select_the_Travel(String arg1) throws Throwable {
			Select dropdown1 = new Select(driver.findElement(By.id(("cabinFilter"))));
			dropdown1.selectByVisibleText(arg1);
		    
		}

		@Given("^Click on  Find lowest price button$")
		public void click_on_Find_lowest_price_button() throws Throwable {
		    driver.findElement(By.xpath("//input[@class='button btn-primary small-button translate']")).click();
		    
		}

		@Then("^No destination available should display$")
		public void no_destination_available_should_display() throws Throwable {
			String nodestination=driver.findElement(By.xpath("//table[@id='tabpanel01']//h3[contains(text(),'No destinations available.')]")).getText();
			System.out.println(nodestination);
			if(nodestination.contains("No destinations available."))
			{
				System.out.println("No destination available is displayed");
			}
			else {
				System.out.println("Failed:No destination available is not displayed");
			}
			}
			
			
		@Then("^Click on the feedback image$")
		public void click_on_the_feedback_image() throws Throwable {
			WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Button')]"));
			driver.switchTo().frame(frameElement);
			driver.findElement(By.xpath("//html//body//img")).click();
		   
		}

		@Then("^check for British Airways website feedback$")
		public void check_for_British_Airways_website_feedback() throws Throwable {
			WebElement frameElement1 = driver.findElement(By.xpath("//div[@id='contents']"));
			driver.switchTo().frame(frameElement1);
			
            
			
			String feedback=driver.findElement(By.xpath("//h2[contains(text(),'British Airways website feedback')]")).getText();
			System.out.println(feedback);
			if(feedback.contains("British Airways website feedback "))
			{
				System.out.println("British Airways website feedback is displayed");
			}
			else {
				System.out.println("Failed:British Airways website feedback is not displayed");
			}
			
		    
		}
		@Given("^Click on the site feedback$")
		public void click_on_the_site_feedback() throws Throwable {
			
			driver.findElement(By.className("choice choice_general")).click();
		    
		}

		@Then("^Check for What was using the website like\\? Frame is opened$")
		public void check_for_What_was_using_the_website_like_Frame_is_opened() throws Throwable {
			WebElement frameElement2 = driver.findElement(By.xpath("//form[contains(@class,'usabilla_ui_form')]"));
			driver.switchTo().frame(frameElement2);
			String newframe=driver.findElement(By.xpath("//h3[@id='star-input']")).getText();
			System.out.println(newframe);
			if(newframe.contains("What was using the website like? "))
			{
				System.out.println("What was using the website like? is displayed");
			}
			else {
				System.out.println("Failed:What was using the website like? is not displayed");
			}
			
			
		    
		}

		@Then("^Click on Like smiley$")
		public void click_on_Like_smiley() throws Throwable {
			driver.findElement(By.xpath("//input[@id='star4']")).click();
			
		    
		}

		@When("^Get text as please tell us more$")
		public void get_text_as_please_tell_us_more() throws Throwable {
			String comment=driver.findElement(By.xpath("//h4[@id='comment-input']")).getText();
			System.out.println(comment);
			if(comment.contains("Please tell us more"))
			{
				System.out.println("Please tell us more is displayed");
			}
			else {
				System.out.println("Failed:Please tell us more is not displayed");
			}
		   
		}

		@Then("^Fill the text box with comments$")
		public void fill_the_text_box_with_comments() throws Throwable {
			driver.findElement(By.xpath("//textarea[@name='feedback']")).sendKeys("good");
		   
		}

		@Given("^Click the done button$")
		public void click_the_done_button() throws Throwable {
			driver.findElement(By.className("submit")).click();
		    
		}

		@Then("^Check for Good to know frame is opened$")
		public void check_for_Good_to_know_frame_is_opened() throws Throwable {
			WebElement frameElement3 = driver.findElement(By.xpath("//div[@class='feedback']"));
			driver.switchTo().frame(frameElement3);
			String lastframe=driver.findElement(By.xpath("//h2[contains(text(),'Good to know')]")).getText();
			System.out.println(lastframe);
			if(lastframe.contains("Good to know "))
			{
				System.out.println("Good to know is displayed");
			}
			else {
				System.out.println("Failed:Good to know is not displayed");
			}
			
		   
		}

		@Then("^click on done button$")
		public void click_on_done_button() throws Throwable {
			driver.findElement(By.className("continue")).click();
		   
		}




			

		    
		}


		
		


	





