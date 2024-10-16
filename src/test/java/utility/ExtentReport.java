package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;










public class ExtentReport {
	 static ExtentReports extent;
	static ExtentTest logger;
	
	public static void setUpReport ()
	   {
	//start reports
	
     	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"\\src\\test\\resources\\TestdataExecutionReport.html");
	
	   extent  = new ExtentReports();
	   extent.attachReporter(htmlreporter);
	
	
	//extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/ExecutionReport.html", true);
	   
	   
	 //  ExtentHtmlReporter html = new ExtentHtmlReporter("user/build/name/");
	  // htmlReporter.config().setAutoCreateRelativePathMedia(true);
	
	   }
	
	
	
	/*
	   public static String attachScreenshot (WebDriver driver, String screenshotName) throws Exception{
	       
		   return logger.addScreenCapture(utility.ReportscreenShort.getScreenshot(driver, screenshotName));
		    
		  }
	*/
	
	public static void startTestCase (String testcaseName)
	   {
	       logger = extent.createTest(testcaseName);
	   }
	
	
	
	

	   public static void logEvents (String value)
	   {
	       logger.log(Status.PASS, value);
	   }
	
	
	 public static void logEventsFail (String screenshot )
	   {
	       logger.log(Status.FAIL, screenshot);
	   }
	  
	
	   public static ExtentTest attachScreenshot (String bse64) throws Exception{
	       
		   return logger.addScreenCaptureFromBase64String(bse64);
		    
		  }
	  

	   public static ExtentTest attachScreenshot (String bse64 ,String screenshotName) throws Exception{
	       
		   return logger.addScreenCaptureFromBase64String(bse64);
		    
		  }
	   
	   
   public static ExtentTest addScreencastFromPath (String path) throws Exception{
	       
		   return logger.addScreencastFromPath(path);
		    
		  }
   
   
   public static ExtentTest addScreencastFromPath (String path, String screenme) throws Exception{
       
	   return logger.addScreencastFromPath(path);
	    
	  }

	   
	  // public static String attachScreenshot (WebDriver driver, String screenshotName) throws Exception{
	       
		  // return logger.addScreenCapture(util.getScreenshot(driver, screenshotName));
		    
		//  }
   
   


	   public static void createFinalReport()
	   {
	       extent.flush();
	      
	   }
	   //  ExtentReport.logEventsFail("Title mismatched");
	    // ExtentReport.logEventsFail(ExtentReport.attachScreenshot(driver, "Title mismatched"));




	
	}





	


