package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class Delete_ImagePage extends TestBase {
	
	public static void delete_Icon()
	{
		driver.findElement(By.xpath("//a[@class='icon_delete']")).click();
	}
	
	public static void delete_Button()
	{
		driver.findElement(By.xpath("//input[@class='button red']")).click();
	}

}
