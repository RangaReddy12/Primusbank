package june19;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsingForeachLoop {
public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://rediff.com");
		Thread.sleep(5000);
		//get collection of links
		List<WebElement> links =driver.findElements(By.tagName("a"));
		System.out.println("No of links are::"+links.size());
		Thread.sleep(5000);
		for(WebElement each : links)
		{
			String linkname =each.getText();
			String linkurl =each.getAttribute("href");
			Thread.sleep(200);
			System.out.println(linkname+"\n"+linkurl);
		}
		Thread.sleep(5000);
		driver.close();
	}

}
