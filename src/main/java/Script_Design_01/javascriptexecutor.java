package Script_Design_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor 
{

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('Wikipedia1_wikipedia-search-input').value='Narendra modi';");
		
		
		WebElement button =driver.findElement(By.className("wikipedia-search-button"));
		
        js.executeScript("arguments[0].click()", button);
        
        js.executeScript("window.scrollBy(0,1300)");
        
        System.out.println("done..........");
        
        Thread.sleep(3000);
        
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[3]/td[2]")).click();
        
	}

}
