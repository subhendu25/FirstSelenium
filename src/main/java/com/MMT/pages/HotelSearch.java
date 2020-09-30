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

public class HotelSearch extends TestBase {
	
	
@FindBy(xpath="//*[@id=\"SW\"]/div[1]/div[2]/div/div/nav/ul/li[2]/a")
WebElement HotelIcon;

@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[1]/label")
WebElement city_click;

@FindBy(xpath="//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div/div/p[1]")
WebElement cityNameclick;

@FindBy(xpath="//*[@id=\"checkin\"]")
WebElement calendarCheckinbutton_click;

@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[5]/div[4]")
WebElement checkindate_click;

@FindBy(xpath="/html/body/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[1]/div/div[3]/p/span[2]")
WebElement calendarCheckoutbutton_click;

@FindBy(xpath="/html/body/div/div/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[1]/div[7]")
WebElement checkoutdate_click;

@FindBy(xpath="//*[@id=\"hsw_search_button\"]")
WebElement SearchbuttonClick;

//@FindBy(xpath="//*[@id=\"hlistpg_search_htl_name_box\"]/div/input")
//WebElement PlaceOfChoiceClick;
//
//@FindBy(xpath="//*[@id=\"hlistpg_search_htl_name_box\"]/div/input")
//WebElement PlaceOfChoiceClick;

// initialize the page objects

public  HotelSearch() throws IOException

{
	PageFactory.initElements(driver, this);
}


public void findhotel() throws InterruptedException
{
	HotelIcon.click();
	city_click.click();
	Thread.sleep(3000);
	cityNameclick.click();
	calendarCheckinbutton_click.click();
	checkindate_click.click();
	calendarCheckoutbutton_click.click();
	checkoutdate_click.click();
	SearchbuttonClick.click();
	
	
}

}


