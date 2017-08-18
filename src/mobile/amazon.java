package mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class amazon{	
		
	/*
		public static void main(String[] args) throws MalformedURLException {
			
			
			File f = new File("D:\\neon\\mobile\\src\\udemy\\");
			File fs =new File (f, "amazon.apk");
		
			//Set up desired capabilities and pass the Android app-activity and app-package to Appium
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setCapability(MobileCapabilityType.DEVICE_NAME ,"Nexus_6");
			dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
			
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
			 
			 
	}
	}*/

 
		
		public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
				
			File f = new File("D:/neon/mobile/src/mobile/");
			File fs =new File (f, "amazon.apk");
 
			DesiredCapabilities dc = new DesiredCapabilities();
			//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
			//dc.setCapability("newCommandTimeout", "5000");
			dc.setCapability("no-reset", "true");
			dc.setCapability("full-reset", "False");
			dc.setCapability("BROWSER_NAME", "Android");
			dc.setCapability("VERSION", "6.0");
			dc.setCapability("deviceName" ,"Nexus_6");
			dc.setCapability("platformName", "Android");
			dc.setCapability("appPackage", "com.amazon.mShop.android.shopping");
			dc.setCapability("appActivity", "com.amazon.mShop.splashscreen.StartupActivity");
 
			dc.setCapability("app", fs.getAbsolutePath());
			AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
			 
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			Thread.sleep(5000);
			driver.quit();
 
	}
}
 
