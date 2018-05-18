package automation.Finance1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class testng extends BasePage
{
 
  @BeforeMethod
  @Parameters("browser")
  public void setUp(String browser) throws Exception 
  { 
	  browserLaunch(browser,getData("ecommerceurl"));
  }
  @Test
  public void customerLogin()
  {
	HomePage page = new HomePage(driver);
	page.login();
	Assert.assertTrue(page.verifyLoginPage().equalsIgnoreCase("My account"));
	
  }

  @AfterMethod
  public void endProcess() {
  }

}
