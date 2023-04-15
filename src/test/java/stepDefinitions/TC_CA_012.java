package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_012 {
    Navigation nv =new Navigation();
    DialogContent dc=new DialogContent();
    @And("Navigate to nationalities page")
    public void navigateToNationalitiesPage() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getNationalitiesBtn());
    }

    @Given("Add a new name")
    public void addANewName() {

        dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"Cat");
        dc.clickMethod(dc.getSaveButton());
    }

    @Given("Recreate a new edit name")
    public void recreateANewEditName() {
        dc.sendKeysMethod(dc.getNameSearch(),"Cat");
        dc.clickMethod(dc.getSearchButton());
        dc.clickMethod(dc.getEditButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"My cat");
        dc.clickMethod(dc.getSaveButton());
    }

    @Given("Delete existing name")
    public void deleteExistingName() {
        dc.sendKeysMethod(dc.getNameSearch(),"My cat");
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());
    }
}
