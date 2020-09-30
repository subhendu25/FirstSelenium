package com.MMT.pages;

import com.MMT.testbases.TestBase;
import java.io.IOException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelBook extends TestBase {
	

	@FindBy(xpath="//*[@id=\"detpg_headerright_book_now\"]")
	public WebElement click_book;

	

	public HotelBook() throws IOException

	{
		PageFactory.initElements(driver, this);
	}
	// action need to be performed




	public void bookhotel() throws InterruptedException
	{
		
     click_book.click();
			
	}

}
