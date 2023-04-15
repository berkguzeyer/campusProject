package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.DialogContent;
import pages.Navigation;
import utilities.DriverClass;

import java.util.List;

public class TC_CA_007 {
    DialogContent dc = new DialogContent();
    Navigation nav = new Navigation();
    List<String> formElements;

    @Given("Click on setup button")
    public void clickOnSetupButton() {
        nav.clickMethod(nav.getSetupBtn());
    }

    @When("Click on school Setup button")
    public void clickOnSchoolSetupButton() {
        nav.clickMethod(nav.getSchoolSetupButton());
    }

    @And("Click on locations button")
    public void clickOnLocationsButton() {
        nav.clickMethod(nav.getLocationUnderSchoolSetup());
    }


    @And("Enter Name and short name")
    public void enterNameAndShortName(DataTable dataTable) {
        formElements = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getFormNameForSearch(), formElements.get(0));
        dc.clickMethod(dc.getShortNameSearch());
        dc.sendKeysMethod(dc.getShortNameSearch(), formElements.get(1));

    }

    @And("Select classroom")
    public void selectClassroom() {
        Actions actions = new Actions(DriverClass.getDriver());
        actions.sendKeys(Keys.TAB).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB).perform();

    }

    @And("Enter a number for capacity")
    public void enterANumberForCapacity(DataTable dataTable) {
        formElements = dataTable.asList(String.class);
        dc.sendKeysMethod(dc.getCapacityInput(), formElements.get(0));
        Actions actions = new Actions(DriverClass.getDriver());
        actions.sendKeys(Keys.TAB).perform();



    }

    @And("Change the name with new location")
    public void changeTheNameWithNewLocation() {
        dc.getFormNameForSearch().clear();
        dc.sendKeysMethod(dc.getFormNameForSearch(),"Georgia");
        dc.clickMethod(dc.getShortNameSearch());
        dc.sendKeysMethod(dc.getShortNameSearch(),"Atlanta");


    }
}
