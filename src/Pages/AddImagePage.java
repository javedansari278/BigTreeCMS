package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import TestBase.TestBase;

public class AddImagePage extends TestBase {
	
	public static boolean verify_continue_Button()
	{
		 	return driver.findElement(By.xpath("//input[@value='Continue']")).isEnabled();
		
		 
	}
	
	public static void Drag_Drop_Section()
	{
		WebElement drag_drop_click=driver.findElement(By.xpath("//*[text()='Drag and drop files into this zone or click to manually upload.']"));
		Actions action = new Actions(driver);
		action.moveToElement(drag_drop_click);
		action.click().build().perform();
	}
	
	public static void click_ContinueButton()
	{
		driver.findElement(By.xpath("//input[@class='blue button js-continue-button']")).click();
	}

}
