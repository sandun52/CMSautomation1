package utility;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.model.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AimsDashBoard;
import pages.AimsLogging;
import testcases.test;

public class DriverConfigeration {
	
	 static ExtentReports extent;
	  private ExtentTest test;
	
	public static WebDriver openbrowser() throws Exception  {
		
		
		       try {
				WebDriverManager.chromedriver().setup();
				   DesiredCapabilities caps = new DesiredCapabilities();
				   caps.setAcceptInsecureCerts(true);
				   ChromeOptions option = new ChromeOptions();
				   option.addArguments("--start-maximized");
				    //option.addArguments("--incognito");
				   System.out.println("Chrome browser open successfully ");   
				   option.merge(caps);
				   WebDriver driver = new ChromeDriver(option);              
				   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				   driver.manage().window().maximize();
				   driver.get(utility.constant.URL);
				   
				   
				   
				    ReadXlRead redexl= new ReadXlRead();
				    redexl.getdata("aimslogging");
					String expected_title = ReadXlRead.getCellData(1,2);
				    System.out.println("Aims_title of page"+expected_title);
						
				   String actual_title = driver.getTitle();
				   assertEquals(actual_title, expected_title," Verify the title of logging page");
				   extent  = new ExtentReports();
				   ExtentReport.startTestCase("Verify Aims page navigation");
				  
				   if (actual_title.equals(expected_title)) {
					   
					   ExtentReport.logEventspass(actual_title);
					   
				   }else {
					   
					   ExtentReport.logEventsFail(actual_title);
				   }
				   
				
				   System.out.println("Url open successfully ");   
				 
				   return driver;
			} catch (EncryptedDocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		   //ExtentReport.setUpReport();
			return null;
		   
		   
		
		 // AimsLogging aims = new AimsLogging(driver);			  
		//  aims.logging_aims();		

	}
	
	
	
}
