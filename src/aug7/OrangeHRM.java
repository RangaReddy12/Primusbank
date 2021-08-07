package aug7;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;

public class OrangeHRM {
	WebDriver driver;
	 @BeforeTest
	  public void setUp() 
	 {
		 driver = new ChromeDriver();
		 
	  }
  @Test(dataProvider = "supplydata")
  public void VerifyLogin(String username, String password) throws Throwable
  {
	  driver.manage().window().maximize();
		 driver.get("http://orangehrm.qedgetech.com/");
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
