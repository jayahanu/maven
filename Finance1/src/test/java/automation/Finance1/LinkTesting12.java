package automation.Finance1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LinkTesting12  extends BasePage
{
  
  @BeforeMethod
  @para
  public void startProcess(String browser)
  {
	browserLaunch(browser, getData("facebookurl"));  
  }
  
  @Test
  public void singleLink() 
  {
	  
  }

  @AfterMethod
  public void endProcess() {
  }

}
