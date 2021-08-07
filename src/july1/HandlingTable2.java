package july1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingTable2 {
public static void main(String[] args) throws Throwable{
		String expcountry="canada";
		boolean countryexist =false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(5000);
		WebElement table =driver.findElement(By.id("customers"));
		List<WebElement> rows =table.findElements(By.tagName("tr"));
		System.out.println("No of rows are::"+rows.size());
		Thread.sleep(5000);
		for(int i=1; i<rows.size(); i++)
		{
			List<WebElement> cols =rows.get(i).findElements(By.tagName("td"));
			for(int j=0; j<cols.size(); j++)
			{
				String actual =cols.get(j).getText();
				Thread.sleep(500);
				System.out.print("\n"+actual);

				if(actual.equalsIgnoreCase(expcountry))
				{
					countryexist =true;
					System.out.println(expcountry+"   "+"Found in Row::"+i+"   "+"In column::"+(j+1));
				}
			}
			System.out.println();
			System.out.println("=======================================================");

		}
		if(countryexist)
		{
			System.out.println("County Found in table::"+expcountry);	
		}
		else
		{
			System.out.println("County Not Found in table::"+expcountry);
		}
	}

}
