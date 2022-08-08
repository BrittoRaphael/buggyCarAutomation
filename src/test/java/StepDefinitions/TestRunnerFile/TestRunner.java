package StepDefinitions.TestRunnerFile;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"}
,monochrome = true
,plugin = {"pretty","html:target/HTMLReports/htmlreport.html"
		,"json:target/JSONReports/jsonreport.json"
		,"junit:target/JUnitReports/Junitreport.xml"
		}
//,tags="@profile"
		)
public class TestRunner {

}
