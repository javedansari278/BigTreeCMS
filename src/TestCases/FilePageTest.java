package TestCases;

import org.testng.annotations.Test;

import Pages.FilePage;
import TestBase.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class FilePageTest extends TestBase {
  @Test
  public static void  click_AddImageLink() 
  {
	  FilePage.click_addImageLink();
  }
  
  @BeforeTest
  public void beforeTest() throws Throwable 
  {
	  super.ConfigLoad();
	  super.BrowserInit();
	  LoginPage_Test.LoginTest();
	  DashboardPage_Test.click_FileTab();
  }

  @AfterTest
  public void afterTest() {
  }

}
