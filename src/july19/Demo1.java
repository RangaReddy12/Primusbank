package july19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	@Test
	public void verifyTitle()throws Throwable
	{
		driver = new ChromeDriver();
		//driver.get("https://google.com");
		driver.get("https://gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		String expected ="Google";
		String actual = driver.getTitle();
		try {
			Assert.assertEquals(actual, expected,"Title is Not Matching");
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
		driver.close();
	}
}
