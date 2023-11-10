package Test_POM;

import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class skiptesting 
{
	
	@Test
	public void testcase1()
	{
		
		WebDriver driver=new ChromeDriver();
		
		
		System.out.println("done case...");
	//	Assert.asserte
	//	Asserts.assertTrue(true);
	}

	

	@Test
	public void testcase2()
	{
		
		throw new SkipException("skipped test case");
		
	}

}
