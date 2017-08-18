package udemy;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
	
	

	//public static AndroidDriver<AndroidElement> Capabilities() throws MalformedURLException {
		
	public static void main(String[] args) throws MalformedURLException {
		
	
		
		File f = new File("D:\\neon\\mobile\\src\\udemy\\");
		File fs =new File (f, "ApiDemos.apk");
	
		//Set up desired capabilities and pass the Android app-activity and app-package to Appium
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME ,"Nexus_6");
		dc.setCapability(MobileCapabilityType.APP,fs.getAbsolutePath());
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
		 
		 
}
}
