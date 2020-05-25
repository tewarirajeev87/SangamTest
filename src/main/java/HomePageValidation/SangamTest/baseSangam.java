package HomePageValidation.SangamTest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;


public class baseSangam {
	
	public static AppiumDriverLocalService service;
	
	public static AndroidDriver<AndroidElement> driver;
		
		public AppiumDriverLocalService startServer(){
			//
			boolean flag=checkIfServerIsRunnning(4723);
			if(!flag)
			{

			service=AppiumDriverLocalService.buildDefaultService();
			service.start();
			
			
			}
			return service;
		}
		
		public static boolean checkIfServerIsRunnning(int port) {
			
			boolean isServerRunning = false;
			ServerSocket serverSocket;
			try {
				serverSocket = new ServerSocket(port);
				
				serverSocket.close();
			} catch (IOException e) {
				//If control comes here, then it means that the port is in use
				isServerRunning = true;
			} finally {
				serverSocket = null;
			}
			return isServerRunning;
		}
		
		public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException
		{	
		//Step1: Open app from main activity
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
	    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	    cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,14);
	    cap.setCapability("appPackage", "com.communityshaadi.android"); 
	    cap.setCapability("appActivity","com.communityshaadi.android.ui.splash.SplashActivity");  
	    cap.setCapability("noSign", true);
	   // driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    

	  
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    return driver;   

	}

	
	}
	

