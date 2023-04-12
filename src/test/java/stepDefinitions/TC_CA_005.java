package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DialogContent;
import pages.Navigation;

public class TC_CA_005 {

    /** Coded by Berk G.
     */

    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();

    @When("Navigate to positions under human resources")
    public void navigateToPositionsUnderHumanResources() {
        nv.clickMethod(nv.getHumanResources());
        nv.clickMethod(nv.getSetupUnderHumanResources());
        nv.clickMethod(nv.getPositionsUnderHumanResources());
    }

    @And("Click on add button")
    public void clickOnAddButton() {
        dc.clickMethod(dc.getAddButton());
    }

    @And("Fill the form")
    public void fillTheForm() {
        dc.sendKeysMethod(dc.getFormNameInput(), "Test456637891");
        dc.sendKeysMethod(dc.getShortNameInput(), "Test16293821");
    }

    @When("Click on save button")
    public void clickOnSaveButton() {
        dc.clickMethod(dc.getSaveButton());
    }


    @Then("First position on the list should match with the credentials")
    public void firstPositionOnTheListShouldMatchWithTheCredentials() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(dc.getStatesList().get(0).getText(), "Test456637891");
    }

    @And("Click on edit button")
    public void clickOnEditButton() {
        dc.clickMethod(dc.getEditButton());

    }

    @When("Change the credentials")
    public void changeTheCredentials() {
        dc.sendKeysMethod(dc.getFormNameInput(), "a1");
        dc.sendKeysMethod(dc.getShortNameInput(), "b2");
    }

    @Then("First position on the list should be changed with new credentials")
    public void firstPositionOnTheListShouldBeChangedWithNewCredentials() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertEquals(dc.getStatesList().get(0).getText(), "a1");
    }

    @And("Click on delete button")
    public void clickOnDeleteButton() {
        dc.clickMethod(dc.getDeleteButton());
    }

    @And("Click on delete confirm button")
    public void clickOnDeleteConfirmButton() {
        dc.clickMethod(dc.getConfirmDeleteButton());
    }

    @Then("First position on the list should be changed")
    public void firstPositionOnTheListShouldBeChanged() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Assert.assertNotEquals(dc.getStatesList().get(0).getText(), "a1");
    }
}
