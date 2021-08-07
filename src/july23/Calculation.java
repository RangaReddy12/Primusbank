package july23;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculation {
	String inputpath ="e://Intrestcal.xlsx";
	String outputpath ="E://CalResults.xlsx";
	WebDriver driver;
	FileInputStream fi;
	FileOutputStream fo;
	Workbook wb;
	Sheet ws;
	@BeforeTest
	public void setUp()throws Throwable
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@Test
	public void verifypercetage()throws Throwable
	{
		fi= new FileInputStream(inputpath);
		wb = WorkbookFactory.create(fi);
		ws = wb.getSheetAt(0);
		int rowcount =ws.getLastRowNum();
		Reporter.log("No of rows are::"+rowcount,true);
		for(int i=1;i<=rowcount; i++)
		{
			driver.get("https://www.calculator.net/percent-calculator.html");
			Thread.sleep(5000);
			if(wb.getSheet("cal").getRow(i).getCell(0).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata1 =(int)wb.getSheet("cal").getRow(i).getCell(0).getNumericCellValue();
				String percentage =String.valueOf(celldata1);
				if(wb.getSheet("cal").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					int celldata2=(int)wb.getSheet("cal").getRow(i).getCell(1).getNumericCellValue();
					String Amount =String.valueOf(celldata2);
					driver.findElement(By.name("cpar1")).sendKeys(percentage);
					Thread.sleep(3000);
					driver.findElement(By.name("cpar2")).sendKeys(Amount);
					Thread.sleep(3000);
					driver.findElement(By.xpath("(//*[@value='Calculate'])[1]")).click();
					Thread.sleep(3000);
					//capture text
					String intresttext=driver.findElement(By.xpath("//p[@class='verybigtext']")).getText();
					ws.getRow(i).createCell(2).setCellValue(intresttext);
					Reporter.log(percentage+"    "+Amount+"    "+intresttext,true);
				}
			}
		}
		fi.close();
		fo= new FileOutputStream(outputpath);
		wb.write(fo);
		fo.close();
		wb.close();
	}
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
