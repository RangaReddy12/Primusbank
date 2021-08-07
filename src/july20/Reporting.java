package july20;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Reporting {
	ExtentReports report;
	ExtentTest test;
	@BeforeTest
	public void setUp()
	{
		//specify path for html
		report = new ExtentReports("./Reports/Demo.html");
	}
	@Test
	public void passTest()
	{
		test= report.startTest("Pass Test");
		test.log(LogStatus.PASS, "My Test Case Pass");
	}
	@Test
	public void failTest()
	{
		test= report.startTest("fail Test");
		test.log(LogStatus.FAIL, "My Test Case Fail");
	}
	@Test
	public void skipTest()
	{
		test= report.startTest("skip Test");
		test.log(LogStatus.SKIP, "My Test Case skip");
	}
	@AfterMethod
	public void tearDown()
	{
		report.endTest(test);
		report.flush();
	}
}
