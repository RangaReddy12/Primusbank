package july19;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PropertyFile {
	WebDriver driver;
	Properties config;
	@BeforeTest
	public void setUp()throws Throwable
	{
		config = new Properties();
		//access path propertyfile
		config.load(new FileInputStream("D:\\EvengBatch\\PrimusBank\\OR.properties"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperty("Url"));
	}
	@Test
	public void verifyLogin()throws Throwable
	{
		driver.findElement(By.xpath(config.getProperty("ObjUser"))).sendKeys("Admin");
		driver.findElement(By.xpath(config.getProperty("Objpass"))).sendKeys("Admin");
		driver.findElement(By.xpath(config.getProperty("ObjLogin"))).click();
		Thread.sleep(5000);
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
