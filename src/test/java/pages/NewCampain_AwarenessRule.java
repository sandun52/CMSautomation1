package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NewCampain_AwarenessRule {
	
	By startdate = By.id("onetimeAwarenessCampaignStartDateEndDate");
	By Enddate = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/div[1]/div[2]/div/div/div[2]/div/div/div/div[3]/input");
	By Starttime = By.id("campaignStartTime");
	By next = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/div[3]/div[2]/button/span");
	
	
	By chanel = By.id("chanel");
	

	
	
	
	  WebDriver driver ;	

	    public NewCampain_AwarenessRule (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	    
	    
		public void Fillgeneralinfor_mode() throws Exception {
			 
			Thread.sleep(2000);
		    System.out.println("test08");
		    driver.findElement(startdate).click();
		    driver.findElement(startdate).sendKeys("2024-09-20");
		    driver.findElement(startdate).click();
		    driver.findElement(Enddate).sendKeys("2024-09-30");
		    		driver.findElement(startdate).sendKeys(Keys.ENTER);
		 
			
			
		}
		
		
		public void Fillawarenessrule_time() throws Exception {
			 
			Thread.sleep(2000);
		    System.out.println("test08");
		    driver.findElement(Starttime).click();
		    driver.findElement(Starttime).sendKeys("12:00:00PM");
	
		    		driver.findElement(Starttime).sendKeys(Keys.ENTER);
		 
			
			
		}

		
		public void Fillawarenessrule_next() throws Exception {
			 
			Thread.sleep(2000);
		    System.out.println("test08");
		    driver.findElement(next).click();
	
		 
			
			
		}

}
