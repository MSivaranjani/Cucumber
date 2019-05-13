package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@CucumberOptions(features="src/test/java/feature",glue={"stepDefinitions"},tags="@first",monochrome=true,format={"html:target/cucumber", "json:target/cucumber.json",
				"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"})

public class runner extends AbstractTestNGCucumberTests{

	public static void main(String[] args) {
			

	}

}
