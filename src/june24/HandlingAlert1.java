package june24;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HandlingAlert1 {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		Thread.sleep(5000);
		//click on sign in 
		driver.findElement(By.xpath("//*[@title='Sign in']")).click();
		//capture alert text
		String alerttext =driver.switchTo().alert().getText();
		System.out.println(alerttext);
		Thread.sleep(5000);
		//click on ok button to alert
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
	}
}
