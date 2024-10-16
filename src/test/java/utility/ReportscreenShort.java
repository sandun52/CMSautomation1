package utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReportscreenShort {
	
	
public static String getScreenshot(WebDriver driver) throws Exception {
        //below line is just to append the date format with the screenshot name to avoid duplicate names       
  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
  TakesScreenshot ts = (TakesScreenshot) driver;
  String base64 = ts.getScreenshotAs(OutputType.BASE64);
  System.out.println("screen short save successfuly");
   return base64;
}
	

		
	
	
public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
        //below line is just to append the date format with the screenshot name to avoid duplicate names       
        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
//String destination = System.getProperty("user.dir") + "\\FailedTestsScreenshots\\"+screenshotName+dateName+".png";
File destination = new File(System.getProperty("user.dir") + "/FailedTestsScreenshots/"+screenshotName+dateName+".png");
//File finalDestination = new File(destination);
FileUtils.copyFile(source, destination);
        //Returns the captured file path
String screenshotsPath = destination.getAbsolutePath();
return screenshotsPath;
}



}
