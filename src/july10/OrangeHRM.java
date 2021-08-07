package july10;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class OrangeHRM {
	WebDriver driver;
	@Parameters({"Url"})
	@BeforeTest
	public void setUp(String url)throws Throwable
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
	}
	@Parameters({"username","password"})
	@Test
	public void verifyLogin(String username,String password)throws Throwable
	{
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys(username);
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("#btnLogin")).click();
		Thread.sleep(5000);
		if(driver.getCurrentUrl().contains("dashboard"))
		{
			Reporter.log("Login success::"+username+"   "+password,true);
		}
		else
		{
			String message= driver.findElement(By.cssSelector("#spanMessage")).getText();
		}
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
