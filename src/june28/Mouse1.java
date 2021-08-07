package june28;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://jqueryui.com/droppable/");
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//scroll page down
		ac.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		//get collection of frames
		List<WebElement> frames =driver.findElements(By.tagName("iframe"));
		System.out.println("No of frames are::"+frames.size());
		//switch to frame
		driver.switchTo().frame(0);//zero means first frame
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement dst = driver.findElement(By.id("droppable"));
		ac.clickAndHold(src).moveToElement(dst).release().perform();
		Thread.sleep(5000);
		//switch back to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Button")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
