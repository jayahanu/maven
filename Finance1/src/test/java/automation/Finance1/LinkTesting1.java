package automation.Finance1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LinkTesting1  extends BasePage
{
  
  @BeforeMethod
  @Parameters
  public void beforeClass(String browser) throws Exception 
  {
	 browserLaunch(browser,getData("facebookurl")); 
  }
  @Test
  public void f()
  {
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
