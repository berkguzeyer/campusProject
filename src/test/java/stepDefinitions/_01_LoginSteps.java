package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DialogContent;
import utilities.DriverClass;

public class _01_LoginSteps {
    DialogContent dialogContent = new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();
        DriverClass.getDriver().manage().deleteAllCookies();
    }

    @When("Enter username and password")
    public void enter_username_and_password() {
        dialogContent.waitUntilVisible(dialogContent.getLoginUsername());
        dialogContent.sendKeysMethod(dialogContent.getLoginUsername(), "turkeyts");
        dialogContent.sendKeysMethod(dialogContent.getLoginPassword(), "TechnoStudy123");
    }

    @When("Click on Login Button")
    public void click_on_login_button() {
        dialogContent.clickMethod(dialogContent.getLoginButton());
//        dialogContent.getLoginButton().click();
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dialogContent.waitUntilVisible(dialogContent.getDashboardText());
        Assert.assertTrue(dialogContent.getDashboardText().isDisplayed());
    }

}
