package parallel;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Manager.WebDriverManager;
import baseUtil.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlightBookingPage;
import pages.TopDealsPage;

public class TopDealStep {
	private Base base;
	TopDealsPage toppage;

	public TopDealStep(Base base)
	{
		this.base = base;
	}

	@Given("^User is on landing page$") 
	public void user_is_on_landing_page() throws Throwable {
		System.out.println("User is on landing page"); 
		System.out.println("Thread ID" +Thread.currentThread().getId());
	}

	@When("^User click on top deals icon$")
	public void user_click_on_top_deals_icon() throws Throwable {
		toppage = new TopDealsPage(base);
		toppage.clickTopDeals().click();

	}

	@Then("^Top deal page should open$")
	public void top_deal_page_should_open() throws Throwable {
		Assert.assertTrue(toppage.getTopDealTitle().contains("GreenKart - veg and fruits kart"));
	}

	@Given("^User is top deals page$")
	public void user_is_top_deals_page() throws Throwable {
		System.out.println("Thread ID" +Thread.currentThread().getId());
		System.out.println("User is on deal page");
		toppage = new TopDealsPage(base);
		toppage.clickTopDeals().click();
	}

	@When("^User search top deal$")
	public void user_search_top_deal() throws Throwable { 
		toppage.searchDeals().click();
	}

	@Then("^searched top deal should show$")
	public void searched_top_deal_should_show() throws Throwable {
		Assert.assertTrue(toppage.validateSearchTopDeal().contains("Wheat"));

	}

}
