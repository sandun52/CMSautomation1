package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCampaingSetApprover {
	

	By setapprover = By.xpath("//span[contains(text(),\"Search by Employee Name or Email\")]");
	By setapprover_button = By.id("setAsApprover");
	
	By saveandsend_approve = By.xpath("//span[contains(text(),\"Save and Send for Approval\")]");
	By confirm_approve = By.xpath("//span[contains(text(),\"OK\")]");
	
	  WebDriver driver ;	

	    public NewCampaingSetApprover (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	    
	    
		public void setapprover() throws InterruptedException {
			
			Thread.sleep(2000);
		       System.out.println("hght");
				
		       driver.findElement(setapprover).click();
				driver.findElement(setapprover).sendKeys("ajithi@mobitel.lk");
				driver.findElement(setapprover).click();
				
			}
			

	public void saveandsendapprover() throws InterruptedException {
			
			   Thread.sleep(2000);
		       System.out.println("hght");
				
		       driver.findElement(saveandsend_approve).click();
	
				
			}
	
	
	public void confirm_approver() throws InterruptedException {
		
		   Thread.sleep(2000);
	       System.out.println("hght");
			
	       driver.findElement(confirm_approve).click();

			
		}
 
	    
}
