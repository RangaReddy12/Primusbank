package june25;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
		//clickthree links
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='HOTELS'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='RAIL DRISHTI']")).click();
		//get collection all windows
		ArrayList<String> brw = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(brw);
		//give control to air ticket
		driver.switchTo().window(brw.get(3));
		Thread.sleep(5000);
		String expectedtitle="Air Ticket Booking";
		String actualtitle= driver.getTitle();
		if(actualtitle.contains(expectedtitle))
		{
			System.out.println("Title is matching::"+expectedtitle+"   "+actualtitle);
		}
		else
		{
			System.out.println("Title is Not matching::"+expectedtitle+"   "+actualtitle);
		}
		Thread.sleep(5000);
		driver.close();
		//switch to parent
		driver.switchTo().window(brw.get(0));
		Thread.sleep(5000);
		String expected ="IRCTC Next Generation ";
		String actual =driver.getTitle();
		if(actual.contains(expected))
		{
			System.out.println("Title is Matching::"+expected+"   "+actual);
		}
		else
		{
			System.out.println("Title is Not Matching::"+expected+"   "+actual);
		}
		Thread.sleep(5000);
		driver.close();
		//switch to rail
		driver.switchTo().window(brw.get(1));
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
		//switch to hotel
		driver.switchTo().window(brw.get(2));
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}

}
