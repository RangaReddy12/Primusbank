package june29;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args)throws Throwable {
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.location='https://amazon.in'");
			Thread.sleep(5000);
			//scroll top to bottom vertically
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(5000);
			//scroll  bottom to top vertically
			js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
			Thread.sleep(5000);
			//scroll to certain pixel vertically
			js.executeScript("window.scrollBy(0,800)");
			Thread.sleep(5000);
			//store sign button into webelement
			WebElement signinbtn =driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
			//scroll to sign ib button
			js.executeScript("document.scrollIntoView",signinbtn);
			signinbtn.click();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
