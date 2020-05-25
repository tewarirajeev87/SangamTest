package HomePageValidation.SangamTest;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ValidateHomePageTest extends baseSangam {
	
	@Test
	public void ValidateHomePage() throws MalformedURLException {
		service=startServer();
		AndroidDriver<AndroidElement>driver=Capabilities();
	     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	     Utilities u=new Utilities(driver);
		  u.scrollToText("Create Profile for"); 
	 // driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Create Profile for\"));");     
	   driver.findElement(By.xpath("//*[@text='Create Profile for']")).click();
	   service.stop();
	   
		
	}

}
