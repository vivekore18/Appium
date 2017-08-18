package mobile;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Notepad {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		 
		
		File f = new File("D:/neon/mobile/src/mobile/");
		File fs =new File (f, "notepad.apk");

		DesiredCapabilities dc = new DesiredCapabilities();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		//dc.setCapability("newCommandTimeout", "5000");
		dc.setCapability("BROWSER_NAME", "Android");
		dc.setCapability("VERSION", "6.0");
		dc.setCapability("deviceName" ,"Nexus_6");
		dc.setCapability("platformName", "Android");
		dc.setCapability("appPackage", "org.mightyfrog.android.simplenotepad");
		dc.setCapability("appActivity", "org.mightyfrog.android.simplenotepad.SimpleNotepad");

		dc.setCapability("app", fs.getAbsolutePath());
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		 
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.quit();

}
}

