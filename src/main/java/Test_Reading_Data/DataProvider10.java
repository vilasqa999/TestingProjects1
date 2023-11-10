package Test_Reading_Data;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
public class DataProvider10 
{

	@Test (dataProvider= "datasupplier1")
	public void sampleloginTest(String username, String password)
	{
		
		System.out.println("Login using: " + username + " and" + password);
		
	}
	
	@DataProvider 	(name="datasupplier1")
	public Object[][] datasupplier()
	{
		Object data[][]= {{"vilas","1234"}, {"amit", "abcd"}, {"ajay" , "3456"}};
		return data;
	}
	
}
