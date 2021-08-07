package june19;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class CountingLinks {
public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("http://primusbank.qedgetech.com/");
		driver.get("https://yahoo.com");
		Thread.sleep(5000);
		//get collection of links in a web page which are stored in html tag a
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("No of links in a page::"+links.size());
		Thread.sleep(5000);
		//iterate all links
		for(int i=0;i<links.size(); i++)
		{
			//capture each link text
			String linkname =links.get(i).getText();
			//capture each link url
			String linkurl =links.get(i).getAttribute("href");
			Thread.sleep(500);
			System.out.println(linkname+"\n"+linkurl);
		}
		Thread.sleep(5000);
driver.close();
	}

}
