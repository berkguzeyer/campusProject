package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_002 {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();
    @When("Navigate to attestations under human resources")
    public void navigateToAttestationsUnderHumanResources() {
        nv.clickMethod(nv.getHumanResources());
        nv.clickMethod(nv.getSetupUnderHumanResources());
        nv.clickMethod(nv.getAttestationUnderHumanResources());
    }

    @And("Enter name in the form")
    public void enterNameInTheForm() {
        dc.sendKeysMethod(dc.getFormNameInput(), "ABC");
    }

    @Then("First name on the list should match with the credentials")
    public void firstNameOnTheListShouldMatchWithTheCredentials() {
        dc.verifyContainsTextInList(dc.getStatesList(), "ABC");
    }

    @And("Change the name")
    public void changeTheName() {
        dc.sendKeysMethod(dc.getFormNameInput(), "xyz");
    }

    @Then("First name on the list should be changed with new credentials")
    public void firstNameOnTheListShouldBeChangedWithNewCredentials() {
        dc.verifyContainsTextInList(dc.getStatesList(), "xyz");
    }

    @And("Click on Delete button")
    public void clickOnDeleteButton() {
        dc.clickMethod(dc.getDeleteButtonOnAttestationPage());
    }

    @Then("First name of the list should not be the same")
    public void firstNameOfTheListShouldNotBeTheSame() {
        dc.verifyNotContainsTextInList(dc.getStatesList(), "xyz");
    }

}
