package utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AimsDashBoard;
import pages.AimsLogging;

public class DriverConfigeration {
	
  
	
	public static WebDriver openbrowser()  {
		   WebDriverManager.chromedriver().setup();
	       DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setAcceptInsecureCerts(true);
		   ChromeOptions option = new ChromeOptions();
		   option.addArguments("--start-maximized");
		    //option.addArguments("--incognito");
		   System.out.println("test0444");   
           option.merge(caps);
           WebDriver driver = new ChromeDriver(option);              
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get(utility.constant.URL);
		 
		   
		   return driver;
		//   ExtentReport.setUpReport();
		   
		   
		
		 // AimsLogging aims = new AimsLogging(driver);			  
		//  aims.logging_aims();		

	}
	
	
	
}
