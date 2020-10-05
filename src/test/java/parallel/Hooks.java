package parallel;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import baseUtil.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {

	private Base base;
	public Hooks(Base base)
	{
		this.base = base;		
	}

	@Before public void setUp(Scenario scenario) {
		base.getUrl();
		scenario.getStatus();
		scenario.getName();
		System.out.println("Sceanrio has started to execute");
		System.out.println("user is in before hook now");
	}

	@After
	public void tearDown(Scenario scenario) {
		try {
			if (scenario.isFailed()) {
				System.out.println("user is in after hook now");
				TakesScreenshot screenshot = (TakesScreenshot)base.getDriver();
				byte[] src = screenshot.getScreenshotAs(OutputType.BYTES);
				scenario.attach(src, "image/png", "screenahot");
			}
		} finally {
			base.closeDriver();
	}
}
}
		
		
		
		
		
		







