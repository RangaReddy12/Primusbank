package june16;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Login {
public static void main(String[] args) throws Throwable {
		// create instance object
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		driver.findElement(By.name("txtuId")).sendKeys("Admin");
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
		Thread.sleep(5000);
		driver.close();
		}
        }
