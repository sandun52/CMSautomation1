package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AimsLogging;
import pages.testgoogle;
import utility.DriverConfigeration;
import utility.ExtentReport;

public class tc_google {
	
	 WebDriver driver ;	
	@BeforeClass
	 
	 public void beforeclass () throws Exception {
		 
		    ExtentReport.setUpReport();	 
			DriverConfigeration drcon = new  DriverConfigeration();
		   driver=  drcon.openbrowser();
	 }
	
	 
   @Test(priority = 0)
   public void TC_CreateNewCampaing(WebDriver driver) {
   	
   	this.driver= driver ;
		
	}
   	

	
	
	@Test(priority = 1)
		public void logging_aims() throws Exception{
		
		      testgoogle aims = new testgoogle(driver);			  
			  aims.gmail_google();		

	}
	
	@AfterTest
	public void afterclass() {
		
		ExtentReport.createFinalReport();
		//driver.quit();
	}

}

