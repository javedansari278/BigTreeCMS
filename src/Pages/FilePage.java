package Pages;

import org.openqa.selenium.By;

import TestBase.TestBase;

public class FilePage extends TestBase{
	
	public static void  click_addImageLink()
	{
		driver.findElement(By.xpath("//a[text()='Add Images']")).click();
	}

}
