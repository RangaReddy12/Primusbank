package july7;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class Demo1 {
	WebDriver driver;
	@BeforeMethod
	public void setUp()throws Throwable
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://primusbank.qedgetech.com/");
		Reporter.log("Running in setUp",true);
		Thread.sleep(3000);
	}
	@Test(description="Verify Pbanking Test",priority=2,enabled=true)
	public void pbanking()throws Throwable
	{
		driver.findElement(By.xpath("//a[contains(@href,'person')]")).click();
		Reporter.log("Executing pbanking Test case",true);
		Thread.sleep(3000);
	}
	@Test(description="Verify cbanking Test",priority=0,enabled=true)
	public void cbanking()throws Throwable
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[4]/a[1]/img[1]")).click();
		Reporter.log("Executing cbanking Test case",true);
		Thread.sleep(3000);
	}
	//it will ignore from execution
	@Test(description="Verify ibanking Test",priority=1,enabled=false)//it will ignore 
	public void ibanking()throws Throwable
	{
		driver.findElement(By.xpath("//tbody/tr[1]/td[5]/a[1]/img[1]")).click();
		Reporter.log("Executing ibanking Test case",true);
		Thread.sleep(3000);
	}
	@AfterMethod
	public void tearDown()throws Throwable
	{
		Thread.sleep(3000);
		driver.close();
		Reporter.log("Running in tearDown",true);
	}
}
