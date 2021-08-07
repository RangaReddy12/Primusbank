package june18;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class VerifyTitle {
	//equalsIgnoreCase : it compares two strings if both strings are equal returns true
	//it not eqaul returns false	
	public static void main(String[] args)throws Throwable {
		// create instance object
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//launch url
		//driver.get("https://google.com");
		driver.get("https://gmail.com");
		//suspend tool for 5 seconds
		Thread.sleep(5000);
		//store expected title 
		String ExpectedTitle="google";
		//get title in run time
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equalsIgnoreCase(ExpectedTitle))
		{
			System.out.println("Title is Matching::"+ExpectedTitle+"     "+ActualTitle);
		}
		else
		{
			System.out.println("Title is Not Matching::"+ExpectedTitle+"     "+ActualTitle);
		}
		Thread.sleep(5000);
		driver.quit();
	}

}
