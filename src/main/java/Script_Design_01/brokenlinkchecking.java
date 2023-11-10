package Script_Design_01;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinkchecking 
{

	public static void main(String[] args)
	{


		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.deadlinkcity.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links=	driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		int resCode=200;
		int brokencnt=0;
		for(WebElement link:links)
		{
			String urls= link.getAttribute("href");
			
			try
			{
				URL url= new URL(urls);
				HttpURLConnection huc= (HttpURLConnection) url.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode= huc.getResponseCode();
				
				if(resCode>=400)
				{
					System.out.println("broken links:" + urls);
					brokencnt++;
				}
			}
			
			catch(MalformedURLException e)
			{
				
			}
			
			catch(Exception e)
			{
				
			}
		}
		
		System.out.println("broken cnt: " + brokencnt);

	}

}
