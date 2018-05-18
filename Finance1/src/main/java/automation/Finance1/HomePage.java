package automation.Finance1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(linkText="Sign in")WebElement signIn;
	@FindBy(id="email")WebElement email;
	@FindBy(id="passwd")WebElement password;
	@FindBy(id="SubmitLogin")WebElement submitlogin;
	@FindBy(xpath="//h1[text()='My account']")WebElement verifyaccount;
	
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}


	public void login()
	{
		signIn.click();
		email.sendKeys("qatest@gmail.com");
		password.sendKeys("password");
		submitlogin.click();
	}
	
	
	public String verifyLoginPage()
	{
		return verifyaccount.getText();
		
	}
	
}
