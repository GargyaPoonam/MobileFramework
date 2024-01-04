import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwithWindow {
	static AndroidDriver driver;
	public static void main(String [] args) throws MalformedURLException {
//	AndroidDriver driver = null;
		DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName","Android");
			caps.setCapability("platformVersion","12.0");
			caps.setCapability("deviceName","Pixel_3a_API_31");
//			caps.setCapability("app", "/Users/poonamsharma/Downloads/Evince_Live.apk");

			caps.setCapability("appPackage","com.teamcommunication");
			caps.setCapability("appActivity","com.teamcommunication.modules.primary_screen.SplashActivity");
//		   caps.setCapability("autoGrantPermission","true");
		 caps.setCapability("autoGrantPermissions", "true");
			caps.setCapability("autoAcceptAlerts", "true"); // to accept all alerts
			caps.setCapability("autoDissmissAlerts", "true"); // to dismiss all alerts
		
			driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 


	}

}
