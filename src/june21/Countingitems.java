package june21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Countingitems {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection of items in listbox
		List<WebElement> Olist =listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		Thread.sleep(5000);
		for(WebElement each : Olist)
		{
			//capture each item name
			String itemname = each.getText();
			Thread.sleep(1000);
			System.out.println(itemname);
			//click each item in listbox
			each.click();
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
