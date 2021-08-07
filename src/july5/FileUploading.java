package july5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class FileUploading {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[contains(text(),'I am a Fresher')]")).click();
		Thread.sleep(5000);
		ac.moveToElement(driver.findElement(By.xpath("//input[@name='uploadCV']"))).click().perform();
		Thread.sleep(5000);
		//upload file autoit exe file
		Runtime.getRuntime().exec("‪E:\\Autoit\\fileupload.exe");
		
	}

}
