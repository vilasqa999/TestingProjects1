package Script_Design_01;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter
{
	
	@Test
	@Parameters({"i","j"})
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	
	
	@DataProvider(name="inputdata")
	public Object[][] serachdata()
	{
		Object obj[][]=new Object[2][3];
		
		return obj;
	}

}
