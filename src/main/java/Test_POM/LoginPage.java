package Test_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{

	
	WebDriver driver;
	LoginPage(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="firstName")
	WebElement fname;
	
	
	@FindBy(name="lastName")
	WebElement lname;
	
	@FindBy(name="phone")
	WebElement phone;
	
	
	@FindBy(name="userName")
	WebElement email;
	
	@FindBy(name="address1")
	WebElement address;
	
	@FindBy(name="city")
	WebElement city;
	
	@FindBy(name="state")
	WebElement state;
	
	@FindBy(name="postalCode")
	WebElement postalCode;
	
	

	@FindBy(xpath="//select[@name='country']/child::option[@value='JAPAN']")
	WebElement country;
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement pass;
	
	@FindBy(name="confirmPassword")
	WebElement confirmPassword;
	
	@FindBy(name="submit")
	WebElement submit;
	
	public void enterFirstName(String firstName)
	{
		fname.sendKeys("firstname");
	}
	
	public void enterLastName(String lastName)
	{
		lname.sendKeys("lastname");
	}
	
	public void enterphone(String phoneno)
	{
		phone.sendKeys("phoneno");
	}
	
	public void enteremail(String emailid)
	{
		email.sendKeys("emailid");
	}
	
	public void enteraddress(String address1)
	{
		address.sendKeys("address1");
	}
	
	public void entercity(String city1)
	{
		city.sendKeys("city1");
	}
	
	public void enterstate(String state1)
	{
		state.sendKeys("state1");
	}
	
	public void enterpostalCode(String postalCode1)
	{
		postalCode.sendKeys("postalCode1");
	}
	
	
	public void clickcountry()
	{
		country.click();
	}
	
	
	///

	public void enterusername(String userid)
	{
		username.sendKeys("userid");
	}
	
	

	public void enterpassword(String pwd)
	{
		pass.sendKeys("pwd");
	}
	
	public void enterconfirmpassword(String confirmpwd)
	{
		confirmPassword.sendKeys("confirmpwd");
	}
	

	public void clickonsubmit()
	{
		submit.click();
	}
	
	
}
