package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
//import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.ScreenCapture;
//import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class ExtentReport {
	 static ExtentReports extent;
	 static ExtentTest logger;
	
	public static void setUpReport ()
	   {
		
		
		//start reports
		
		String path = System.getProperty("user.dir") +"\\src\\test\\resources\\TestdataExecutionReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("CMS Regression Suite");
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setTheme(Theme.DARK.STANDARD); 
		
		extent  = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("TESTER", "SANDUN JAYASINGHE");
		
	//start reports
	
		//ExtentSparkReporter report = new ExtentSparkReporter(System.getProperty("user.dir") +"\\src\\test\\resources\\TestdataExecutionReport.html");
	//	report.config().setDocumentTitle("Automation Test Report"); // Sets the title of the report
	//	report.config().setReportName("CMS Regression Suite");          // Sets the heading/name of the report
	//	report.config().setTheme(Theme.DARK.STANDARD);                   // Opt
	//	report.config().setDocumentTitle(null);
		
		//Extent
     //	ExtentHtmlReporter htmlreporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"\\src\\test\\resources\\TestdataExecutionReport.html");
     	//extent = new 
     	
     //	extent  = new ExtentReports();
	//	extent.attachReporter(report);
	//	extent.setSystemInfo("Tester", "sandun jayasinghe");
		//extent.attachReporter(report);
				
				
				
	  
	   
	   
	   
	
	 //  ExtentTest test = extent.createTest("PROJECT CMS", "CMS Automation result");
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
	
	
	
	

	   public static void logEventspass (String value)
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
	       
		   return logger.addScreenCaptureFromPath(path);
		    
		  }
   
   
   public static ExtentTest addScreencastFromPath (String path, String screenme) throws Exception{
       
	   return logger.addScreenCaptureFromPath(path);
	    
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





	


