package Script_Design_01;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmapuse
{

	public static void main(String[] args) throws InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
	    HashMap<String, String> map=new HashMap();
	    map.put("Admin","Admin:admin123");
	    String arr[]=map.get("Admin").split(":");
	    System.out.println(arr[0]);
	    System.out.println(arr[1]);
	    
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.name("username")).sendKeys(arr[0]);
	    driver.findElement(By.name("password")).sendKeys(arr[1]);
	    driver.findElement(By.className("oxd-button")).click();
	    
	    System.out.println("done...");
	    Thread.sleep(4000);
	    driver.close();
	    
	    System.out.println("show");
	    String title=driver.getTitle();
	    System.out.println("title" +title);
	}

}
