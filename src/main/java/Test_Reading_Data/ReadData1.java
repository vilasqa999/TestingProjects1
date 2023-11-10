package Test_Reading_Data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadData1 
{

	public Properties prop;
	String path="C:\\Users\\vilas\\eclipse-workspace\\Testing_Project1\\src\\main\\java\\Test_Reading_Data\\config1.properties";
	public ReadData1() throws IOException
	{
		
		FileInputStream fis= new FileInputStream(path);
				prop=new  Properties();
				prop.load(fis);
	}
	
	public String getUrl()
	{
		String url1= prop.getProperty("url");
		
		if(url1!=null)
		{
			return url1;
		}
		else
		{
			throw new RuntimeException("url is empty");
		}
	}
	

	public String getUsername()
	{
		String username1= prop.getProperty("username");
		
		if(username1!=null)
		{
			return username1;
		}
		else
		{
			throw new RuntimeException("username1 is empty");
		}
	}
	

	public String getPassword()
	{
		String password1= prop.getProperty("password");
		
		if(password1!=null)
		{
			return password1;
		}
		else
		{
			throw new RuntimeException("password1 is empty");
		}
	}
	
}
