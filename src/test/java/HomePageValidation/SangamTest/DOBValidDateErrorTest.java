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

public class DOBValidDateErrorTest extends baseSangam  {
	
    @Test
	
	public void DOBValidDateError() throws MalformedURLException, InterruptedException {
		
    	service=startServer();
		AndroidDriver<AndroidElement>driver=Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	 
	  //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Create Profile for\"));");
	  Utilities u=new Utilities(driver);
	  u.scrollToText("Create Profile for"); 
	     driver.findElement(By.xpath("//*[@text='Create Profile for']")).click();
	     Utilities u1=new Utilities(driver);
	     u1.scrollToText("Sister");
	     driver.findElement(By.xpath("//*[@text='Sister']")).click();
	     Thread.sleep(4000);
	     
	     driver.findElementsByClassName("android.widget.EditText").get(2).sendKeys("0");
	     driver.findElementsByClassName("android.widget.EditText").get(3).sendKeys("5");
	     driver.findElementsByClassName("android.widget.EditText").get(4).sendKeys("0");
	     driver.findElementsByClassName("android.widget.EditText").get(5).sendKeys("9");
	     driver.findElementsByClassName("android.widget.EditText").get(6).sendKeys("1");
	     driver.findElementsByClassName("android.widget.EditText").get(7).sendKeys("9");
	     
	     
	    // driver.findElement(By.xpath("//*[@text='Lets Begin']")).click();
	     HomePageButtons L=new HomePageButtons(driver);
	     L.BeginButton.click();
	     
	     
	     String DOBValidDate =driver.findElement(By.xpath("//*[@text='Please select a valid date']")).getText();
	     
	     System.out.println(DOBValidDate);
	   
	     Assert.assertEquals("Please select a valid date", DOBValidDate);
	     service.stop();
	     

	    
	}   

}

