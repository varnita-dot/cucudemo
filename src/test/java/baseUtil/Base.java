package baseUtil;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	private WebDriver driver;

	public Base() {
		System.setProperty("webdriver.chrome.driver","G:\\varnitacucuproject\\chromedriver.exe");
		driver = new ChromeDriver();
	  }
	
	
	public void getUrl()
	{
 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	
	public void closeDriver() {
		driver.close();
	}


	public WebDriver getDriver() {
		return driver;
	}


	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
}
