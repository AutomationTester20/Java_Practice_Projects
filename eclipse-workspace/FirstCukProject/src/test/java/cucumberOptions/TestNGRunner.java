package cucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features ="src/test/java",glue="stepDefinations", tags="@RegTest  ")
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
