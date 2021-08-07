package july2;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenShot {
public static void main(String[] args) throws Throwable{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://gmail.com");
		Thread.sleep(5000);
		//java time stamp
		Date date = new Date();
		DateFormat df = new SimpleDateFormat("YYYY_MM_dd  hh_mm_ss");
		String datef =df.format(date);
		//take screen shot and store
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//copy screen shot into local system
		FileUtils.copyFile(screen, new File("./Screens/"+datef+" "+"homepage.png"));
		driver.close();
	}

}
