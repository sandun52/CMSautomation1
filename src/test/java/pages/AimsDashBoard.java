package pages;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AimsDashBoard {
	
	
	By campmangesystem = By.xpath("/html/body/app-root/div[1]/div/div/div/div/div/app-dashboard/div/div/div/a/h5");
	
	//By campaingmangementlink = By.xpath("//*[@id='campaignBuilder']");
//	By campaignManagementLink =By.xpath("//*[@id=\"campaignBuilder\"]");
	
	//By campaingmangementlink1 = By.className("ant-menu-title-content");

	  WebDriver driver ;	

	    public AimsDashBoard (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void navigatetocms() throws InterruptedException {
		Thread.sleep(2000);
		 System.out.println("test05");
		driver.findElement(campmangesystem).click();
		System.out.println("test06");
		
		
		
	}
}
