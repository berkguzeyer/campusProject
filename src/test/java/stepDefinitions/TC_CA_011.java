package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.DialogContent;
import pages.Navigation;
import utilities.DriverClass;

import java.time.Duration;
import java.util.List;

public class TC_CA_011 {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @When("Navigate to discounts under parameters setup")
    public void navigateToDiscountsUnderParametersSetup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getDiscountButton());
    }

    List<String> formElements;

    @And("Fill new discount form")
    public void fillNewDiscountForm(DataTable dataTable) {
        formElements = dataTable.asList(String.class);

        dc.sendKeysMethod(dc.getDescriptionFormInput(), formElements.get(0));
        dc.sendKeysMethod(dc.getNewDiscountIntegrationCodeInput(), formElements.get(1));
        dc.sendKeysMethod(dc.getNewDiscountPriorityInput(), formElements.get(2));
        Actions actions = new Actions(DriverClass.getDriver());
        Action action = actions.keyDown(Keys.TAB).keyUp(Keys.TAB).build();
        action.perform();

    }

    @When("Change the description")
    public void changeTheDescription() {
        dc.sendKeysMethod(dc.getDescriptionFormInput(), "152");

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        nv.verifyContainsText(dc.getSuccessMessage(), "successfully");
    }
}
