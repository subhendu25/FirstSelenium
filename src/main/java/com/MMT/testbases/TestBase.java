package com.MMT.testbases;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import com.MMT.testdata.Xls_Reader;
import com.MMT.util.TestUtil;
public class TestBase 
{
	
//initializing the property file to read
	public static Properties CONFIG=null;
	public static Properties OR=null;
	public static WebDriver driver=null;
//	public static EventFiringWebDriver driver;
	public static boolean isLoggedIn=false;
	public static Xls_Reader datatable=null;
	public static Logger APP_LOGS;
	
	
	
	
	public void Initialize() throws IOException
	
	{
		if (driver==null)
		
//	    Config Properties File
		
		{
		CONFIG= new Properties();
		FileInputStream fn= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMT\\config\\config.properties");
		CONFIG.load(fn);
		
		OR=new Properties();
		fn= new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMT\\config\\OR.properties");
		OR.load(fn);
		
		
	// Initializing Browser
		
		if (CONFIG.getProperty("Browser").equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HOME\\Desktop\\Selenium\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"C:\\Users\\HOME\\Desktop\\Selenium\\Downloads\\firefox.log");
			System.out.println("Firefoxdriver file has been saved in local driver");
			driver = new FirefoxDriver();
			System.out.println("Firefoxdriver has been initialized");
			
		}
		else if (CONFIG.getProperty("Browser").equals("chrome"))
			
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Desktop\\Selenium\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("Chrome driver");
			
		}
		
		datatable= new Xls_Reader(System.getProperty("user.dir")+"\\src\\main\\java\\com\\MMT\\config\\Suite.xlsx");
//		driver= new EventFiringWebDriver(dr);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitwait, TimeUnit.SECONDS);
		driver.get(CONFIG.getProperty("ApplicationURL"));
//		driver.switchTo().alert().dismiss();
		Logger APP_LOGS = Logger.getLogger("devpinoyLogger");
		
	}}
	


//public static WebElement getObject(String xpathValue)
//{
//	try
//	{
//		return driver.findElement(By.xpath(OR.getProperty(xpathValue)));
//		
//	}
//	catch (Throwable t)
//	{
//		
//		TestUtil.takeScreenShot(xpathValue);
//		Assert.assertTrue(t.getMessage(), false);
//		return null;
//		
//	}
//}
//
//public static Select getdropownObject(String xpathValue)
//{
//	try
//	{
//		return new Select(driver.findElement(By.xpath(OR.getProperty(xpathValue))));
//		
//	}
//	catch (Throwable t)
//	{
//		return null;
//		
//	}
//}
}



