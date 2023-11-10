package Script_Design_01;

import java.time.Duration;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertion 
{

	@Test
	public void verifypage()
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement icon= driver.findElement(By.className("wikipedia-icon"));
		
		SoftAssert soft=new SoftAssert();

		soft.assertTrue(icon.isDisplayed());
		
		System.out.println("icon displayed... ");
		
		String expect= driver.getTitle();
		String acutal= "Automation Testing Practice";
		
		soft.assertEquals(acutal, expect);
		
		System.out.println("string title matched...");
		
		WebElement button= driver.findElement(By.className("wikipedia-search-button"));
		soft.assertTrue(button.isDisplayed());
		
		soft.assertAll();
		
		
	}
	
	@Test(invocationCount=5)
	public void testcase()
	{
		System.out.println("hello");
	}
	
}
