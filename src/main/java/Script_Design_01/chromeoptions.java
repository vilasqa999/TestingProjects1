package Script_Design_01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class chromeoptions {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("incognito");
		opt.addArguments("start-maximized");
		WebDriver driver= new ChromeDriver(opt);
		
		driver.get("https://testautomationpractice.blogspot.com/");;
	}

}
