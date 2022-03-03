package Exercise.Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Utilities.Locators;
import Utilities.Screenshot_Capture;


public class Recarga_Celular 
{
	WebDriver driver;

	public Recarga_Celular(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void recarga_process() throws Exception
	{
		 Locators loc=PageFactory.initElements(driver, Locators.class);
		 
		 loc.operator_filed.click();
		 Thread.sleep(2000);
		 
		 loc.select_operator.click();
		 
		 Thread.sleep(2000);
		 
		 loc.enter_mob_number.sendKeys("8465433546");
		 
		 loc.recharge_filed.click();
		 
		 loc.select_recharge_amount.click();
		 
		 Thread.sleep(1000);
		 
		 Screenshot_Capture.screenshot_captured(driver, "Recharge_Details");
		 
		 loc.submit_button.click();
		 
		 Thread.sleep(10000);
		 
	}
	
	
	public void payment_process() throws Exception
	{
		Locators loc=PageFactory.initElements(driver, Locators.class);
		 
		 loc.select_payment_method.click();
		 Thread.sleep(1000);
		 
		 loc.select_user_type.click();
		 Thread.sleep(1000);
		 
		 loc.enter_card_number.sendKeys("4111111111111111");
		 Thread.sleep(1000);
		 
		 loc.enter_month.sendKeys("11");
		 Thread.sleep(1000);
		 
		 loc.enter_date.sendKeys("25");
		 Thread.sleep(1000);
		 
		 loc.enter_cvv.sendKeys("111");
		 Thread.sleep(1000);
		 
		 loc.enter_email_ID.sendKeys("test@test.com");
		 Thread.sleep(1000);
		 
		 Screenshot_Capture.screenshot_captured(driver, "Payment_Details");
		 
		 loc.payment_process_button.click();
		 
		 Thread.sleep(5000);
		 
		 loc.username.sendKeys("automationexcersise@test.com");
		 loc.password.sendKeys("123456");
		 
		 loc.select_capcha.click();
		 
		 Screenshot_Capture.screenshot_captured(driver, "User_Details");
		 
		 Thread.sleep(5000);
		 
		 loc.final_payment_process_button.click();
		
		 Thread.sleep(20000);
		 
		 Screenshot_Capture.screenshot_captured(driver, "Payment_Success_Screen");
		 
	}

}
