package july1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable3 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicidirect.com/equity");
		Thread.sleep(5000);
driver.findElement(By.xpath("(//i[@class='icon-view-more'])[2]")).click();
Thread.sleep(5000);
WebElement table = driver.findElement(By.id("listingTable"));
List<WebElement> rows =table.findElements(By.tagName("tr"));
System.out.println("No ofrows are::"+rows.size());
Thread.sleep(5000);
for(WebElement eachrow : rows)
{
	List<WebElement> cols =eachrow.findElements(By.tagName("td"));
	for(WebElement eachcell : cols)
	{
		String cellText =eachcell.getText();
		Thread.sleep(500);
		System.out.print("\t"+cellText);
	}
	System.out.println();
System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
}
	}

}
