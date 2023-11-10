package Test_Reading_Data;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws IOException, InterruptedException
	{

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		ReadData data=new ReadData();
		driver.get(data.getUrl());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("username")).sendKeys(data.getUsernmae());
		driver.findElement(By.name("password")).sendKeys(data.getpassword());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		System.out.println("done........");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
