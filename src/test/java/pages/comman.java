package pages;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class comman {
	
	 WebDriver driver ;
	
	  public comman (WebDriver driver) {	
	    	
	    	this.driver= driver ;
	    	
	    }
	
	
	public WebDriver windowfocs() {
		
	   
		
		
	Set<String> windowHandles = driver.getWindowHandles();

    // Switch to the new tab
    for (String handle : windowHandles) {
        driver.switchTo().window(handle);
    }
	return driver;
  
    
	}
}
