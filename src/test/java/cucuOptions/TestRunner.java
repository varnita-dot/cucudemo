package cucuOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

/*
 * @ExtendedCucumberOptions( jsonReport =
 * "target/cucumber-reports/CucumberTestReport.json", retryCount = 3,
 * detailedReport = true, detailedAggregatedReport = true, overviewReport =
 * true, coverageReport = true, jsonUsageReport =
 * "target/cucumber-reports/cucumber-usage.json", usageReport = false, toPDF =
 * true, outputFolder = "target/cucumber-reports/extended-report")
 */

@CucumberOptions(
		 features = "src/test/resources/feature",
		 glue={"parallel"},
		 plugin = { "pretty", "html:target/cucumber-reports/cucumber-html-report",
		            "json:target/cucumber-reports/CucumberTestReport.json",
		            "rerun:target/cucumber-reports/rerun.txt",
		            "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		 monochrome=true
	             		 	
		 )



public class TestRunner {
	//excludeCoverageTags = {"@flaky" }, 
	//includeCoverageTags = {"@passed" },
	//coverageReport = true, 
	// tags= "@topDeal"
	
	
	/*
	 * @RunWith(ExtendedCucumber.class)
	 * 
	 * @ExtendedCucumberOptions(jsonReport = "target/cucumber.json", retryCount = 3,
	 * detailedReport = true, detailedAggregatedReport = true, overviewReport =
	 * true, jsonUsageReport ="target/cucumber-usage.json", usageReport = true,
	 * toPDF = true, outputFolder = "target")
	 */
}
