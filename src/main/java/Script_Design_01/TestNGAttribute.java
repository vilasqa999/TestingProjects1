package Script_Design_01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAttribute 
{

	@Test(description="smoke test case.")	
	public void testcase1()
	{
		 
		System.out.println("testcase1......");
	}
	
	@Test(dependsOnMethods= {"mobile2"})
	public void mobile1()
	{
		 
		System.out.println("testcase1 mobile1 done  ....");
	}
	
	
	@Test
	public void mobile2()
	{
		 Assert.fail();
		System.out.println("testcase2 mobile2 done......");
	}
	
}
