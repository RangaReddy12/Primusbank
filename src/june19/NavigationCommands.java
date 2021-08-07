package june19;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class NavigationCommands {
	public static void main(String[] args)throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://google.com");
		System.out.println("pagetitle[1]"+driver.getTitle());
		Thread.sleep(5000);
		//click on gmail link
		driver.findElement(By.partialLinkText("Gmail")).click();
		System.out.println("pagetitle[2]"+driver.getTitle());
		Thread.sleep(5000);
		//click on back button to go to previous page
		driver.navigate().back();
		System.out.println("pagetitle[3]"+driver.getTitle());
		Thread.sleep(5000);
		//click on forward button to go to next page
		driver.navigate().forward();
		System.out.println("pagetitle[4]"+driver.getTitle());
		Thread.sleep(5000);
		//relaod page
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.close();
	}

}
