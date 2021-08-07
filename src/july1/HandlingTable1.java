package july1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable1 {

	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/mutual-funds");
		Thread.sleep(5000);
		WebElement table = driver.findElement(By.xpath("//table[@class='dataTable']"));

		//get collection of rows in a table
		List<WebElement> rowssize =table.findElements(By.tagName("tr"));
		int rows =rowssize.size()-1;
		System.out.println("No of rows are::"+rows);
		Thread.sleep(5000);
		//iterate all rows
		for(WebElement eachrow : rowssize)
		{
			//get collection of cells from eachrow
			List<WebElement> cols =eachrow.findElements(By.tagName("td"));
			//iterate all cells
			for(WebElement eachcell : cols)
			{
				//capture each cell text
				String eachcelltext =eachcell.getText();
				Thread.sleep(500);
				System.out.print(eachcelltext+"\n");
			}
			System.out.println();
			System.out.println("=================================================================");
		}
		{

		}
	}

}
