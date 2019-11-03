package oct_bdd_test.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BritishAirways {
public static WebDriver driver;
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.gecko.driver","C:/Users/malar/Documents/software/geckodriver.exe");
        driver=new FirefoxDriver();
        
        driver.get("https://www.britishairways.com");
        driver.manage().window().maximize();
        driver.findElement(By.className("ng-binding open")).click();
        
    }

}
