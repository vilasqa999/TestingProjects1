package Test_POM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LogReporter
{

	@Test
	public void openIndiagate() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		Reporter.log("web browser launch");
		
		driver.manage().window().maximize();
		Reporter.log("maximize web browser");
		
		driver.get("https://www.google.com/");
		Reporter.log("open google web browser");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement searchbox = driver.findElement(By.name("q"));
	    	searchbox.sendKeys("India gate");
	    	searchbox.sendKeys(Keys.ENTER);
	    	Reporter.log("Enter input text");	
	    	
	    	Reporter.log("close web browser ");
	    	
	    	Thread.sleep(4000);
	    	driver.quit();
				
	}
}
