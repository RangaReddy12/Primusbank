package june25;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		//create object
		Actions ac = new Actions(driver);
		//escapse login window
		ac.sendKeys(Keys.ESCAPE).perform();
		//mouse to fashion
		ac.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]"))).perform();
		Thread.sleep(5000);
		//click all
		ac.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'All')]"))).click().perform();
		Thread.sleep(5000);
		//mouse to electornics
		ac.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"))).perform();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.linkText("Apple"))).click().perform();
	}

}
