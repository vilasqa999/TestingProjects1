package Script_Design_01;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleRefException {

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.pavantestingtools.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement link=driver.findElement(By.xpath("//a[text()='Online Training']"));
		link.click();
		
		driver.navigate().back();
		
		Thread.sleep(5000);
		try
		{
		 link.click();
		}
		catch(StaleElementReferenceException e)
		{
			
			WebElement link1=driver.findElement(By.xpath("//a[text()='Online Training']"));
			link1.click();
			
		}
		System.out.println("done...");
		
	}

}
