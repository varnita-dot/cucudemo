package parallel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AddToCartPage;
import pages.FlightBookingPage;
import pages.TopDealsPage;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import baseUtil.Base;
import io.cucumber.java.en.And;

public class AddCartStep {
	private Base base;
	AddToCartPage addcart;


	public AddCartStep(Base base)
	{
		this.base = base;
	}

	/*
	 * @Given("^User is on landing page$") public void user_is_on_landing_page()
	 * throws Throwable { //Base.init(); //driver = Hooks.driver;
	 * System.out.println("User is on landing page"); }
	 */

	@When("^User search \"([^\"]*)\"$")
	public void user_search_something(String veggieName) throws Throwable {
		addcart = new AddToCartPage(base);
		addcart.getItemSearch().sendKeys(veggieName);
		System.out.println("User search somethinge");
		System.out.println("Thread ID" +Thread.currentThread().getId());
		Thread.sleep(10);
	}

	@Then("^Result should display with \"([^\"]*)\"$")
	public void result_should_display_with_something(String veggieName) throws Throwable {
		String [] vegsplit = veggieName.split("-");
		for(int i=0; i<vegsplit.length-1; i++)
		{
			Assert.assertTrue(addcart.validatesearchCriteriaResult().contains(vegsplit[1]));
		}
		Thread.sleep(10);
	}

	@And("^Click on search button$")
	public void click_on_search_button() throws Throwable {
		addcart.clickOnSearchIcon().click();
	}
	
	 @Then("^Create instance of add to cart page$")
	    public void create_instance_of_add_to_cart_page() throws Throwable {
		 addcart = new AddToCartPage(base);
	    }
}
	
	
	
	 
	
	
	

