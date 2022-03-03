package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Browser_Launch 
{
	
	 static WebDriver driver;
	
	  public Browser_Launch(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	  
	  
	  public static WebDriver browser_launch(String url,String browser) throws Exception
	  {
		  
		  
		  if(browser.equalsIgnoreCase("firefox"))                                              
			{
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\NTS-suwarna\\eclipse-workspace\\Exercise\\Drivers\\geckodriver.exe");
				driver = new org.openqa.selenium.firefox.FirefoxDriver();
				
				 driver.get(url);
				  
				  driver.manage().window().maximize();
				  
				  Screenshot_Capture.screenshot_captured(driver, "Home_Page");
				  
				  Thread.sleep(5000);
			}
			
			else if(browser.equalsIgnoreCase("chrome"))
			{
		
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\NTS-suwarna\\eclipse-workspace\\Exercise\\Drivers\\chromedriver.exe");
				  
				  driver=new ChromeDriver();
				  
				  driver.get(url);
				  
				  driver.manage().window().maximize();
				  
				  Screenshot_Capture.screenshot_captured(driver, "Home_Page");
				  
				  Thread.sleep(5000);
				  
			}
		
					else if(browser.equalsIgnoreCase("Edge"))
			{
						
						System.setProperty("webdriver.edge.driver","C:\\Users\\NTS-suwarna\\eclipse-workspace\\Exercise\\Drivers\\msedgedriver.exe");
						driver = new org.openqa.selenium.edge.EdgeDriver();
						 driver.get(url);
						  
						  driver.manage().window().maximize();
						  
						  Screenshot_Capture.screenshot_captured(driver, "Home_Page");
						  
						  Thread.sleep(5000);
			}
			else
			{
				throw new Exception("Browser is not correct");
			}
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
			return driver;
	  }

}
