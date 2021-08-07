package june30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable2 {

	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		//store table into webelement
		WebElement table =driver.findElement(By.className("dataTable"));
		//get collection of rows in a table
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		for(int i=1; i<rows.size(); i++)
		{
			//get collection of columns in each row
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			Thread.sleep(500);
			System.out.println("Row No."+i+"   "+"Column size::"+cols.size());
		}
		Thread.sleep(5000);
		driver.close();
	}

}
