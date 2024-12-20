package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.ExtentReport;
import utility.ReadXlRead;

public class AimsDashBoard {
	
	 static ExtentReports extent;
	  private ExtentTest test;
	By campmangesystem = By.xpath("/html/body/app-root/div[1]/div/div/div/div/div/app-dashboard/div/div/div/a/h5");
	
	//By campaingmangementlink = By.xpath("//*[@id='campaignBuilder']");
//	By campaignManagementLink =By.xpath("//*[@id=\"campaignBuilder\"]");
	
	//By campaingmangementlink1 = By.className("ant-menu-title-content");

	  WebDriver driver ;	

	    public AimsDashBoard (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void navigatetocms() throws Exception {
		Thread.sleep(2000);
		  System.out.println("verify able to view Campaing mangemnt system tag");
		  String campingtilename=  driver.findElement(campmangesystem).getText();
		 
		  ReadXlRead redexl= new ReadXlRead();
		  redexl.getdata("aimslogging");
		  
		  String expected_title = ReadXlRead.getCellData(1,4);
		  System.out.println("Aims tilename"+expected_title);
		  
		  
		  assertEquals(expected_title, campingtilename," Verify the Correct tile name display for campaing mangemnt");
		
		    extent  = new ExtentReports();
		   ExtentReport.startTestCase("Verify tile display for campaing mangement system");
		  
		   if (expected_title.equals(campingtilename)) {
			   
			   ExtentReport.logEventspass(campingtilename);
			   
		   }else {
			   
			   ExtentReport.logEventsFail(campingtilename);
		   }
		  
		  
		  
		 driver.findElement(campmangesystem).click();
		 Thread.sleep(2000);
		 
		 
		 System.out.println("Successfully navigated to Campaing Mangement system page ");
		
		    
		   
		 
		
	}
}
