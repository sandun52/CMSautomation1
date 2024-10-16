package pages;

import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.security.auth.callback.ConfirmationCallback;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.Robot;

import utility.ReadXlRead;

public class NewCampain_GenaralIinfor {
	
	
	By campaigntitle1 = By.id("campaignTitlev[1]/div[7]/a/button");
	By campaignmode = By.id("campaignMode");
	By campaigncatagry = By.id("campaignCategory");
	By campaigndiscription = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/div[3]/div/div/div/div[2]/div/div/span/div[1]/span/button");
	By campaigntype = By.id("campaignType");
	By campaigntypeval1 = By.id("campaignType");
	By campaignfileupload = By.id("supportiveDocuments");	
	By campaigntitle = By.xpath("//*[@id=\"campaignTitle\"]");
	By campaignhybrd = By.xpath("//*[@text()='Hybrid']");
	
	By deliveryRate = By.id("deliveryRate");
	
	By description = By.id("description");
	By nextgeneralinfor = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/button");
	
	
	
	
	
	
	
	
	  WebDriver driver ;	

	    public NewCampain_GenaralIinfor (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void Fillgeneralinfortitle() throws Exception {
		 Thread.sleep(2000);
		 System.out.println("test08");
		 
		ReadXlRead redexl= new ReadXlRead();
		
	    redexl.getdata("NewCampain_GenaralIinfor");
		
		String dsdsd = ReadXlRead.getCellData(1,0);
		 
		 System.out.println("dsdsd"+dsdsd);
		driver.findElement(campaigntitle).sendKeys(dsdsd);
	
		System.out.println("campaignname"+dsdsd);
		
		
		
		
	}
	
	
	public void Fillgeneralinfor_type() throws Exception {
		 
		Thread.sleep(2000);
	    System.out.println("test08");
	   
	    
	    driver.findElement(campaigntype).click();
	    
	   // driver.findElement(campaignhybrd).click();
	    
	/*    
	WebElement  option=driver.findElement(campaignhybrd);
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", option);
	    		//driver.execute_script("arguments[0].scrollIntoView();", option);
	    		option.click();
	    
	   */
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.DOWN);
	    driver.findElement(campaigntype).sendKeys(Keys.ENTER);
		
		
	}
	
	
	public void Fillgeneralinfor_catgry() throws Exception {
		 
		Thread.sleep(2000);
	    System.out.println("test08");
	    driver.findElement(campaigncatagry).click();
	    driver.findElement(campaigncatagry).sendKeys(Keys.DOWN);
	    driver.findElement(campaigncatagry).sendKeys(Keys.DOWN);
		driver.findElement(campaigncatagry).sendKeys(Keys.ENTER);
	 
		
		
	}
	
	public void Fillgeneralinfor_mode() throws Exception {
		 
		Thread.sleep(2000);
	    System.out.println("test08");
	    driver.findElement(campaignmode).click();
	    driver.findElement(campaignmode).sendKeys(Keys.DOWN);
	    		driver.findElement(campaignmode).sendKeys(Keys.ENTER);
	 
		
		
	}
	
	
	

	public void Fillgeneralinfor_discritonenter() throws Exception {
		 
		 Thread.sleep(2000);
	     System.out.println("test08");   
	    
	     
			ReadXlRead redexl= new ReadXlRead();
			
		    redexl.getdata("NewCampain_GenaralIinfor");
			
			String dsdsd = ReadXlRead.getCellData(1,0);
		 
		 System.out.println("discirption"+dsdsd);
	     driver.findElement(description).sendKeys(dsdsd);
	  
	}
		
	
	

	public void Fillgeneralinfor_fileupload() throws Exception {
		 
		 Thread.sleep(2000);
	     System.out.println("test08");   
	     
	     driver.findElement(campaignfileupload).sendKeys("D:\\automation\\cms\\fileupload\\TESTCASE21639.docx");
	     Thread.sleep(1000);
	     
	     Robot r = new Robot();
	     
	     System.out.println("window close");
	     r.keyPress(KeyEvent.VK_ESCAPE);
	     r.keyRelease(KeyEvent.VK_ESCAPE);
	     
	   //  WebElement currentElement = driver.switchTo().activeElement();
	    
	     
	   //  currentElement.sendKeys(Keys.ESCAPE);

	  
	}
	
	
	public void dilvaryrate	() throws Exception {
		
		System.out.println("set dilvary rate");
		
		ReadXlRead redexl= new ReadXlRead();
		  redexl.getdata("NewCampain_GenaralIinfor");
			
			String dsdsd = ReadXlRead.getCellData(1,3);
		 
		 System.out.println("deliveryRate"+dsdsd);
         driver.findElement(deliveryRate).sendKeys(dsdsd);		
		
	}
		
	
	
	public void next_generalinfor() throws Exception {
		
		 System.out.println("nextgeneralinfor");
		
		 
	
         driver.findElement(nextgeneralinfor).click();	
		
	}
		
	
}
