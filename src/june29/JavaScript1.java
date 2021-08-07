package june29;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args) throws Throwable{
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//create object for javascript
			JavascriptExecutor js =(JavascriptExecutor)driver;
			//launch url
			js.executeScript("window.location='https://snapdeal.com'");
			Thread.sleep(5000);
			//print title of the page length of title
			String pagetitle =js.executeScript("return document.title").toString();
			System.out.println(pagetitle);
			System.out.println(pagetitle.length());
			//print url of the page length of url
			String strUrl =js.executeScript("return document.URL").toString();
			System.out.println(strUrl);
			System.out.println(strUrl.length());
			//print domain name length of domain
			String strDomain =js.executeScript("return document.domain").toString();
			System.out.println(strDomain);
			System.out.println(strDomain.length());
			Thread.sleep(5000);
			driver.close();
		}catch(Throwable t)
		{
			System.out.println(t.getMessage());
		}
	}

}
