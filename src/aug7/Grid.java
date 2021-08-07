package aug7;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid {
	WebDriver driver;
	String url ="http://orangehrm.qedgetech.com/";
	String node="http://localhost:9870/wd/hub";
	@Parameters({"browser"})
	 @BeforeTest
	  public void setUp(String brw) throws Throwable
	 {
		if(brw.equalsIgnoreCase("chrome"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("chrome");
			driver = new RemoteWebDriver(new URL(node), cap);
			driver.manage().window().maximize();
			}
		else if(brw.equalsIgnoreCase("firefox"))
		{
			DesiredCapabilities cap = new DesiredCapabilities();
			cap.setBrowserName("firefox");
			driver = new RemoteWebDriver(new URL(node), cap);
		}
		else
		{
			System.out.println("Browser value is not matching");
		}
		 
	  }
 @Test(dataProvider = "supplydata")
 public void VerifyLogin(String username, String password) throws Throwable
 {
	  driver.manage().window().maximize();
		 driver.get(url);
	 driver.findElement(By.name("txtUsername")).sendKeys(username);
	 driver.findElement(By.name("txtPassword")).sendKeys(password);
	 driver.findElement(By.name("Submit")).click();
	 Thread.sleep(3000);
	if(driver.getCurrentUrl().contains("dashboard"))
	{
		Reporter.log("Login Success",true);
	}
	else
	{
		Reporter.log("Login Fail",true);
	}
	}
 @DataProvider
 public Object[][] supplydata() {
  Object login[][]= new Object[4][2];
  login[0][0]="Admin";
  login[0][1]="Qedge123!@#";
  login[1][0]="Test";
  login[1][1]="Qedge123!@#";
  login[2][0]="Admin";
  login[2][1]="Qedge123!@#";
  login[3][0]="Admin";
  login[3][1]="Test";
	return login;	   
 }


 @AfterTest
 public void tearDown() 
 {
	  driver.close();
 }

}
