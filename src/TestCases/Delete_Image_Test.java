package TestCases;

import org.testng.annotations.Test;

import Pages.DashBoardPage;
import Pages.Delete_ImagePage;
import Pages.FilePage;
import TestBase.TestBase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class Delete_Image_Test extends TestBase {
  @Test(priority = 1)
  public void click_FileTab() {
	  
	  //DashBoardPage.FileTab();
	  driver.switchTo().alert().accept();
  }
  
  @Test(priority = 2)
  public void click_DeleteIcon()
  {   
	  Delete_ImagePage.delete_Icon();
  }
  
  @Test(priority = 3)
  public void click_DeleteButton()
  {
	  Delete_ImagePage.delete_Button();
  }
  
 

  @BeforeClass
  public void setUp() throws Throwable {
	  
	  super.ConfigLoad();
	  super.BrowserInit();
	  LoginPage_Test.LoginTest();
	  DashboardPage_Test.click_FileTab();
	  System.out.println("Delete Test Case Started");
	  //FilePageTest.click_AddImageLink();
	  
	 // AddImagesPage_Test.verify_ContinueButton();
	  //AddImagesPage_Test.upload_ImageFile();
	  //AddImagesPage_Test.click_ContinueButton();
  }

  @AfterClass
  public void afterTest() {
	  
	  driver.quit();
	  System.out.println("Delete testcase Finished");
  }

}
