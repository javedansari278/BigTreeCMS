package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class LoginPage extends TestBase {

	
	public static void userName()
	{
		driver.findElement(By.xpath("//input[@name='user']")).sendKeys("demo@bigtreecms.org");
	}
	
	public static void password()
	{
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("demo");
	}
	
	public static void login_button()
	{
		driver.findElement(By.xpath("//input[@class='button blue']")).click();
	}
}
