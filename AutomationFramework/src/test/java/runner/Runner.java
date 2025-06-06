package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/test/java/featureFiles",
		glue ="stepDef",
		monochrome=true,
		plugin ={"pretty","html:target/cucumberReports/reports.html"})
public class Runner extends AbstractTestNGCucumberTests{


}
