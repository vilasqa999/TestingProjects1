package Script_Design_01;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownhandling 
{

	public static void main(String[] args) 
	{


		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement county= driver.findElement(By.name("country"));
		
		Select s1=new Select(county);
		
		// s1.selectByVisibleText("BAHRAIN");
		// s1.selectByIndex(24);
		//s1.selectByValue("VIETNAM");
		
		List<WebElement> cnt= s1.getOptions();
		
		for(WebElement w:cnt)
		{
			
			String cname= w.getText();
			
			if(cname.equals("INDIA"))
			{
				w.click();
			}
		}
		
		System.out.println("successs.........");
	}

}
