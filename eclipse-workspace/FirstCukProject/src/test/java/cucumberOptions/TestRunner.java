package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/features",
glue="stepDefinations",stepNotifications=true, tags="@SmokeTest", monochrome=true, plugin= {"pretty", "html:target/cucumber.html",
		"json:target/cukjason.json", "junit:target/cukjunit.xml"})

public class TestRunner {

}
