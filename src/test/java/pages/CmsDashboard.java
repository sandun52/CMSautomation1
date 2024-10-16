package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CmsDashboard {
	
	
	//By campaingmangementlink = By.xpath("//*[@id=\"root\"]/section/section/aside/div/ul/li[7]/span/span[2]");
	By campaignManagementLink =By.xpath("//*[@id=\"campaignBuilder\"]");
	
    
    WebDriver driver ;	

    public CmsDashboard (WebDriver driver) {	
    	
    	this.driver= driver ;
    	
    }
	
	public void navigate_to_campaingmangentlink() throws InterruptedException {
		
		
		System.out.println("56779");
		
		
		//driver.findElement(campaignManagementLink).click();
		
		Thread.sleep(2000);
		System.out.println("testing xpath");
		
		comman cmmn = new comman(driver);
		driver = cmmn.windowfocs();
		driver.findElement(campaignManagementLink).click();
		
	}
	

}
