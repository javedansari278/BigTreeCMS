package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	public static WebDriver driver=null;
	public static WebElement element =null;
	static Properties prop;
	
	public static void ConfigLoad() throws Exception
	{
		File f = new File("C:\\Users\\javed\\eclipse-workspace\\BigTreeCMS\\src\\Config\\Config.properties");
		FileInputStream fis =new FileInputStream(f);
		prop = new Properties();
		prop.load(fis);
	}
	
	public static void BrowserInit()
	{	
		String BrowserName1 = prop.getProperty("BrowserName");
		if(BrowserName1.equalsIgnoreCase("Chrome1"))
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome 78\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(BrowserName1.equalsIgnoreCase("IE1"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else if(BrowserName1.equalsIgnoreCase("Firefox1"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("AppURL"));
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	
}
