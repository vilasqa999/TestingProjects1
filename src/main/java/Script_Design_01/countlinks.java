package Script_Design_01;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class countlinks
{

	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.calculator.net/");
		
		List<WebElement> link= driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		for(WebElement links:link)
		{
			//
			
			String url= links.getText();
			System.out.println(url);
			if(url.equals("Pace Calculator"))
			{
				links.click();
			}
		}
	}

}
