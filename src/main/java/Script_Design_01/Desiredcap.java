package Script_Design_01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Desiredcap
{

	public static void main(String[] args) throws MalformedURLException
	{

		ChromeOptions opt=new ChromeOptions();
		
		
		opt.setCapability("browserName", "chrome");
		opt.setCapability("platformName", "windows 11");
		//opt.setCapability("browserName", "firefox");
		
		WebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444"),opt);
		
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/selenium-4-features");
	}

}
