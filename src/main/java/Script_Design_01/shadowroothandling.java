package Script_Design_01;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowroothandling 
{

	public static void main(String[] args) 
	{

WebDriver driver=new ChromeDriver();

 driver.get("https://books-pwakit.appspot.com/");
 driver.manage().window().maximize();
  
 WebElement shadowroot= driver.findElement(By.tagName("app-header"));
 
  JavascriptExecutor js= (JavascriptExecutor) driver;
  
  WebElement rootele=(WebElement) js.executeScript("return arguments[0].shadowRoot", shadowroot);

   

	}

}
