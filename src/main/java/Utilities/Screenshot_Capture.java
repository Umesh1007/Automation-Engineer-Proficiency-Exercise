package Utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Capture 
{
	
	public static void  screenshot_captured(WebDriver driver, String snip_name) throws Exception
	{
		TakesScreenshot ts=((TakesScreenshot)driver);
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destination="C:\\Users\\NTS-suwarna\\eclipse-workspace\\Exercise\\Screenshots"+snip_name+".png";
		FileHandler.copy(source, new File(destination));

	}

}
