package stepDefinitions;

import io.cucumber.java.en.And;
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
        dc.sendKeysMethod(dc.getFormNameInput(), "Emily");
    }


    @When("Enter the name as {string} on the search box")
    public void enterTheNameAsOnTheSearchBox(String name) {
        dc.sendKeysMethod(dc.getFormNameForSearch(), name);
    }

    @And("Change the name")
    public void changeTheName() {
        dc.sendKeysMethod(dc.getFormNameInput(), "Mary");
    }


    @And("Click on Delete button")
    public void clickOnDeleteButton() {
        dc.clickMethod(dc.getDeleteButtonOnAttestationPage());
    }


}
