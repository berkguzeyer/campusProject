package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_009 {
    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();
    @When("Navigate to bank accounts under parameters setup")
    public void navigateToBankAccountsUnderParametersSetup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getBankAccountsUnderParameters());
    }

    @And("Add name as {string}, IBAN {string}, currency and integration code {string}")
    public void addNameAsIBANCurrencyAndIntegrationCode(String name, String IBAN, String integrationCode) {
        dc.sendKeysMethod(dc.getFormNameInput(),name + Keys.TAB + IBAN + Keys.TAB + Keys.ENTER);
        WebElement a = dc.getStageDropDownOptions().get(2);
        dc.clickMethod(a);
        dc.sendKeysMethod(dc.getIntegrationCodeInput(),integrationCode);
    }
    @And("Add the same name as {string}, IBAN {string}, currency and integration code {string}")
    public void addTheSameNameAsIBANCurrencyAndIntegrationCode(String name, String IBAN, String integrationCode) {
        dc.sendKeysMethod(dc.getFormNameInput(),name + Keys.TAB + IBAN + Keys.TAB + Keys.ENTER);
        WebElement a = dc.getStageDropDownOptions().get(2);
        dc.clickMethod(a);
        dc.sendKeysMethod(dc.getIntegrationCodeInput(),integrationCode);
    }
    @And("Change the name as {string}, IBAN {string}, currency and integration code {string} on edit bank account")
    public void changeTheNameAsIBANCurrencyAndIntegrationCodeOnEditBankAccount(String name, String IBAN, String integrationCode) {
        dc.sendKeysMethod(dc.getFormNameInput(),name + Keys.TAB + IBAN + Keys.TAB + Keys.ENTER);
        WebElement a = dc.getStageDropDownOptions().get(1);
        dc.clickMethod(a);
        dc.sendKeysMethod(dc.getIntegrationCodeInput(),integrationCode);
    }

    @When("Enter the {string} on the name text box to search")
    public void enterTheOnTheNameTextBoxToSearch(String name) {
        dc.sendKeysMethod(dc.getNameSearch(),name);
    }

    @When("Enter the {string} on the name text box to search for delete")
    public void enterTheOnTheNameTextBoxToSearchForDelete(String name) {
        dc.sendKeysMethod(dc.getNameSearch(),name);
    }


    @Then("Unsuccessful message as {string} should be displayed")
    public void unsuccessfulMessageAsShouldBeDisplayed(String message) {
        dc.verifyContainsText(dc.getUnsuccessfulMessage(), message);
    }
}
