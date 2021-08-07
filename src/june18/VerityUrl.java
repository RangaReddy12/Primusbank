package june18;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerityUrl {

	public static void main(String[] args)throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		//driver.get("http://facebook.com");
		driver.get("http://primusbank.qedgetech.com/");
		//suspend tool for  5 seconds
		Thread.sleep(5000);
		//store protocol 
		String Expected ="https://";
		//get url in run time
		String Actual =driver.getCurrentUrl();
		//verify actual url contains
		if(Actual.contains(Expected))
		{
			System.out.println("Url is Secured::"+Expected+"    "+Actual);
		}
		else
		{
			System.out.println("Url is Not Secured::"+Expected+"    "+Actual);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
