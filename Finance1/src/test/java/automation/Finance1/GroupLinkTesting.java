package automation.Finance1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class GroupLinkTesting  extends BasePage
{
  
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception
  {
	browserLaunch(browser,getData("bingurl"));  
  }
  
  @Test
  public void staticHeaderLinks() 
  {
	 WebElement header = driver.findElement(By.id("sc_hdu"));
	 List<WebElement> links = header.findElements(By.tagName("a"));
	 for(int i=0;i<links.size();i++)
	 {
		 if(!links.get(i).getText().isEmpty())
		{
			if(links.get(i).getText().equals("Videos"))
			{
				links.get(i).click();
			}
		 }
		 
		  header = driver.findElement(By.id("sc_hdu"));
		  links = header.findElements(By.tagName("a"));
		 
			 
	 }
  }

  @AfterClass
  public void afterClass() {
  }

}
