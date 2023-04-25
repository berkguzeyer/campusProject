package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import pages.DialogContent;
import pages.Navigation;

import java.security.Key;

public class TC_CA_010 {
    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @When("Navigate to grade levels under parameters setup")
    public void navigateToGradeLevelsUnderParametersSetup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getGradeLevelBtn());
    }

    @And("Enter name as {string}, short name as {string} and order as {string} and select next grade")
    public void enterNameAsCodeAsAndOrderAsAndSelectNextGrade(String name, String shortName, String order) {
        dc.sendKeysMethod(dc.getGradeLevelAddFormNameInput(), name + Keys.TAB + shortName + Keys.TAB + order + Keys.TAB + Keys.ENTER + Keys.DOWN + Keys.ENTER);
    }

    @And("Click on grade level edit button")
    public void clickOnGradeLevelEditButton() {
        dc.clickMethod(dc.getGradeLevelEditButton());
    }

    @And("Click on grade level delete button")
    public void clickOnGradeLevelDeleteButton() {
        dc.clickMethod(dc.getGradeLevelDeleteButton());
    }

    @When("Click on delete cancel button")
    public void clickOnDeleteCancelButton() {
        dc.clickMethod(dc.getGradeLevelDeleteCancelButton());
    }
}
