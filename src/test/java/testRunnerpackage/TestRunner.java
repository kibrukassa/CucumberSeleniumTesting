package testRunnerpackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Kibru\\Desktop\\Java Practice\\TestingBDD\\Features"
		,glue={"stepDefinition"},
		monochrome = true,
		plugin= {"pretty","html:target/HtmlReport",
				"json:target/JsonReport/report.json",
				"junit:target/JunitReport/report.xml"
				
		}
		)
public class TestRunner {

}
