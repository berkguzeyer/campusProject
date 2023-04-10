package pages;

import utilities.DriverClass;
import utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends MyMethods { // always extend from "Pages" so you won't have to create to many objects for MyMethods class

    public Navigation() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    private WebElement setupBtn;

    @FindBy(xpath = "//span[text()='Parameters']")
    private WebElement parameterBtn;

    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    private WebElement countriesBtn;

    @FindBy(xpath = "//a[@href='/citizenships/list']")
    private WebElement citizenshipButton;

    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement feesButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsButton;

    @FindBy(xpath = "(//span[text()='Setup'])[2]")
    private WebElement entranceExamsSetupButton;

    @FindBy(xpath = "(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsInnerButton;

    @FindBy(xpath = "//span[text()='States']")
    private WebElement statesBtn;

    @FindBy(xpath = "//span[text()='School Setup']")
    private WebElement schoolSetupButton;

    @FindBy(xpath = "//span[text()='Discounts']")
    private  WebElement discountButton;

    @FindBy (xpath = "//*[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Locations'])[1]")
    private WebElement locationUnderSchoolSetup;

    @FindBy (xpath = "(//*[text()='Positions'])[2]")
    private WebElement positionsUnderHumanResources;

    @FindBy(xpath = "//span[text()='Departments']")
    private WebElement departmentsUnderSchoolSetup;

    @FindBy (xpath = "//*[text()='Position Categories']")
    private WebElement positionsCategoriesUnderHumanResources;

    @FindBy(xpath = "//span[text()='Bank Accounts']")
    private WebElement bankAccountsUnderParameters;

    @FindBy(xpath = "//span[text()='Grade Levels']")
    private WebElement gradeLevelBtn;

    @FindBy (xpath = "//*[text()='Education']")
    private WebElement educationBtn;
    @FindBy (xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupUnderHumanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[5]")
    private WebElement setupUnderEducation;

    @FindBy (xpath = "//span[text()='Fields']")
    private WebElement fieldsUnderParameters;

    @FindBy(xpath = "//span[text()='Subject Categories']")
    private WebElement subjectCategoriesBtn;

    @FindBy (xpath = "//span[text()='Attestations']")
    private WebElement attestationUnderHumanResources;



    public WebElement getSchoolSetupButton() {
        return schoolSetupButton;
    }

    public WebElement getDiscountButton() {
        return discountButton;
    }

    public WebElement getHumanResources() {
        return humanResources;
    }

    public WebElement getLocationUnderSchoolSetup() {
        return locationUnderSchoolSetup;
    }

    public WebElement getPositionsUnderHumanResources() {
        return positionsUnderHumanResources;
    }

    public WebElement getDepartmentsUnderSchoolSetup() {
        return departmentsUnderSchoolSetup;
    }

    public WebElement getPositionsCategoriesUnderHumanResources() {
        return positionsCategoriesUnderHumanResources;
    }

    public WebElement getBankAccountsUnderParameters() {
        return bankAccountsUnderParameters;
    }

    public WebElement getGradeLevelBtn() {
        return gradeLevelBtn;
    }

    public WebElement getEducationBtn() {
        return educationBtn;
    }

    public WebElement getSetupUnderHumanResources() {
        return setupUnderHumanResources;
    }

    public WebElement getSetupUnderEducation() {
        return setupUnderEducation;
    }

    public WebElement getFieldsUnderParameters() {
        return fieldsUnderParameters;
    }

    public WebElement getSubjectCategoriesBtn() {
        return subjectCategoriesBtn;
    }

    public WebElement getAttestationUnderHumanResources() {
        return attestationUnderHumanResources;
    }

    public WebElement getStatesBtn() {
        return statesBtn;
    }

    public WebElement getEntranceExamsButton() {
        return entranceExamsButton;
    }

    public WebElement getEntranceExamsSetupButton() {
        return entranceExamsSetupButton;
    }

    public WebElement getEntranceExamsInnerButton() {
        return entranceExamsInnerButton;
    }

    public WebElement getFeesButton() {
        return feesButton;
    }

    public WebElement getCitizenshipButton() {
        return citizenshipButton;
    }

    public WebElement getSetupBtn() {
        return setupBtn;
    }

    public WebElement getParameterBtn() {
        return parameterBtn;
    }

    public WebElement getCountriesBtn() {
        return countriesBtn;
    }
}
