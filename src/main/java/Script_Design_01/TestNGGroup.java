package Script_Design_01;

import org.testng.annotations.Test;

public class TestNGGroup 
{

	@Test (groups="mobile")
	public void mobile1()
	{
		System.out.println("mobile 1...");
	}
	
	@Test(groups="mobile")
	public void mobile2()
	{
		System.out.println("mobile 2...");
	}
	
	
	@Test(groups="mobile")
	public void mobile3()
	{
		System.out.println("mobile 3...");
	}
	
	@Test (groups="computer")
	public void computer1()
	{
		System.out.println("computer 1...");
	}
	

	@Test(groups="computer")
	public void computer2()
	{
		System.out.println("computer 2...");
	}
	

	@Test(groups="computer")
	public void computer3()
	{
		System.out.println("computer 3...");
	}
	
	
}
