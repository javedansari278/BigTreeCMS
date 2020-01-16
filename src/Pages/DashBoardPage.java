package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class DashBoardPage extends TestBase{
	
	public static void FileTab()
	{
		driver.findElement(By.xpath("//a[text()='Files']")).click();
	}

}
