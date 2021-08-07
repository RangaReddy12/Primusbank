package june16;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateLogin {

	public static void main(String[] args)throws Throwable {
		Scanner s = new Scanner(System.in);
		for(int i=1; i<=5;i++)
		{
			//Create instance object
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://orangehrm.qedgetech.com/");
			//suspend tool fro 5 seconds
			Thread.sleep(5000);
			System.out.println("Enter username");
			String username =s.next();
			System.out.println("Enter password");
			String password=s.next();
			WebElement EnterUsername =driver.findElement(By.cssSelector("#txtUsername"));
			EnterUsername.clear();
			EnterUsername.sendKeys(username);
			Thread.sleep(5000);
			WebElement EnterPassword =driver.findElement(By.cssSelector("#txtPassword"));
			EnterPassword.clear();
			EnterPassword.sendKeys(password);
			Thread.sleep(5000);
			driver.findElement(By.cssSelector("#btnLogin")).click();
			Thread.sleep(5000);
			String Expected ="dashboard";
			//get url
			String Actual =driver.getCurrentUrl();
			if(Actual.contains(Expected))
			{
				System.out.println("Login success::"+Expected+"    "+Actual);
			}
			else
			{
				//capture error message
				String message = driver.findElement(By.cssSelector("#spanMessage")).getText();
				System.out.println(message+"   "+"Login Fail"+"     "+Expected+"         "+Actual);
			}
			driver.close();
		}
	}
}
