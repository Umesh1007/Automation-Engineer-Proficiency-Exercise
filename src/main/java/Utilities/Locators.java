package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Locators 
{
	WebDriver driver;

	@FindBy (xpath="//*[@id='undostres_logo']//following::input[7]")
	public WebElement operator_filed;
	
	@FindBy (xpath="//*[text()='Telcel']")
	public WebElement select_operator;
	
	@FindBy (xpath="//*[@id='undostres_logo']//following::input[8]")
	public WebElement enter_mob_number;
	
	@FindBy (xpath="//*[@id='undostres_logo']//following::input[9]")
	public WebElement recharge_filed;
	
	@FindBy (xpath="//*[text()='Recarga Saldo']//following::a[1]")
	public WebElement select_recharge_amount;
	
	@FindBy (xpath="//*[@id='undostres_logo']//following::button[1]")
	public WebElement submit_button;
	
	
	
	@FindBy (xpath="//*[@id='cardGly']")
	public WebElement select_payment_method;
	
	
	@FindBy (xpath="//*[text()='Usar nueva tarjeta']")
	public WebElement select_user_type;
	
	@FindBy (xpath="//*[@id='cardnumberunique']")
	public WebElement enter_card_number;
	
	
	@FindBy (xpath="//*[@id='cardnumberunique']//following::input[4]")
	public WebElement enter_month;
	
	@FindBy (xpath="//*[@id='cardnumberunique']//following::input[5]")
	public WebElement enter_date;
	
	@FindBy (xpath="//*[@id='cardnumberunique']//following::input[6]")
	public WebElement enter_cvv;
	
	
	@FindBy (xpath="//*[@id='cardnumberunique']//following::input[9]")
	public WebElement enter_email_ID;
	
	
	@FindBy (xpath="//*[@id='paylimit']")
	public WebElement payment_process_button;
	
	@FindBy (xpath="//*[@id='usrname']")
	public WebElement username;
	
	@FindBy (xpath="//*[@id='psw']")
	public WebElement password;
	
	
	@FindBy (xpath="//*[@id='psw']//following::div[2]")
	public WebElement select_capcha;
	
	@FindBy (xpath="//*[@id='psw']//following::button[1]")
	public WebElement final_payment_process_button;
	
	
	
	
	
	
	
	
	
	
	
	
	

	
}
