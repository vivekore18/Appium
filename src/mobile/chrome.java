package mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class chrome {
	WebDriver driver;
	
	@BeforeTest	
	public void launchapp() throws InterruptedException, MalformedURLException{
		File f = new File("D:/neon/mobile/src/mobile/");
		File fs =new File (f, "chrome.apk");
	
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		//com.android.chrome/org.chromium.chrome.browser.ChromeTabbedActivity
		
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("no-reset", "true");
		dc.setCapability("full-reset", "False");
		
		dc.setCapability("BROWSER_NAME", "Android");
		dc.setCapability("VERSION", "6.0");
		dc.setCapability("deviceName" ,"Nexus_6");
		dc.setCapability("platformName" ,"Android");
		
		dc.setCapability("appPackage","com.android.chrome");
		dc.setCapability("appActivity", "org.chromium.chrome.browser.ChromeTabbedActivity");
		dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),dc);
			
     }
		
		@Test
		public void testchrome() throws InterruptedException{
			
			Thread.sleep(5000);
			WebElement sel = driver.findElement(By.id("com.android.chrome:id/url_bar"));
							sel.sendKeys("http://www.facebook.com");
							sel.click();
				
		Thread.sleep(5000);
		System.out.println("Title: "+driver.getTitle());
		}
		 
		
		@AfterTest
		public void teardown() throws InterruptedException{
			
			Thread.sleep(10000);
			driver.quit();
		}
}


