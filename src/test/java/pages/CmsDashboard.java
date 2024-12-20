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

public class CmsDashboard {
	 static ExtentReports extent;
	  private ExtentTest test;
	
	//By campaingmangementlink = By.xpath("//*[@id=\"root\"]/section/section/aside/div/ul/li[7]/span/span[2]");
	By campaignManagementLink =By.xpath("//*[@id=\"campaignBuilder\"]");
	By pageheading =By.xpath("//*[@id=\"root\"]/section/section/main/div/nav/ol/li/span[1]/a");
	
	
    
    WebDriver driver ;	

    public CmsDashboard (WebDriver driver) {	
    	
    	this.driver= driver ;
    	
    }
	
	public void navigate_to_campaingmangentlink() throws Exception {
		Thread.sleep(2000);
		
		comman cmmn = new comman(driver);
		driver = cmmn.windowfocs();
		driver.findElement(campaignManagementLink).click();
		System.out.println("Verify able to click aims management link ");
		
		ReadXlRead redexl= new ReadXlRead();
		redexl.getdata("campaign management page");
		String headingExpected = ReadXlRead.getCellData(1, 0);
		
		String headingActual =driver.findElement(pageheading).getText();
		


	
		assertEquals(headingActual, headingExpected," Verify successfully navigated to campaign mangement system page");
		Thread.sleep(2000);
		
		
		
	    extent  = new ExtentReports();
		   ExtentReport.startTestCase("Verify tile display for campaing mangement system");
		  
		   if (headingActual.equals(headingExpected)) {
			   
			   ExtentReport.logEventspass(headingExpected);
			   
		   }else {
			   
			   ExtentReport.logEventsFail(headingExpected);
		   }
		  
		
		
	
		
	}
	

}
