package pages;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utility.ExtentReport;
import utility.ReadXlRead;

public class NewCampainglow1 {

	 static ExtentReports extent;
	  private ExtentTest test;

	By newcampaingbutton = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/form/div[1]/div[7]/div/div/div/div/div/a/button");
	
//	By campaingmangementlink1 = By.className("ant-menu-title-content");
	By Campaign_Title = By.xpath("//label[@title=\"Campaign Title\"]");
	
	

	  WebDriver driver ;	

	    public NewCampainglow1 (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void newcamping() throws InterruptedException, Exception, IOException {
		Thread.sleep(2000);
		System.out.println("New campaign button click ");
		driver.findElement(newcampaingbutton).click();
		System.out.println("New campaign button click successfully");
		
		ReadXlRead redexl= new ReadXlRead();
		redexl.getdata("NewCampain_GenaralIinfor");
		String expectedtitle = ReadXlRead.getCellData(1, 5);
		
		
  		String actual_title = driver.findElement(Campaign_Title).getText();
		assertEquals(actual_title, expectedtitle," Verify successfully click and navigate to new campaign page");
		ExtentReport.startTestCase("Verify successfully click and navigate to new campaign page");
		
		
	   if (actual_title.equals(expectedtitle)) {
			   
			   ExtentReport.logEventspass(expectedtitle);
			   
		   }else {
			   
			   ExtentReport.logEventsFail(expectedtitle);
		   }
		  
		
	}
	

}
