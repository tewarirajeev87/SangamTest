package HomePageValidation.SangamTest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageOject.Community;
import pageOject.HomePageButtons;


public class HomeEmailValidationTest extends baseSangam  {
	
    @Test
	
	public void HomeEmailValidation() throws MalformedURLException, InterruptedException {
		
    	service=startServer();
		AndroidDriver<AndroidElement>driver=Capabilities();
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     Utilities u=new Utilities(driver);
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	     u.scrollToText("Create Profile for");
	  //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Create Profile for\"));");
     //driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\\\"\" + Self + \"\\\").instance(0))"));     
	   //  driver.findElement(By.xpath("//*[@text='Create Profile for']")).click();
	     HomePageButtons c=new HomePageButtons(driver);
	     c.CreateProfile.click();
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Sister\"));");
	     Utilities u1=new Utilities(driver);
	     //driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
	     u.scrollToText("Sister");
	     driver.findElement(By.xpath("//*[@text='Sister']")).click();
	     
	     
	     driver.findElementsByClassName("android.widget.EditText").get(2).sendKeys("0");
	     driver.findElementsByClassName("android.widget.EditText").get(3).sendKeys("5");
	     driver.findElementsByClassName("android.widget.EditText").get(4).sendKeys("0");
	     driver.findElementsByClassName("android.widget.EditText").get(5).sendKeys("9");
	     driver.findElementsByClassName("android.widget.EditText").get(6).sendKeys("1");
	     driver.findElementsByClassName("android.widget.EditText").get(7).sendKeys("9");
	     driver.findElementsByClassName("android.widget.EditText").get(8).sendKeys("8");
	     driver.findElementsByClassName("android.widget.EditText").get(9).sendKeys("7");
	     
	     Thread.sleep(4000);
	     driver.hideKeyboard();
	     
	     //driver.findElement(By.xpath("//*[@text='Community Eg. Brahmin']")).click();
	     Community Caste=new Community(driver);
	     Caste.Community.click();
	    
	     driver.hideKeyboard();
	     
	     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Hindu - Kashyap\"));");
	     driver.findElement(By.xpath("//*[@text='Hindu - Kashyap']")).click();
	     
	  //   driver.findElement(By.xpath("//*[@text='Lets Begin']")).click();
	     
	     HomePageButtons L=new HomePageButtons(driver);
	     L.BeginButton.click();
	     Thread.sleep(4000);
	     
	    // driver.findElement(By.xpath("//*[@resource-id='email']")).click();
	     String Emaillabel= driver.findElement(By.xpath("//*[@resource-id='email']")).getText();
		 Assert.assertEquals("Email", Emaillabel);
		 service.stop();  
	}  
    
    @BeforeTest
	public void killAllNodes() throws IOException, InterruptedException
	
	{
		//taskkill /F /IM node.exe
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Thread.sleep(3000);
	}

}

