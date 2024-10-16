package testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.AimsDashBoard;
import pages.AimsLogging;
import pages.CmsDashboard;
import pages.NewCampain_AwarenessInfor;
import pages.NewCampain_GenaralIinfor;
import pages.NewCampaingSetApprover;
import pages.NewCampainglow1;
import utility.DriverConfigeration;
import utility.ExtentReport;

public class TC_CreateNewCampaing {
	 WebDriver driver ;	
	 
	@BeforeClass
	 
	 public void beforeclass () throws InterruptedException {
		 
		    ExtentReport.setUpReport();		 
			DriverConfigeration drcon = new  DriverConfigeration();
		  driver=  drcon.openbrowser();
	 }
	
	 
    @Test(priority = 0)
    public void TC_CreateNewCampaing(WebDriver driver) {
    	
    	this.driver= driver ;
		
	}
    	

	
	
	@Test(priority = 1)
		public void logging_aims() throws Exception{
		
		      AimsLogging aims = new AimsLogging(driver);			  
			  aims.logging_aims();		

	}
	
	
	
	@Test(priority = 2)
		public void selectcms() throws InterruptedException{
		
		  pages.AimsDashBoard amdash= new AimsDashBoard(driver);
		  amdash.navigatetocms();
			
	}
	


	@Test(priority = 3)
		public void clickoncampaingmangemnt() throws InterruptedException{
		
			CmsDashboard cmsdash = new CmsDashboard(driver);
		    cmsdash.navigate_to_campaingmangentlink();
			
	}

	@Test(priority = 4)
	
	public void newcampaing() throws InterruptedException{
		
		NewCampainglow1 nre  = new NewCampainglow1(driver);
		
		nre.newcamping();
			
	}
		
	
	@Test(priority = 5)
		public void enterCampagintitle() throws Exception{
				NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
			    nmd.Fillgeneralinfortitle();	
	}
	
	@Test(priority = 6)
	
	public void enterCampagintype() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.Fillgeneralinfor_type();
			
	}
	
	
	@Test(priority = 7)
	
	public void enterCampagin_catagory() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.Fillgeneralinfor_catgry();
			
	}
	
	
	@Test(priority = 8)
	
	public void enterCampagin_modeselect() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.Fillgeneralinfor_mode();
			
	}
	
	@Test(priority = 9)
	
	public void enterCampagin_discriptnrnter() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.Fillgeneralinfor_discritonenter();
			
	}
	
	
	
	@Test(priority = 10)
	
	public void enterCampagin_fileupload() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.Fillgeneralinfor_fileupload();
			
	}
	
	

	
	

	
	@Test(priority = 11)
	
	public void enterCampagin_dilvaryrate() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.dilvaryrate();
			
	}


	@Test(priority = 12)
	
	public void clickon_next_genralinforTo_awarnessinfor() throws Exception{
		
		NewCampain_GenaralIinfor nmd  = new NewCampain_GenaralIinfor(driver);
		
		nmd.next_generalinfor();
			
	}
	
	
	
	
	@Test(priority = 13)
	
	public void Fillawarenesssinfortitle() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfortype();
			
	}
	

	@Test(priority = 14)
	
	public void Fillawarenesssinforselectchannel() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesss_selectchanel();
			
	}
	
	
	
	@Test(priority = 15)
	
	public void Fillawarenesssinforgetlangue() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_langugetype();
			
	}
	
	
	@Test(priority = 16)
	
	public void Fillawarenesssinforsetaudiunce() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_audinceid();
			
	}
	
	
	
	
	@Test(priority = 17)
	
	public void clickcheckaudiancebutton() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_buttonclick();
			
	}
	
	
	@Test(priority = 18)
	
	public void clickcheckaudiancecheckbox() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_chcekbox();
			
	}
	
	@Test(priority = 19)
	
	public void clickcheckaudianceselecttestaudince() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_selecttestaudince();
			
	}
	
		
	
	@Test(priority = 20)
	
	public void Fillawarenesssinfor_enterdiscriptionenter() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_enterdiscription();
			
	}
	
	@Test(priority = 21)
	
	public void Fillawarenesssinfor_clicknextr() throws Exception{
		
		NewCampain_AwarenessInfor nmd  = new NewCampain_AwarenessInfor(driver);
		
		nmd.Fillawarenesssinfor_clicknextr();
			
	}
	
	
	@Test(priority = 22)
	
	public void NewCampain_AwarenessRule() throws Exception{
		

		
		pages.NewCampain_AwarenessRule ccnd = new pages.NewCampain_AwarenessRule(driver);
		
		ccnd.Fillgeneralinfor_mode();
			
	}
	
	
	@Test(priority = 23)
	
	public void Fillawarenessrule_time_rule() throws Exception{
		

		
		pages.NewCampain_AwarenessRule ccnd = new pages.NewCampain_AwarenessRule(driver);
		
		ccnd.Fillawarenessrule_time();
			
	}
	
	
	@Test(priority = 25)
	
	public void Fillawarenessrule_nextclick() throws Exception{
		

		
		pages.NewCampain_AwarenessRule ccnd = new pages.NewCampain_AwarenessRule(driver);
		
		ccnd.Fillawarenessrule_next();
			
	}
	
	
	
	@Test(priority = 26)
	
	public void setapprover_newcampaiging() throws Exception{
		
		NewCampaingSetApprover cmg = new NewCampaingSetApprover(driver);

		cmg.setapprover();
			
	}
	
	
	@Test(priority = 27)
	
	public void setapprover_newcampaiging_saveandsend() throws Exception{
		
		NewCampaingSetApprover cmg = new NewCampaingSetApprover(driver);

		cmg.saveandsendapprover();
			
	}
	
	
	@Test(priority = 28)
	
	public void setapprover_newcampaiging_confirmation() throws Exception{
		
		NewCampaingSetApprover cmg = new NewCampaingSetApprover(driver);

		cmg.confirm_approver();
			
	}
	
	@AfterTest
	public void afterclass() {
		
		ExtentReport.createFinalReport();
		//driver.quit();
	}

}
