package automation.Finance1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;

public class MultipleLinkTest extends BasePage
{
 
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) throws Exception
  {
	browserLaunch(browser,getData("eenaduurl"));  
  }
  
  @Test(priority=2)
  public void singleLink()
  {
	driver.findElement(By.linkText("Register Now")).click(); 
  }
  
  @Test(priority=1)
  public void MultipleLink()
  {
	  List<WebElement> var = driver.findElements(By.tagName("a"));
	  for(int i=0;i<var.size();i++)
	  {
		if(!var.get(i).getText().isEmpty())
		{
			String links=var.get(i).getText();
			System.out.println(links);
		}
	  }
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
