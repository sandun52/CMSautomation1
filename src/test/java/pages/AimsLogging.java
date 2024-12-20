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
        		
        		 
        		ReadXlRead redexl= new ReadXlRead();
        		redexl.getdata("aimslogging");
				String usernames = ReadXlRead.getCellData(1, 0);
				String pw = ReadXlRead.getCellData(1,1);
				System.out.println("username"+usernames);
				System.out.println("pw"+pw);
				
				driver.findElement(username).sendKeys(usernames);
	    		driver.findElement(pswrd).sendKeys(pw);
	    		
	    		driver.findElement(logging).click();
	    		Thread.sleep(2000);
	    		
	    		String expected_title = ReadXlRead.getCellData(1,3);
	    		
	    		String actual_title = driver.getTitle();
				assertEquals(actual_title, expected_title," Verify successfully logged to AIMS page");
	    		
	    
	    	 	//ExtentReport.logEventspass( "AIMS page logging ");
	    		System.out.println("Verify successfully logged to AIMS page");
	    		
	    		if (actual_title.equals(expected_title))
	    		{
	    			
	 			   ExtentReport.logEventspass(actual_title);
	    		}else {
	    			ExtentReport.logEventsFail(actual_title);
	    			ReportscreenShort rep = new ReportscreenShort();
		    		String base64code = rep.getScreenshot(driver);
		    		String path = rep.getScreenshot(driver," AIMS_LOGGING.jpg");
		    		System.out.println("path"+path);
		    		
		    		ExtentReport.attachScreenshot(base64code);
		    		ExtentReport.attachScreenshot(base64code,"AimsLoggingpage");
		    		
		    		
		    		ExtentReport.addScreencastFromPath(path);
		    		
		    		ExtentReport.addScreencastFromPath(path, "AimsLoggingpage test");
		    		
		    		
		    		ExtentReport.logEventsFail("Title mismatched");
	    				}
	    		
	    		
	    		Thread.sleep(1000);
	    		
	    		

	    		
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				System.out.println("event error");
				ExtentReport.logEventsFail("failed");
	    		//ExtentReport.attachScreenshot(driver, ExtentReport.attachScreenshot(driver, "Title mismatched"));
				e.printStackTrace();
			}
        	 
        	 
    	
    	}
}
