/*package tt.ebey.stepsDef;

//public class EbayShirtsSteps {
	
	import cucumber.api.PendingException;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
import tt.ebey.pageAction.EbayHomePageActions;
import tt.ebey.pageAction.EbaySearchResultActions;
	
public class EbayShirtsSteps {
	//public class EbaySearchSteps {
	EbaySearchResultActions EbayShirtsActionsObj = new EbaySearchResultActions(); 
	EbaySearchResultActions EbayShirtsResultActionsObj = new EbaySearchResultActions();
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();

		@Given("^Open Ebay Homepage$")
		public void open_Ebay_Homepage1() throws Throwable {
			EbayHomePageActionsObj.loadEbayHomepage();



		}

		@When("^Search for Shirts$")
		public void search_for_Shirts() throws Throwable {
			EbayHomePageActionsObj.searchShirts();

		}

		@Then("^Item list should have only Shirts related products$")
		public void item_list_should_have_only_Shirts_related_products() throws Throwable {
			EbayShirtsResultActionsObj.verifyShirtsItems();

		}

}*/
