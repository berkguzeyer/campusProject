package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_004 {

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @When("Navigate to fields under parameters setup")
    public void navigate_to_fields_under_parameters_setup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getFieldsUnderParameters());
    }

    @And("Enter name {string} and code {string}")
    public void enterNameAndCode(String name, String code) {
        dc.sendKeysMethod(dc.getFormNameInput(), name);
        dc.sendKeysMethod(dc.getFormCodeInput(), code);
    }

    @And("Enter the code as {string} on the search box")
    public void enterTheCodeAsOnTheSearchBox(String code) {
        dc.sendKeysMethod(dc.getCodeSearch(), code);
    }

    @And("Click on field edit button")
    public void clickOnFieldEditButton() {
        dc.clickMethod(dc.getFieldsEditButton());
    }

    @And("Click on field delete button")
    public void clickOnFieldDeleteButton() {
        dc.clickMethod(dc.getFieldsDeleteButton());
    }
}
