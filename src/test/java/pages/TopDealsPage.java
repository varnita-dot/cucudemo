package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseUtil.Base;

public class TopDealsPage {
	
	private Base base;
	
	By topDeals=By.xpath("//a[text()='Top Deals']");
	//By searchTopDeals=By.xpath("//div[@class='products']/div/div/div/div/div[1]/div[2]/input");
	By searchTopDeals=By.xpath("//div[@class='col-xs-8']/ul/li[4]");
	By validate=By.xpath("//table[@class='table table-bordered']/tbody/tr[1]/td[1]");
	
	
	 public TopDealsPage(Base base) {
		 this.base = base;
	}
	
	public WebElement clickTopDeals()
	{
		return base.getDriver().findElement(topDeals);
	
	}
	public WebElement searchDeals()
	{
		return base.getDriver().findElement(searchTopDeals);
	}
    public String getTopDealTitle()
    {
    	return base.getDriver().getTitle();
    }
    public String validateSearchTopDeal()
    {
    	return base.getDriver().findElement(validate).getText();
    }
}
