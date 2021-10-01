package tt.ebey.stepsDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebey.pageAction.EbayHomePageActions;
import tt.ebey.pageAction.EbaySearchResultActions;

public class EbaySearchSteps {
EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
EbaySearchResultActions EbaySearchResultActionsObj= new EbaySearchResultActions();

	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage1() throws Throwable {

	}

	@When("^Search for Shoes$")
	public void search_for_Shoes() throws Throwable {

	}

	@Then("^Item list should have only Shoes related products$")
	public void item_list_should_have_only_Shoes_related_products() throws Throwable {

	}

	// *@Given("^Open Ebay Homepage$")
	//public void open_Ebay_Homepage() throws Throwable {

	//}

	@When("^Search for Shirts$")
	public void search_for_Shirts() throws Throwable {

	}

	@Then("^Item list should have only Shirts related products$")
	public void item_list_should_have_only_Shirts_related_products() throws Throwable {

	}

	//@Given("^Open Ebay Homepage$")
	//public void open_Ebay_Homepage2() throws Throwable {
	//}

	@Then("^Click on Electronics bar$")
	public void click_on_Electronics_bar() throws Throwable {

	}

	@When("^Electronics page display$")
	public void electronics_page_display() throws Throwable {
	}

	@Then("^Click on Car Electronics$")
	public void click_on_Car_Electronics() throws Throwable {

	}

	@Then("^Shop by Category pop up$")
	public void shop_by_Category_pop_up() throws Throwable {

	}

	@When("^Click on GPS Accessories & Tracking$")
	public void click_on_GPS_Accessories_Tracking() throws Throwable {

	}

	@Then("^Select Brand,Condition,Price$")
	public void select_Brand_Condition_Price() throws Throwable {

	}

	@Then("^Listed of Tracking Devices display according to need$")
	public void listed_of_Tracking_Devices_display_according_to_need() throws Throwable {

}
	@Given("^Opens Ebay Homepage$")
	public void opens_Ebay_Homepage() throws Throwable {
		EbayHomePageActionsObj.loadEbayHomepage();

	}

	@When("^Search for specific \"([^\"]*)\"$")
	public void search_for_specific(String Products) throws Throwable {
		EbayHomePageActionsObj.searchProducts(Products);

	}

	@Then("^Item list should have only specific \"([^\"]*)\"$")
	public void item_list_should_have_only_specific(String Category) throws Throwable {
		EbaySearchResultActionsObj.verifyCategory(Category);
		
	}

}

