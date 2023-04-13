package pages;

import utilities.DriverClass;
import utilities.MyMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends MyMethods {

    public DialogContent() {
        PageFactory.initElements(DriverClass.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Username']")
    private WebElement loginUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    private WebElement loginPassword;

    @FindBy(xpath = "//button[@aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']//span[contains(text(),'Dashboard')]")
    private WebElement dashboardText;

    @FindBy(css = "svg[class='svg-inline--fa fa-plus']")
    private WebElement addButton;
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
    private WebElement formNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[2]")
    private WebElement formCodeInput;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveButton;

    @FindBy(xpath = "//div[@id='cconsent-bar']//button[@class='consent-give']")
    private WebElement acceptCookies;

    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "(//input[@data-placeholder='Name'])[1]")
    private WebElement nameSearch;

    @FindBy(xpath = "(//input[@data-placeholder='Code'])[1]")
    private WebElement codeSearch;

    @FindBy(xpath = "//span[text()='Search']")
    private WebElement searchButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement confirmDeleteButton;

    @FindBy(css = "ms-delete-button[class='ng-star-inserted']")
    private List<WebElement> deleteCountryButtonList;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[2]")
    private WebElement shortNameInput;

    @FindBy(xpath = "(//input[@data-placeholder='Short Name'])[1]")
    private WebElement shortNameSearch;

    @FindBy(xpath = "//input[@data-placeholder='Integration Code']")
    private WebElement integrationCodeInput;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[2]")
    private WebElement priorityInput;

    @FindBy(xpath = "//input[@data-placeholder='Priority']")
    private WebElement newDiscountPriorityInput;

    @FindBy(xpath = "(//input[@data-placeholder='Priority'])[1]")
    private WebElement prioritySearchInput;

    @FindBy(xpath = "//input[@data-placeholder='Name']")
    private WebElement entranceExamsCreateNameInput;

    @FindBy(xpath = "//mat-select[@formcontrolname='academicPeriod']")
    private WebElement academicPeriodSelect;

    @FindBy(xpath = "//span[text()=' 2022-2023 Academic Period ']")
    private WebElement academicPeriodOption;

    @FindBy(xpath = "//mat-select[@formcontrolname='id']")
    private WebElement gradeLevelSelect;

    @FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
    private WebElement gradeLevelOption;

    @FindBy(xpath = "(//div[@role='tab'])[3]")
    private WebElement description;

    @FindBy(css = "body[id='tinymce']>p")
    private WebElement descriptionAndNoteInput;

    @FindBy(xpath = "(//div[@role='tab'])[4]")
    private WebElement note;

    @FindBy(xpath = "(//span[text()='Stage'])[4]")
    private WebElement stageDropdownUnderDocumentTypes;

    @FindBy(xpath = "(//span[text()='Stage'])[1]")
    private WebElement stageForSearchDropDrownUnderDocumentTypes;

    @FindBy(css = "iframe[class='tox-edit-area__iframe']")
    private WebElement iFrame;

    @FindBy(xpath = "//tbody[@role='rowgroup']/tr/td[2]")
    private List<WebElement> statesList;

    @FindBy(xpath = "//mat-slide-toggle[@class='mat-slide-toggle mat-accent mat-checked ng-star-inserted']")
    private List<WebElement> humanResourcesActivatorButtons;

    @FindBy(xpath = "//input[@id='ms-text-field-1']")
    private WebElement integrationCodeInputBtn;

    @FindBy(xpath = "//ms-edit-button[@table='true']")
    private WebElement editButton;

    @FindBy(xpath = "//div[@id='mat-select-value-5']")
    private WebElement fieldDropDown;

    @FindBy(xpath = "(//input[@data-placeholder='Description'])[2]")
    private WebElement descriptionFormInput;

    @FindBy(xpath = "(//input[@data-placeholder='Integration Code'])[2]")
    private WebElement newDiscountIntegrationCodeInput;

    @FindBy(xpath = "//ms-delete-button[@table='true']")
    private WebElement deleteButtonOnAttestationPage;

    @FindBy(xpath = "(//*[@role='cell'])[2]")
    private WebElement cellInputField;

    @FindBy(xpath = "//span[@class='mat-option-text']")
    private List<WebElement> stageDropDownOptions;

    @FindBy(xpath = "//span[text()='IBAN']")
    private WebElement iban;

    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    private WebElement currency;

    public List<WebElement> getStageDropDownOptions() {
        return stageDropDownOptions;
    }

    public WebElement getIban() {
        return iban;
    }

    public WebElement getCurrency() {
        return currency;
    }

    public WebElement getCellInputField() {
        return cellInputField;
    }

    public WebElement getNewDiscountIntegrationCodeInput() {
        return newDiscountIntegrationCodeInput;
    }

    public WebElement getNewDiscountPriorityInput() {
        return newDiscountPriorityInput;
    }

    public WebElement getDescriptionFormInput() {
        return descriptionFormInput;
    }

    public WebElement getFieldDropDown() {
        return fieldDropDown;
    }

    public WebElement getStageForSearchDropDrownUnderDocumentTypes() {
        return stageForSearchDropDrownUnderDocumentTypes;
    }

    public WebElement getStageDropdownUnderDocumentTypes() {
        return stageDropdownUnderDocumentTypes;
    }

    public WebElement getEditButton() {
        return editButton;
    }

    public List<WebElement> getHumanResourcesActivatorButtons() {
        return humanResourcesActivatorButtons;
    }

    public WebElement getIntegrationCodeInputBtn() {
        return integrationCodeInputBtn;
    }

    public List<WebElement> getStatesList() {
        return statesList;
    }

    public WebElement getEntranceExamsCreateNameInput() {
        return entranceExamsCreateNameInput;
    }

    public WebElement getAcademicPeriodSelect() {
        return academicPeriodSelect;
    }

    public WebElement getAcademicPeriodOption() {
        return academicPeriodOption;
    }

    public WebElement getGradeLevelSelect() {
        return gradeLevelSelect;
    }

    public WebElement getGradeLevelOption() {
        return gradeLevelOption;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getDescriptionAndNoteInput() {
        return descriptionAndNoteInput;
    }

    public WebElement getNote() {
        return note;
    }

    public WebElement getiFrame() {
        return iFrame;
    }

    public WebElement getPrioritySearchInput() {
        return prioritySearchInput;
    }

    public WebElement getIntegrationCodeInput() {
        return integrationCodeInput;
    }

    public WebElement getPriorityInput() {
        return priorityInput;
    }

    public WebElement getShortNameSearch() {
        return shortNameSearch;
    }

    public WebElement getShortNameInput() {
        return shortNameInput;
    }

    public WebElement getNameSearch() {
        return nameSearch;
    }

    public WebElement getCodeSearch() {
        return codeSearch;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public List<WebElement> getDeleteCountryButtonList() {
        return deleteCountryButtonList;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getConfirmDeleteButton() {
        return confirmDeleteButton;
    }

    public WebElement getFormNameInput() {
        return formNameInput;
    }

    public WebElement getFormCodeInput() {
        return formCodeInput;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getLoginUsername() {
        return loginUsername;
    }

    public WebElement getLoginPassword() {
        return loginPassword;
    }

    public WebElement getDashboardText() {
        return dashboardText;
    }

    public WebElement getSuccessMessage() {
        return successMessage;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public WebElement getAcceptCookies() {
        return acceptCookies;
    }

    public WebElement getDeleteButtonOnAttestationPage() {
        return deleteButtonOnAttestationPage;
    }
}
