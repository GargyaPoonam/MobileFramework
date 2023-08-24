package Pageobject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Login {
	WebDriver driver;
	public Login(AndroidDriver driver,Duration Timeouts) {
	        this.driver = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	       // this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    }
	
	@FindBy(id ="com.teamcommunication:id/etEmailId") WebElement EmailID;
	@FindBy(id ="com.teamcommunication:id/etPassword") WebElement password;
	@FindBy(id ="com.teamcommunication:id/etPassword") WebElement Login;

public void Login_1(String UID, String PWD) throws InterruptedException {
	EmailID.sendKeys(UID);
	Thread.sleep(2000);
	password.sendKeys(PWD);
	Thread.sleep(2000);
//	driver.navigate().back();
//	Thread.sleep(2000);
	Login.click();
}
}


