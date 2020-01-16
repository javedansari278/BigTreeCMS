package TestCases;

import org.testng.annotations.Test;

import Pages.AddImagePage;

import TestBase.TestBase;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class AddImagesPage_Test extends TestBase {
	
  @Test(priority = 1)
  public static void verify_ContinueButton() 
  {		
	  //boolean actual_Continue_Button = driver.findElement(By.xpath("//input[@value='Continue']")).isEnabled();
	  boolean continueButton=AddImagePage.verify_continue_Button();
	  Assert.assertEquals(continueButton, true);
	  System.out.println("Continue button is enable : " + continueButton);
	  
  }
  
  @Test(priority = 2)
  public static void upload_ImageFile() throws Exception
  {
	  AddImagePage.Drag_Drop_Section();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Runtime.getRuntime().exec("C:\\Users\\javed\\eclipse-workspace\\BigTreeCMS\\AutoIT\\ImagefileUpload1.exe");
	  
  }
  
  
  
  @Test(priority = 3)
  public static void click_ContinueButton() throws Exception
  {
	  String expectedURL="https://demo.bigtreecms.org/admin/files/crop/0/";
	  Thread.sleep(10000);
	  AddImagePage.click_ContinueButton();
	  Assert.assertEquals(driver.getCurrentUrl(), expectedURL);
  }
  
  
  @BeforeClass
  public void setUp() throws Exception {
	  
	  super.ConfigLoad();
	  super.BrowserInit();
	  LoginPage_Test.LoginTest();
	  DashboardPage_Test.click_FileTab();
	  FilePageTest.click_AddImageLink();
	  System.out.println("Upload Image Test Started");
  }

  @AfterClass
  public void afterTest() throws Throwable 
  {
	 
	 driver.quit();
	 System.out.println("Upload Image test finished");
  }

}
