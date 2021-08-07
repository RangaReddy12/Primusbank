package july9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleTimes {
WebDriver driver;
@Test(invocationCount=5)//invocationCount is a method which will invoke for more than one time
public void verifyLogin()
{
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://orangehrm.qedgetech.com/");
	driver.findElement(By.name("txtUsername")).sendKeys("Admin");
	driver.findElement(By.name("txtPassword")).sendKeys("Admin");
	driver.findElement(By.name("Submit")).click();
	driver.close();
}
}
