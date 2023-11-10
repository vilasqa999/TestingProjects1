package Test_POM;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Extent_report 
{

	
	ExtentSparkReporter htmlreporter;
	ExtentReports reports;
	ExtentTest test;
	
	@Test
	public void openReport()
	{
		
		htmlreporter = new ExtentSparkReporter("ExtentReportdemo1.html");
		reports= new ExtentReports();
		reports.attachReporter(htmlreporter);
		
		reports.setSystemInfo("Machine", "HP");
		reports.setSystemInfo("OS", "Windows");
		reports.setSystemInfo("Browser", "Chrome");
		reports.setSystemInfo("Userl", "Amit");
		
		htmlreporter.config().setDocumentTitle("Extent Report Demo");		
		htmlreporter.config().setReportName("Test report");
		htmlreporter.config().setTheme(Theme.STANDARD);;
		htmlreporter.config().setTimeStampFormat("EEEE, MMMM,dd,yyyy, hh:mm a('zzz')'");
		
		
		
	}
	
	@Test
	public void launchBrowser()
	{
		
		test= 	reports.createTest("launch browser and open url");
		Assert.assertTrue(true);
	}
	
	
	@Test
	public void verifyTitle()
	{
		
		test= 	reports.createTest("check page title");
		Assert.assertTrue(true);
	}
	
	@Test
	public void verifyLogo()
	{
		
		test= 	reports.createTest("check page title");
		
		throw new SkipException("test case is skipped");
	//	Assert.assertTrue(true);
	}
	

	
	@Test
	public void verifyIcon()
	{
		
		test= 	reports.createTest("verify the icon");
		Assert.assertTrue(true);
	}
	
	@AfterTest
	public void teardown()
	{
		
		reports.flush();
	}
	
}
