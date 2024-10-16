package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCampaingManagement {
	
	
	  WebDriver driver ;	

	    public NewCampaingManagement (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	

	By campaingmangementlink = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/form/div[1]/div[7]/a");
	
	
	public void clickonnewCampaing() {
		
		
       System.out.println("hght");
		
		
		driver.findElement(campaingmangementlink).click();
		
	}
	

}
