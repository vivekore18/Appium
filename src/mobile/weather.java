package mobile;

import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
public class weather {
	
	WebDriver driver;
	
	@BeforeClass
	public void setUp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		/*capabilities.setCapability("device", "Nexus6");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); //Name of mobile web browser to automate. Should be an empty string if automating an app instead.
		capabilities.setCapability(CapabilityType.VERSION, "6.0");
		capabilities.setCapability(CapabilityType.PLATFORM, "Windows");*/
		
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "6.0"); 
		capabilities.setCapability("deviceName","Nexus6");
		capabilities.setCapability("platformName","Android");
		
		capabilities.setCapability("app-package", "APP PACKAGE"); //Replace with your app's package
		capabilities.setCapability("app-activity", "APP PACKAGE.ANDROID ACTIVITY"); //Replace with app's Activity
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@Test
	public void Cal(){
		driver.findElement(By.name("Weather")).click();
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
 
}
