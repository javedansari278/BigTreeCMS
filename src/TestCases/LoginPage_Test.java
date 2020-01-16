package TestCases;

import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class LoginPage_Test extends TestBase{
  
	
  @Test
  public static void LoginTest() 
  {
	  
	 LoginPage.userName();
	 LoginPage.password();
	 LoginPage.login_button();
	  
  }
  
  @BeforeTest
  public void setUp() throws Throwable 
  {
	  super.ConfigLoad();
	  super.BrowserInit();
	  
	  
  }

  @AfterTest
  public void afterTest() 
  {
	 driver.close();
  }

}
