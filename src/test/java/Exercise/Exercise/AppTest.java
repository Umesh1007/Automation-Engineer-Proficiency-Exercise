package Exercise.Exercise;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utilities.Browser_Launch;
import junit.framework.Assert;


public class AppTest {
    
	WebDriver driver;
	
  
  @BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception
  {
	  driver=Browser_Launch.browser_launch("https://prueba.undostres.com.mx/",browser);
		
	}
  
  
  @Test(priority = 0)
  public void Recarga_Celular() throws Exception
  {
	  Recarga_Celular rect_celular=new Recarga_Celular(driver);
	  rect_celular.recarga_process();
	  Assert.assertEquals("https://prueba.undostres.com.mx/payment.php", driver.getCurrentUrl());
	  
  }
  
  @Test(priority = 1)
  public void payment_process() throws Exception
  {
	  Recarga_Celular payment_process=new Recarga_Celular(driver);
	  payment_process.payment_process();
	  
	  Assert.assertEquals("https://prueba.undostres.com.mx/confirmation/success", driver.getCurrentUrl());
  }
  
  @AfterTest
  public void tearDown()
  {
	  driver.quit();
  }
}
