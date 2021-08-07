package july2;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {

	public static void main(String[] args) throws Throwable{
		FileReader fr = new FileReader("e:/logindata.txt");
       BufferedReader br = new BufferedReader(fr);
       String str="";
       while((str=br.readLine())!=null)
       {
    	 //java time stamp
   		Date date = new Date();
   		DateFormat df = new SimpleDateFormat("YYYY_MM_dd  hh_mm_ss");
   		String datef =df.format(date);
    	   //split note pad data into array variavle
    	   String login[]=str.split(";");
    	   WebDriver driver = new ChromeDriver();
    	   driver.manage().window().maximize();
    	   driver.get("http://orangehrm.qedgetech.com/");
    	   Thread.sleep(5000);
    	   driver.findElement(By.name("txtUsername")).sendKeys(login[0]);
    	   driver.findElement(By.name("txtPassword")).sendKeys(login[1]);
    	   driver.findElement(By.name("Submit")).submit();
    	   Thread.sleep(3000);
    	   if(driver.getCurrentUrl().contains("dashboard"))
    	   {
    		   System.out.println("Login success::"+login[0]+"   "+login[1]);
    	   }
    	   else
    	   {
    		 //take screen shot for fail
    		   File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    		   FileUtils.copyFile(screen, new File("./Screens/"+datef+"  "+"Loginpage.png"));
    		   System.out.println("Login Fail::"+login[0]+"   "+login[1]);
    	   }
    	   driver.close();
       }
	}
   }
