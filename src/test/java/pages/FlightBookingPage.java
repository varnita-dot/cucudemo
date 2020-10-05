package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseUtil.Base;

public class FlightBookingPage {
	public WebDriver driver;
	private Base base;


	public FlightBookingPage(Base base) {
		this.base = base;
	}



	By flightBookingIcon=By.xpath("//a[text()='Flight Booking']");
			
    public WebElement clickFlightBooking()
    {
		return base.getDriver().findElement(flightBookingIcon);
    }
    
    public String getFlightBookingTitle()
    {
    	return base.getDriver().getTitle();
    }
}
