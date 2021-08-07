package june28;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class RightClick {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		//right click on gmail link
		ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
		Thread.sleep(5000);
		Robot r = new Robot();
		//press down arrow for two times
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(5000);
		//click on enter button in keyboard
		r.keyPress(KeyEvent.VK_ENTER);
		//get collection of all windows
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		//switch to gmail window
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("identifier")).sendKeys("pranga2010");
		Thread.sleep(5000);
		driver.close();
		//switch to parent
		driver.switchTo().window(brw.get(0));
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
