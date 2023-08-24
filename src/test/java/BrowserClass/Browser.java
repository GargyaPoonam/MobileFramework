package BrowserClass;

import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.TouchAction;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser {
	
	AndroidDriver driver;
	
	public static AndroidDriver GetBrowser() throws MalformedURLException {
//		static AndroidDriver<WebElement> GetBrowser() throws MalformedURLException {
//		        AndroidDriver<WebElement> driver;
		AndroidDriver driver = null;
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12.0");
		cap.setCapability("deviceName", "Pixel_3a_API_31");
		cap.setCapability("app", "/Users/poonamsharma/Downloads/Evince_Live.apk");
		cap.setCapability("autoGrantPermissions", "true");
	//	cap.setCapability("autoAcceptAlerts", "true"); // to accept all alerts
	//	cap.setCapability("autoDissmissAlerts", "true"); // to dismiss all alerts
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//	driver.scrollTo("Sign up");
     
		return driver;
		
	}

}
