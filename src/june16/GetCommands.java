package june16;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class GetCommands {
public static void main(String[] args)throws Throwable {
		// Create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		driver.get("https://amazon.com");
		//suspend tool
		Thread.sleep(5000);
		//print title and length of title
		String strTitle =driver.getTitle();
		System.out.println(strTitle);
		System.out.println(strTitle.length());
		//print url and length of url
		String strUrl = driver.getCurrentUrl();
		System.out.println(strUrl);
		System.out.println(strUrl.length());
		Thread.sleep(5000);
		driver.quit();
		

	}

}
