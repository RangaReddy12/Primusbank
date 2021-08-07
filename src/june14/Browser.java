package june14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser {

	public static void main(String[] args) {
		//create instance object
System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe");		
		WebDriver dr = new FirefoxDriver();
System.setProperty("webdriver.ie.driver", "e:/IEDriverServer.exe");		
WebDriver d = new InternetExplorerDriver();

	}
}
