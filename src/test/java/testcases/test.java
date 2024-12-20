package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AimsDashBoard;
import pages.AimsLogging;

public class test {

	public static void main(String[] args) throws InterruptedException {
		   WebDriverManager.chromedriver().setup();
	       DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setAcceptInsecureCerts(true);
		   ChromeOptions option = new ChromeOptions();
		   option.addArguments("--start-maximized");
		    //option.addArguments("--incognito");
		   System.out.println("test0444");   
           option.merge(caps);
           WebDriver driver = new ChromeDriver(option);              
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		   driver.get(utility.constant.URL);
		   pages.AimsLogging aims = new AimsLogging(driver);
			  
			//  aims.logging_aims();
			  
			  pages.AimsDashBoard amdash= new AimsDashBoard(driver);
			  //amdash.navigatetocms();

	}

}
