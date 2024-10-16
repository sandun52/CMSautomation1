package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCampainglow1 {

	

	By newcampaingbutton = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/form/div[1]/div[7]/div/div/div/div/div/a/button");
	
//	By campaingmangementlink1 = By.className("ant-menu-title-content");

	  WebDriver driver ;	

	    public NewCampainglow1 (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void newcamping() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("test05");
		driver.findElement(newcampaingbutton).click();
		System.out.println("test06");
			
		
	}
	

}
