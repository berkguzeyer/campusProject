package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.DialogContent;
import pages.Navigation;
import utilities.DriverClass;


public class TC_CA_003 {
    Navigation nv = new Navigation();
    DialogContent dc = new DialogContent();
    @When("Navigate to document types under parameters setup")
    public void navigateToDocumentTypesUnderParametersSetup() {
        nv.clickMethod(nv.getSetupBtn());
        nv.clickMethod(nv.getParameterBtn());
        nv.clickMethod(nv.getDocumentTypesButton());
    }

    @And("Add name and stage")
    public void addNameAndStage() {
        dc.sendKeysMethod(dc.getFormNameInput(), "Zack" + Keys.TAB);
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOverStage = actions.moveToElement(dc.getStageDropdownUnderDocumentTypes()).build();
        hoverOverStage.perform();
        Action click = actions.click().build();
        click.perform();
        click = actions.click().build();
        click.perform();
        actions.moveToElement(dc.getSaveButton()).click().build().perform();


    }

    @And("Change the name and stage on edit document page")
    public void changeTheNameAndStageOnEditDocumentPage() {
        dc.sendKeysMethod(dc.getFormNameInput(),"zxgfz" + Keys.TAB );
        Actions actions = new Actions(DriverClass.getDriver());
        Action hoverOverStage = actions.moveToElement(dc.getStageForEditDropDrownUnderDocumentTypes()).build();
        hoverOverStage.perform();
        Action click = actions.click().build();
        click.perform();
        WebElement a = dc.getStageDropDownOptions().get(5);
        dc.clickMethod(a);
        actions.moveToElement(dc.getSaveButton()).click().build().perform();

    }


    @When("Enter the name on the name text box to search")
    public void enterTheNameOnTheNameTextBoxToSearch() {
        dc.sendKeysMethod(dc.getFormNameForSearch(),"Zack");
    }

    @And("Click on search button")
    public void clickOnSearchButton() {
        dc.clickMethod(dc.getSearchButton());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("Enter the name on the name text box to search for delete")
    public void enterTheNameOnTheNameTextBoxToSearchForDelete() {
        dc.sendKeysMethod(dc.getFormNameForSearch(),"zxgfz");
    }
}

