 package tt.ebey.pageElements;
 
//import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

//import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {



// Ebay Search Button Without Page Factory Locator
//WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));
//Search Text Box - Page Factory Locators

@FindBy(xpath="//input[@placeholder= 'Search for anything']")
public WebElement txtbxSearch;

//@FindBy(xpath="//a[contains(text(),'Daily Deals')]")
//public WebElement btnDailyDeals;

//myEbay
@FindBy(xpath="//a[@title='My eBay']")
public WebElement myEbay;

//Summary Button - Page Factory Locators
@FindBy(xpath="//a[contains(text(),'Summary')]")
public WebElement btnSummary;

//Search Button - Page Factory Locators
@FindBy(xpath="//input[@value='Search']")
public WebElement btnSearch;

}



/* package tt.ebey.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {

	
	
	//Search Text Box - Page Factory Locators
	@FindBy(xpath="//input[@value='Search']")
	public WebElement btnSearch;
	
// Ebay Search Button Without Page Factory Locator
	//WebElement btnSearch2 = SetupDrivers.driver.findElement (By.xpath("//input[@value= 'Search']"));	
	//Search Text Box - Page Factory Locators
	
	@FindBy(xpath="//input[@placeholder= 'Search for anything']")
	public WebElement txbtnSearch;
	
	

} */
