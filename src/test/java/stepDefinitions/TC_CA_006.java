package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import pages.DialogContent;
import pages.Navigation;
import utilities.DriverClass;

public class TC_CA_006 {

    Navigation nv =new Navigation();
    DialogContent dc= new DialogContent();


    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        DriverClass.getDriver().get("https://test.mersys.io/");
        DriverClass.getDriver().manage().window().maximize();

    }
    @When("Enter username and password")
    public void enter_username_and_password() {
        dc.sendKeysMethod(dc.getLoginUsername(),"turkeyts");
        dc.sendKeysMethod(dc.getLoginPassword(),"TechnoStudy123");

    }
    @When("Click on login Button")
    public void click_on_login_button() {
      dc.clickMethod(dc.getLoginButton());

    }
    @Then("User should login successfully")
    public void user_should_login_successfully() {

     dc.waitUntilVisible(dc.getDashboardText());
        Assert.assertTrue(dc.getDashboardText().isDisplayed());

    }
    @Then("Navigate to Education page")
    public void navigate_to_education_page() {
        nv.clickMethod(nv.getEducationBtn());
        nv.clickMethod(nv.getSetupUnderEducation());
        nv.clickMethod(nv.getSubjectCategoriesBtn());
    }


    @Given("Add a new")
    public void addANew() {
        dc.clickMethod(dc.getAddButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"Test0");
        dc.sendKeysMethod(dc.getFormCodeInput(),"test0");
        dc.clickMethod(dc.getSaveButton());


    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyContainsText(dc.getSuccessMessage(),"successfully");

    }

    @Given("Recreate a new")
    public void recreateANew() {
        dc.sendKeysMethod(dc.getNameSearch(),"Test0");
        dc.sendKeysMethod(dc.getCodeSearch(), "test0");
        dc.clickMethod(dc.getSearchButton());
        dc.waitUntilClickable(dc.getEditButton());
        dc.clickMethod(dc.getEditButton());
        dc.sendKeysMethod(dc.getFormNameInput(),"Test20");
        dc.sendKeysMethod(dc.getFormCodeInput(),"t20");
        dc.waitUntilClickable(dc.getSaveButton());
        dc.clickMethod(dc.getSaveButton());


    }

    @Given("Delete a name")
    public void deleteAName() {
        dc.sendKeysMethod(dc.getNameSearch(),"Test20");
        dc.sendKeysMethod(dc.getCodeSearch(), "t20");
        dc.clickMethod(dc.getNameSearch());
       // dc.wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("ms-delete-button[class='ng-star-inserted']"), 10));
        dc.clickMethod(dc.getDeleteButton());
        dc.clickMethod(dc.getConfirmDeleteButton());

    }
}
