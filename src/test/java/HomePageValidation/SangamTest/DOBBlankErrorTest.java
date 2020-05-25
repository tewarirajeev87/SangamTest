package HomePageValidation.SangamTest;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageOject.HomePageButtons;

public class DOBBlankErrorTest extends baseSangam  {
	
    @Test
	
	public void DOBBlankError() throws MalformedURLException, InterruptedException {
		
    	service=startServer();
		AndroidDriver<AndroidElement>driver= Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	  
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Create Profile for\"));");
	     Utilities u=new Utilities(driver);
	     u.scrollToText("Create Profile for");     
	     driver.findElement(By.xpath("//*[@text='Create Profile for']")).click();
	     Utilities u1=new Utilities(driver);
	     u1.scrollToText("Sister");
	     driver.findElement(By.xpath("//*[@text='Sister']")).click();
	     Thread.sleep(4000);
	     
	     //driver.findElement(By.xpath("//*[@text='Lets Begin']")).click();
	     HomePageButtons L=new HomePageButtons(driver);
	     L.BeginButton.click();
	     
	     String DOBError =driver.findElement(By.xpath("//*[@text='Please specify Date of Birth']")).getText();
	     System.out.println(DOBError);
	     Assert.assertEquals("Please specify Date of Birth", DOBError);
	     service.stop();
	    
	}   

}

