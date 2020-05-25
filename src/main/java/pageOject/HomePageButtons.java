package pageOject;
// All the objects present in one page will be defined in one java class

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

// 1. Is to call the driver object from test case to PageObject file
//   2.concatenate driver

public class HomePageButtons {
	
	
	public HomePageButtons(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	//driver.findElement(By.xpath("//*[@text='Community Eg. Brahmin']"))
	@AndroidFindBy(xpath="//*[@text='Lets Begin']")
	public WebElement BeginButton;
	
	//driver.findElement(By.xpath("//*[@text='Create Profile for']")).click();
	@AndroidFindBy(xpath="//*[@text='Create Profile for']")
	public WebElement CreateProfile;
}
