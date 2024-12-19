package pages;

import static org.testng.Assert.assertEquals;

import java.text.Format;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.MediaEntityBuilder;

import utility.ExtentReport;
import utility.ReadXlRead;
import utility.ReportscreenShort;

public class AimsLogging {
	
	  WebDriver driver ;	

	    public AimsLogging (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }

	
	By username = By.id("username");
	By pswrd = By.id("password");
    By logging = By.className("formButton");

  
    
  
        
        public void logging_aims() throws Exception {
        	
        	System.out.println("test");
        	
        	// utility.setExcelFile(Constant.path_testData + Constant.file_testData,Constant.sheet_LoginData);
    		
        	 try {
        		 
        		//ExtentReport.setUpReport();
        		ExtentReport.startTestCase("TC_sandun jayasinghe1");
        		 
        		ReadXlRead redexl= new ReadXlRead();
        		redexl.getdata("aimslogging");
				String usernames = ReadXlRead.getCellData(1, 0);
				String pw = ReadXlRead.getCellData(1,1);
				System.out.println("username"+usernames);
				System.out.println("pw"+pw);
				
				driver.findElement(username).sendKeys(usernames);
	    		driver.findElement(pswrd).sendKeys(pw);
	    		
	    	 	ExtentReport.logEvents( "PASSED test  ");
	    		System.out.println("test1");
	    		driver.findElement(logging).click();
	    		
	    		
	    		Thread.sleep(1000);
	    		
	    		
	    		
	    String pagetitle = driver.getTitle();
	    
	    System.out.println("getpagetitle"+pagetitle);
	    
	//    assert.assertEquals(pagetitle, "AIMS");
	    
	    		System.out.println("test3 failed screen short");
	    		
	    		
	    		Thread.sleep(1000);
	    		
	    		
	    		
	    		ReportscreenShort rep = new ReportscreenShort();
	    		String base64code = rep.getScreenshot(driver);
	    		String path = rep.getScreenshot(driver," AIMS_LOGGING.jpg");
	    		System.out.println("path"+path);
	    		
	        //	ExtentReport.logEventsFail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build());
	    
	    	
	    		
	    		ExtentReport.attachScreenshot(base64code);
	    		ExtentReport.attachScreenshot(base64code,"AimsLoggingpage");
	    		
	    		
	    		ExtentReport.addScreencastFromPath(path);
	    		
	    		ExtentReport.addScreencastFromPath(path, "AimsLoggingpage test");
	    		
	    		
	    		ExtentReport.logEventsFail("Title mismatched");
	    		
	    		//ExtentReport.logEventsFail(ExtentReport.attachScreenshot(driver, "Title mismatched"));
				
	    		//ExtentReport.logEventsFa(ExtentReport.attachScreenshot(driver, base64code));
	    		
	    		//ExtentReport.logEvents(base64code);
	    		
	    	  //  ExtentReport.logEventsFail(MediaEntityBuilder.createScreenCaptureFromBase64String(base64code).build());
	    		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				System.out.println("event error");
				ExtentReport.logEventsFail("failed");
	    		//ExtentReport.attachScreenshot(driver, ExtentReport.attachScreenshot(driver, "Title mismatched"));
				e.printStackTrace();
			}
        	 
        	 
    	
    	}
}
