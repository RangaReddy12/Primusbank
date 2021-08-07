package july7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
	WebDriver driver;
	@BeforeTest
	public void setUp()throws Throwable
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://calc.qedgetech.com/");
		Thread.sleep(4000);
		Reporter.log("Running in Setup",true);
	}
	@Test
	public void addition()throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("765");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn'])[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("73");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id='btn'])[20]")).click();
		Thread.sleep(2000);
		String message =driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		Reporter.log("Executing addition test",true);
		Reporter.log("Addition is::"+message,true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}
	@Test
	public void division()throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("765567");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn'])[21]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("7");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id='btn'])[20]")).click();
		Thread.sleep(2000);
		String message =driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		Reporter.log("Executing division test",true);
		Reporter.log("Division is::"+message,true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}
	@Test
	public void multiplication()throws Throwable
	{
		driver.findElement(By.name("display")).sendKeys("87675");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@id='btn'])[16]")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("display")).sendKeys("43");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[@id='btn'])[20]")).click();
		Thread.sleep(2000);
		String message =driver.findElement(By.xpath("//input[@type='text']")).getAttribute("value");
		Reporter.log("Executing multiplication test",true);
		Reporter.log("multiplication is::"+message,true);
		driver.findElement(By.xpath("(//*[@id='btn'])[26]")).click();
	}

	@AfterTest
	public void tearDown()throws Throwable
	{
		Thread.sleep(4000);
		driver.close();
		Reporter.log("Running in tearDown",true);
	}
}
