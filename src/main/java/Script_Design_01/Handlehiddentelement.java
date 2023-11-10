package Script_Design_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Handlehiddentelement
{

	public static void main(String[] args)
	{


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("hide-textbox")).click();
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value='amit giri';");
		
		//driver.findElement(By.id("displayed-text")).sendKeys("amit giri");
		
		System.out.println("done...");
		
		
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.)
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		
	}

}
