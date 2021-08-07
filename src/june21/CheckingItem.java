package june21;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class CheckingItem {
	public static void main(String[] args) throws Throwable{
		//String expecteditem ="deals";
		String expecteditem ="hyderabad";
		boolean itemexist=false;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(5000);
		//store listbox into select class
		Select listbox = new Select(driver.findElement(By.id("searchDropdownBox")));
		//get collection
		List<WebElement> Olist =listbox.getOptions();
		System.out.println("No of items are::"+Olist.size());
		for(WebElement each : Olist)
		{
			String actualitems=each.getText();
			Thread.sleep(1000);
			System.out.println(actualitems);
			if(actualitems.equalsIgnoreCase(expecteditem))
			{
				itemexist=true;
				break;
			}
		}
		//it itemexist is true item found if item exist false item not found
		if(itemexist)
		{
			System.out.println("Item Exist In Listbox::"+expecteditem);
		}
		else
		{
			System.out.println("Item not Exist In Listbox::"+expecteditem);
		}
	}

}
