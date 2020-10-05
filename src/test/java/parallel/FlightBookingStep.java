package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseUtil.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FlightBookingPage;
import pages.TopDealsPage;

public class FlightBookingStep{
	FlightBookingPage book;
	private Base base;


	public FlightBookingStep(Base base)
	{
		this.base = base;
	}

	/*
	 * @Given("^User is on landing page$") public void user_is_on_landing_page()
	 * throws Throwable { System.out.println("User is on landing page"); }
	 */

	@When("^User click on flight booking icon$")
	public void user_click_on_flight_booking_icon() throws Throwable {
		System.out.println("Thread ID" +Thread.currentThread().getId());
		book = new FlightBookingPage(base);
		book.clickFlightBooking().click();
	}

	@Then("^flight booking page should open$")
	public void flight_booking_page_should_open() throws Throwable {
		book.getFlightBookingTitle();
	}


}
