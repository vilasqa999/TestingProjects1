package Test_Reading_Data;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase2 {

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub

		ReadData1 data=new ReadData1();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(data.getUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("user-name")).sendKeys(data.getUsername());
		driver.findElement(By.id("password")).sendKeys(data.getPassword());
		driver.findElement(By.id("login-button")).click();
		
	}

}
