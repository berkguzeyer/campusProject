package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.poi.ss.formula.functions.Na;
import org.openqa.selenium.support.FindBy;
import pages.DialogContent;
import pages.Navigation;

import java.util.List;

public class TC_CA_001 {
    DialogContent dc = new DialogContent();
    Navigation nav = new Navigation();

    @Given("Navigate to position categories from human resources")
    public void navigateToPositionCategoriesFromHumanResources() {
        nav.clickMethod(nav.getHumanResources());
        nav.clickMethod(nav.getSetupUnderHumanResources());
        nav.clickMethod(nav.getPositionsCategoriesUnderHumanResources());

    }

    @And("Click on Add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @And("Enter Name to New Position Category field")
    public void enterNameToNewPositionCategoryField(DataTable dataTable) {
        List<String> element = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getFormNameInput(),element.get(0));
    }

    @Then("Name should be displayed after adding")
    public void nameShouldBeDisplayedAfterAdding() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        dc.verifyContainsText(dc.getCellInputField(), "lucky");
    }
}