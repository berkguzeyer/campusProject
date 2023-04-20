package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_008 {
    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();
    @When("Navigate to Departments under School Setup")
    public void navigateToDepartmentsUnderSchoolSetup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getSchoolSetupButton());
        nv.clickMethod(nv.getDepartmentsUnderSchoolSetup());
    }

    @And("Enter name as {string} and code as {string}")
    public void enterNameAsAndCodeAs(String name, String code) {
        dc.sendKeysMethod(dc.getNameSearch(), name);
        dc.sendKeysMethod(dc.getCodeSearch(), code);
    }

}
