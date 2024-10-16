package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AimsLogging;
import pages.CmsDashboard;
import utility.DriverConfigeration;
import org.openqa.selenium.WebDriver;

public class Testcase01 {
	
    WebDriver driver ;	
 
    
    
    @Test(priority = 0)
    public void Testcase01(WebDriver driver) {
    	this.driver= driver ;
		
	}
    	
	@Test(priority = 1)
	public void logging_to_aims() throws InterruptedException  {
		
		DriverConfigeration drcon = new  DriverConfigeration();
	    drcon.openbrowser();
		
		System.out.println("test 0123");
				
	}
	
	@Test(priority = 1)

	public void testtstng() {
			 
		
		System.out.println("test 456");
	}
	
/*	
	@Test(priority = 3)
	
	public void cmsnavi() {
		
		
		System.out.println("test 897");
		
		CmsDashboard cmsdsh = new CmsDashboard(driver);
		cmsdsh.navigate_to_campaingmangentlink();
		
		
		
	}

*/
}
