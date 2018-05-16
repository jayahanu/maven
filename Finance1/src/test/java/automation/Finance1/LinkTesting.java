package automation.Finance1;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class LinkTesting extends BasePage
{
  
  @Test
  public void linkTesting()
  {
	  driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("hanumantharao.kota");  
  }
  
  @BeforeMethod
  @Parameters("browser")
  public void setUp(String browser) throws Exception 
  {
	browserLaunch(browser, getData("facebookurl"));  
  }

  @AfterMethod
  public void killProcess()
  {
	driver.close();  
  }

}
