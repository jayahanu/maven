package automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class NewTest practies {
  @Test
  public void f()
  {
	  driver.findElement(By.linkText("Sign in")).click();
	  driver.findElement(By.id("email")).sendKeys("qatest@gmail.com");
	  driver.findElement(By.id("passwd")).sendKeys("password");
	  driver.findElement(By.id("SubmitLogin")).click();
	 String actval = driver.findElement(By.xpath("//h1[text()='My account']")).getText();
	 String expval = "My account";
	// Assert.assertEquals(actval, expval);
	 Assert.assertTrue(actval.equalsIgnoreCase(expval));
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
