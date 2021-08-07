package june24;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows1 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get parent window id
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		//get collection of all windows
		Set<String> allwins =driver.getWindowHandles();
		System.out.println(allwins);
		//iterate all windows
		for(String each : allwins)
		{
			//parent id should not be equal to child windows
			if(!parent.equals(each))
			{
				//switch to each child window  gettitle and close
				Thread.sleep(5000);
				String pagetitle =driver.switchTo().window(each).getTitle();
				System.out.println(pagetitle);
				driver.manage().window().maximize();
				Thread.sleep(5000);
				driver.close();
			}
		}
		//switch to parent window
		driver.switchTo().window(parent);
		Thread.sleep(5000);
		//click on register for free
		driver.findElement(By.xpath("(//button[contains(text(),'Register for')])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[contains(text(),'I am')])[1]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
