package Test_POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver=new ChromeDriver();
		
		LoginPage page=new LoginPage(driver);
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.enterFirstName("amit");
		page.enterLastName("patil");
		page.enterphone("9087654321");
		page.enteremail("amitpatil@gmail.com");
		page.enteraddress("flat 12, lane45, karvenager pune");
		page.entercity("pune");;
		page.enterstate("punjab");
		page.enterpostalCode("411098");;
		page.clickcountry();
		Thread.sleep(3000);
		
		page.enterusername("amit10");
		page.enterpassword("amit123");;
		page.enterconfirmpassword("amit123");
		page.clickonsubmit();
		
	}

}
