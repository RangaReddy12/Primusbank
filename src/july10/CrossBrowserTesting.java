package july10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
WebDriver driver;
String url="https://www.calculator.net/percent-calculator.html";
@Parameters({"Browser"})
@BeforeTest
public void setUp(String brw)throws Throwable
{
	switch(brw)
	{
	case "chrome":
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		break;
	case "firefox":
		driver = new FirefoxDriver();
		driver.get(url);
		Thread.sleep(5000);
		break;
		default:
			Reporter.log("Browser value is not matching",true);
			break;
	}
	}
@Test
public void verifycalculation()throws Throwable
{
	driver.findElement(By.name("cpar1")).sendKeys("10");
	Thread.sleep(5000);
	driver.findElement(By.name("cpar2")).sendKeys("100000");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]")).click();
	Thread.sleep(5000);
	String results =driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/p[2]")).getText();
	Reporter.log(results,true);
}
@AfterTest
public void tearDown()
{
	driver.close();
}
}
