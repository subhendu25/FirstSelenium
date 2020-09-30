package com.MMT.pages;
import com.MMT.testbases.TestBase;
import java.io.IOException;
import java.util.Set;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelSelect extends TestBase {
	
	String parent=driver.getWindowHandle();
	
	// page repository=OR.properties


//	@FindBy(xpath="//*[@id=\"hlistpg_fr_locality\"]/div/div[3]/ul/li[9]/span/label/span")
//	public WebElement paharganjarea;


	@FindBy(xpath="//*[@id=\"htl_id_seo_201608291502581249\"]")
	public WebElement hotel_click;

	
	// initialize the page objects

	public  HotelSelect() throws IOException

	{
		PageFactory.initElements(driver, this);
	}
	// action need to be performed

	public String validateSearchPageTitle()

	{
		return driver.getTitle();
	}


	public void selecthotel() throws InterruptedException
	{
//		paharganjarea.click();
		Thread.sleep(3000);
		hotel_click.click();
		Thread.sleep(10000);
		Set <String> allWindows=driver.getWindowHandles();
		
		for (String child:allWindows)
		{
			if(!parent.equals(child))
			{
				driver.switchTo().window(child);
				driver.switchTo().alert().dismiss();
			}
			
			
		}
			
//		driver.switchTo().window(parent);
		
	}

}
