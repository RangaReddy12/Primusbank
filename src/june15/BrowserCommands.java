package june15;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserCommands {
public static void main(String[] args) throws Throwable {
	//	System.setProperty("webdriver.chrome.driver", "e:/chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
//launch url
driver.get("https://naukri.com");
//suspend tool for 5 seconds
Thread.sleep(5000);
//driver.close();
driver.quit();
	}

}
