package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/java/runners/TC_CA_012.java"},
        glue = "stepDefinitions"
)
public class TC_CA_012 extends AbstractTestNGCucumberTests {
}
