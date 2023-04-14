package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilities.DriverClass;


@CucumberOptions(
        features = {"src/test/java/featureFiles/TC_CA_003.feature"},
        glue = "stepDefinitions"
)
public class TC_CA_003 extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters(value = "browser")
    public void beforeClass(String browserName) {
        DriverClass.setThreadDriverName(browserName);
    }
}
