package TestStep;


import java.net.MalformedURLException;
import java.time.Duration;

import org.testng.annotations.Test;

import BrowserClass.Browser;
import ExcelDataprovider.Excel;
import Pageobject.Login;
import Pageobject.Signup;
import io.appium.java_client.android.AndroidDriver;

public class TestCase {
	AndroidDriver driver;
  @Test(priority =1)
  public void Testcase1() throws MalformedURLException, InterruptedException {
	  driver = Browser.GetBrowser();
//	  Login login = new Login(driver, Duration.ofSeconds(10));
//	  login.Login_1("rahul@real11.com","Rahul@1234");
//		Excel excel = new Excel();
	  Signup page = new Signup(driver,Duration.ofSeconds(10));
	  page.CraeteAccount();
//	  Thread.sleep(3000);
//	  Pageobject.CreateAccount account = new Pageobject.CreateAccount(driver, Duration.ofSeconds(10));
//		account.accountDetail(excel.getStringData(0,1,0),excel.getStringData(0,1,1),excel.getStringData(0,1,2),excel.getStringData(0,1,3),excel.getStringData(0,1,4),excel.getStringData(0,1,5),excel.getStringData(0,1,6));
}	
  
  @Test(priority =2)
	public void Testcase2() throws  InterruptedException, MalformedURLException {
	  Excel excel = new Excel();
	 
	//	 AndroidDriver driver = Browser.GetBrowser(); 
		Pageobject.CreateAccount account = new Pageobject.CreateAccount(driver, Duration.ofSeconds(10));
		account.accountDetail(excel.getStringData(0,1,0),excel.getStringData(0,1,1),excel.getStringData(0,1,2),excel.getStringData(0,1,3),excel.getStringData(0,1,4),excel.getStringData(0,1,5),excel.getStringData(0,1,6));
  }	
	
}
