package Pageobject;

import java.applet.Applet;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;

public class CreateAccount {
	 AndroidDriver driver;
	    WebDriverWait wait;
	public CreateAccount(AndroidDriver driver,Duration Timeouts) {
     this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);


}
	
	@FindBy(id ="com.teamcommunication:id/etFullName")	 WebElement Fname;
	@FindBy(id ="com.teamcommunication:id/etFullNamelast")	 WebElement Lname;
	@FindBy(id ="com.teamcommunication:id/etEmailId")	 WebElement mail;
	@FindBy(id ="com.teamcommunication:id/etPassword")	 WebElement password;
	@FindBy(id ="com.teamcommunication:id/etPhoneNumber")	 WebElement Mobile;
	@FindBy(id ="com.teamcommunication:id/editDob")	 WebElement DOB;
	@FindBy(id ="com.teamcommunication:id/etAddress")	 WebElement address;
	@FindBy(id ="com.teamcommunication:id/btnRegister")	 WebElement signup;

	
	public void accountDetail(String name, String Lastname,String Email,String pass, String mobile, String Dob, String Add) throws InterruptedException {
	Thread.sleep(3000);
	Fname.sendKeys(name);
	Thread.sleep(3000);
	Lname.sendKeys(Lastname);
	Thread.sleep(3000);
	mail.sendKeys(Email);
	Thread.sleep(3000);
	password.sendKeys(pass);
	Thread.sleep(3000);
	//int phone=Integer.parseInt(mobile);
	Mobile.sendKeys(mobile);
	Thread.sleep(3000);
	DOB.sendKeys(Dob);
	Thread.sleep(3000);int startX = driver.manage().window().getSize().width / 2;
    int startY = driver.manage().window().getSize().height * 3 / 4;
    int endY = driver.manage().window().getSize().height / 4;
	TouchAction action = new TouchAction(driver);
    action.press(PointOption.point(startX, startY))
               .moveTo(PointOption.point(startX, endY))
               .release()
               .perform();
	address.sendKeys(Add);
	Thread.sleep(3000);
	
	signup.click();
	
		
	}
}
