package oct_bdd_test.automation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App2 
{
	public static WebDriver driver;
	
    public static void main(String[] args) throws InterruptedException 
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
        driver=new FirefoxDriver();
    
            launchUrl();
            maximizeWindow();
            Thread.sleep(8000);
            WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@title,'Usabilla Feedback Button')]"));
			driver.switchTo().frame(frameElement);
			driver.findElement(By.xpath("//html//body//img")).click();
			
			
			WebElement frameElement1 = driver.findElement(By.xpath("//div[@id='contents')]"));
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
			
			driver.findElement(By.className("choice choice_general")).click();
			
			
		/*
		 * clickRegister(); emailId();
		 */
            

    }

    
    public static void launchUrl() {
    	driver.get("https://www.britishairways.com");
    	
    }
    public static void maximizeWindow() {
    	driver.manage().window().maximize();
    }
    public static void clickRegister() {
    	driver.findElement(By.className("register")).click();
    	
    }
    public static void emailId() {
    	driver.findElement(By.id("email")).sendKeys("malar.cse@gmail.com");
    }
}

