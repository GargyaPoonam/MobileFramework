package Pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class Signup {
	  AndroidDriver driver;
	    WebDriverWait wait;
	public Signup(AndroidDriver driver,Duration Timeouts) {
        this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

       // this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
 //   @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Sign up\").instance(0))") WebElement signup;

	@FindBy(id ="com.teamcommunication:id/tvAlreadyHaveAnAccountSignup") WebElement signup;
	
	public void CraeteAccount() {
		int startX = driver.manage().window().getSize().width / 2;
        int startY = driver.manage().window().getSize().height * 3 / 4;
        int endY = driver.manage().window().getSize().height / 4;
		TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(startX, startY))
                   .moveTo(PointOption.point(startX, endY))
                   .release()
                   .perform();
		signup.click();
	}

}
