package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utility.ReadXlRead;

public class NewCampain_AwarenessInfor {
	
	By channelType = By.id("channelType");
	By chanel = By.id("chanel");
	By languageType = By.id("languageType");
	By deviceType = By.id("deviceType");
	By audinceidname = By.id("testAudience");
	//By audincecheckbitton = By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/div[3]/div[3]/div/div/div/div/div/button/span");
	
	By audincecheckbitton =By.xpath("//span[contains(text(),\"Check with Test Audience\")]");
	By checkboxclick = By.id("isTested");
	By audincecselectName= By.id("audience");
	By audincecsenterdescription= By.id("description");
	By audincecsenterde_next= By.xpath("//*[@id=\"root\"]/section/section/main/div/section/div[2]/div/form/div[8]/div[2]/button/span");
	
	
	
	
	
	
	
	//*[@id="root"]/section/section/main/div/section/div[2]/div/form/div[6]/div[1]/div/div/div[2]/div/div/div/div/span[2]
	
	 WebDriver driver ;	

	    public NewCampain_AwarenessInfor (WebDriver driver) {			
	    	this.driver= driver ;
	    	
	    }
	
	public void Fillawarenesssinfortype() throws Exception {
		
		
		 Thread.sleep(2000);
		 System.out.println("test08");		 

		   driver.findElement(channelType).click();
		
		   driver.findElement(channelType).sendKeys(Keys.DOWN);
		    driver.findElement(channelType).sendKeys(Keys.ENTER);
			
	

	}
	
	
	public void Fillawarenesss_selectchanel() throws Exception {
		
		
		 Thread.sleep(2000);
		 System.out.println("test08");
		 
		//ReadXlRead redexl= new ReadXlRead();
		
	//    redexl.getdata("NewCampain_GenaralIinfor");
		
		//String dsdsd = ReadXlRead.getCellData(1,0);
		 
		// System.out.println("dsdsd"+dsdsd);
		   driver.findElement(chanel).click();
		
		   driver.findElement(chanel).sendKeys("T");
		   Thread.sleep(1000);
		   driver.findElement(chanel).sendKeys(Keys.DOWN);
		   driver.findElement(chanel).sendKeys(Keys.ENTER);
			

	}
	
	
	public void Fillawarenesssinfor_langugetype() throws Exception {
		
		
		 Thread.sleep(2000);
		 System.out.println("test08");		 

	String lang =  driver.findElement(languageType).getText();
		
	 System.out.println("language"+lang);
		 
	

	}

	
	public void Fillawarenesssinfor_audinceid() throws Exception {
		
		
		 Thread.sleep(2000);
		 System.out.println("test14");		 

	   driver.findElement(audinceidname).sendKeys("AUD20231113013 - Test Aud 1");
	   Thread.sleep(1000);
	   driver.findElement(audinceidname).sendKeys(Keys.DOWN);
	   driver.findElement(audinceidname).sendKeys(Keys.ENTER);
		
		
	 System.out.println("AUD20231113013 - Test Aud 1"+audinceidname);
		 
	

	}
	
	
	
	
	public void Fillawarenesssinfor_buttonclick() throws Exception {
		
		
		 Thread.sleep(2000);
		 System.out.println("test09");		 

	     driver.findElement(audincecheckbitton).click();		
		
	       System.out.println("click on audincecheckbitton");
		 
	

	}
	
	
	public void Fillawarenesssinfor_chcekbox() throws Exception {
		
		
	 	  Thread.sleep(2000);
		  System.out.println("test10");		 

	      driver.findElement(checkboxclick).click();		
		
	       System.out.println("click on checkboxclick");
		 
	

	}
	
	
	
	public void Fillawarenesssinfor_selecttestaudince() throws Exception {
		
		
		   Thread.sleep(2000);
		   System.out.println("test11");		 

		   driver.findElement(audincecselectName).click();
		   driver.findElement(audincecselectName).sendKeys("AUD20231113027 - senali cmp actual aud");
		//   driver.findElement(audincecselectName).sendKeys(Keys.ENTER);
		   
		   Thread.sleep(1000);
		   
		   System.out.println("test1122");	
		   driver.findElement(audincecselectName).sendKeys(Keys.DOWN);
		   driver.findElement(audincecselectName).sendKeys(Keys.ENTER);
		   
		   System.out.println("AUD20231113027 - senali cmp actual aud"+audinceidname);
		 
	

	}
	
	
	
	
	public void Fillawarenesssinfor_enterdiscription() throws Exception {
		
		
	 	  Thread.sleep(2000);
		  System.out.println("test10");		 

	      driver.findElement(audincecsenterdescription).sendKeys("test discrition");		
		
	       System.out.println("enter discription");
		 
	

	}
	
	
	public void Fillawarenesssinfor_clicknextr() throws Exception {
		
		
	 	  Thread.sleep(2000);
		  System.out.println("test10");		 

	      driver.findElement(audincecsenterde_next).click();	
		
	       System.out.println("enter next");
		 
	

	}
	
	

}
