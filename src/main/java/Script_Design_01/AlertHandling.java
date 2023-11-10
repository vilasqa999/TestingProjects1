package Script_Design_01;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertHandling 
{

	public static void main(String[] args) throws InterruptedException, IOException 
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		

		WebElement prompt= driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
		
		prompt.click();
		
		driver.switchTo().alert().sendKeys("vilas giri");
		
		driver.switchTo().alert().accept();
		
		System.out.println("done..............");
		
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		Thread.sleep(4000);
		
		WebElement city= driver.findElement(By.xpath("//table[@id='countries']/tbody/tr[11]/td[3]"));
		System.out.println(city.getText());
		
		TakesScreenshot ts= (TakesScreenshot) driver;
	     File src= ts.getScreenshotAs(OutputType.FILE);
	     File dest= new File("C:\\Users\\vilas\\OneDrive\\Pictures\\Screenshots\\test10.png");
	     FileUtils.copyFile(src, dest);
	     
	     System.out.println("done..............");
	     
	     driver.switchTo().newWindow(WindowType.TAB);
	     
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	     
	     String title= driver.getTitle();
	     
	     System.out.println(title);
	     
	     
	     // explicit wait
	     
	     WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
	     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	     
	     //
//	     Wait<WebDriver> wait1=new FluentWait<WebDriver> driver
//	    		                .withTimeouts(Duration.ofSeconds(10))
//	    		                .pollingEvery(Duration.ofSeconds(2))
//	    		                .ignoring(NoSuchElementException.class);
	}
	
	
	

}
