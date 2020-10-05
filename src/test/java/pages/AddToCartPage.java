package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import baseUtil.Base;

public class AddToCartPage  {
	public WebDriver driver;
	private Base base;

	public AddToCartPage(Base base) {
		this.base = base;
	}


	By searchBox = By.xpath("//input[@type='search']");
	By searchicon =By.xpath("//button[@type='submit']");
	By searchResult=By.cssSelector("h4.product-name");
	By addToCartButton=By.cssSelector("//button[@type='ADD TO CART']");

	public WebElement getItemSearch()
	{
		return base.getDriver().findElement(By.xpath("//input[@type='search']"));

	}

	public WebElement clickOnSearchIcon()
	{
		return base.getDriver().findElement(searchicon);

	}

	public String validatesearchCriteriaResult()
	{

		return base.getDriver().findElement(searchResult).getText();

	}
	
	/*
	 * public WebElement clickAddToCartButton() { return
	 * driver.findElement(addToCartButton); }
	 */
}
