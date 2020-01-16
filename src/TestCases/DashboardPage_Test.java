package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.DashBoardPage;
import TestBase.TestBase;

public class DashboardPage_Test extends TestBase{
	
	@Test
	public static void click_FileTab()
	{
		DashBoardPage.FileTab();
	}
	
	@BeforeTest
	public void setUp() throws Throwable
	{
		super.ConfigLoad();
		super.BrowserInit();
		LoginPage_Test.LoginTest();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
