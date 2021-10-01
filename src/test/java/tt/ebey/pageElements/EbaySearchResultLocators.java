package tt.ebey.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

//tag[contains(text().'text')]
//span[contains(text(),'shoes')]
public class EbaySearchResultLocators {

	// Search Result Validation Locators
	@FindBy(xpath = "//span[contains(text(),'shoes')]")
	public WebElement txtShoes;

	// Search Category Without Page Factory Locator Need a method
	public String txtCategory(String Category) {
		WebElement txtCategory = SetupDrivers.driver
				.findElement(By.xpath("//span[contains(text(),'" + Category + "')]"));
		return txtCategory.getText();
	}

	public String clickBrands(String Brands) {
		WebElement clickBrands = SetupDrivers.driver.findElement(By.xpath("//h3[contains(text(),'" + Brands + "')]"));
		return clickBrands.getText();
	}

	// Selecting Shirt
	@FindBy(xpath="//span[contains(text(),'Big & Tall Cotton Tee')]")
	public WebElement lnkShirtItem;
	
}
	
	

/* package tt.ebey.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

//tag[contains(text().'text')]
//span[contains(text(),'shoes')]
public class EbaySearchResultLocators {

	// Search Result Validation Locators
	@FindBy(xpath = "//span[contains(text(),'shoes')]")
	public WebElement txtShoes;

	@FindBy(xpath = " //span[contains(text(),'masks')]")
	public WebElement txtMasks;

	// @FindBy(xpath="//span[contains(text(),'shirts')]")
	// public WebElement txtShirts;

	@FindBy(xpath = "//span[contains(text(),'Electronics')]")
	public WebElement txtElectronics;

	@FindBy(xpath = "//span[contains(text(),'shirts')]")
	public WebElement txtShirts;

	// Search Category Without Page Factory Locator Need a method
	/*
	 * public String txtCategory (String Category){ WebElement txtCategory =
	 * SetupDrivers.driver.findElement
	 * (By.xpath("//span[contains(text(),'"+Category+"')]")); return
	 * txtCategory.getText();
	 */

	/*
	 * public String txtCategory (String Category){ WebElement txtCategory =
	 * SetupDrivers.driver.findElement
	 * (By.xpath("//span[contains(text(),'"+Category+"')]")); return
	 * txtCategory.getText(); }
	 

public String txtCategory(String Category) {
		WebElement txtCategory = SetupDrivers.driver
				.findElement(By.xpath("//span[contains(text(),'" + Category + "')]"));
		return txtCategory.getText();
	}

} */