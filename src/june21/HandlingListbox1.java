package june21;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingListbox1 {
	public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://primusbank.qedgetech.com/");
		Thread.sleep(5000);
		//store listbox into select class
		Select branchlistbox = new Select(driver.findElement(By.name("drlist")));
		//verify listbox is single or multiselection
		boolean value =branchlistbox.isMultiple();
		System.out.println(value);
		//select item
		branchlistbox.selectByVisibleText("patny12");
		Thread.sleep(5000);
		branchlistbox.selectByValue("ameerpet25");
		Thread.sleep(5000);
		branchlistbox.selectByIndex(12);
		Thread.sleep(5000);
		driver.close();

	}

}
