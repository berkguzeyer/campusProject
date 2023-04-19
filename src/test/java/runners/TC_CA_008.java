package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/featureFiles/TC_CA_008.feature"},
        glue = "stepDefinitions"
)
public class TC_CA_008  extends AbstractTestNGCucumberTests {
}
