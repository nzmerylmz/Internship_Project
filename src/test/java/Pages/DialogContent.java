package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Kullanıcı Adı']")
    private WebElement username;


    @FindBy(css = "input[placeholder='Parola']")


    @FindBy(css = "input[placeholder='Kullanıcı Adı']")
    private WebElement usernametr;
    @FindBy(css = "input[placeholder='Password']")

    @FindBy(css = "input[placeholder='Parola']")


    private WebElement password;

    @FindBy(css = "input[placeholder='Parola']")
    private WebElement passwordtr;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboardText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip, 'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip, 'BUTTON.ADD')]//button")
    private WebElement addButtonfield;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;


    @FindBy(xpath = "//ms-text-field[@formcontrolname='description']//input")
    private WebElement description;
    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input)[2]")

    @FindBy(xpath = "(//ms-text-field[contains(@placeholder,'FIELD.CODE')]//input)[1]")
    private WebElement codeInputDialog;

    @FindBy(xpath = "//ms-text-field[contains(@placeholder, 'SHORTNAME')]//input")

    private WebElement shortName;

    @FindBy(css = "[formcontrolname='code']>input")
    private WebElement codeInput;

    @FindBy(css = "button[class='mat-focus-indicator mat-tooltip-trigger mat-accent mat-button mat-raised-button mat-button-base ng-star-inserted']")
    private WebElement saveButton;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    private WebElement successMessage;

    @FindBy(xpath = "//*[contains(text(),'already exists')]")
    private WebElement alreadyExist;
    @FindBy(xpath = "//button[@aria-label='Close dialog']")
    private WebElement closeDialog;
    @FindBy(xpath = "(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[1]")
    private WebElement searchInput;

    @FindBy(xpath = "//ms-search-button//button")
    private WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    private WebElement deleteButton;

    @FindBy(xpath = "//span[contains(text(),'Delete')]")
    private WebElement deleteDialogButton;

    @FindBy(xpath = "//button[contains(text(),'Accept all cookies')]")
    private WebElement acceptCookiesButton;

    @FindBy(css = "[formcontrolname='budgetAccountIntegrationCode']>input")
    private WebElement integrationCode;


    @FindBy (css = "[formcontrolname='priority']>input")
    private WebElement priority;

    @FindBy( xpath="(//ms-edit-button//button)[1]")
    private WebElement editButton;

    @FindBy( xpath="//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    private WebElement namefields;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    private  WebElement integrationCode32;

    @FindBy(css = "[formcontrolname='priority']>input")
    private WebElement priority;

    @FindBy(xpath="(//ms-edit-button//button)[1]")

    private WebElement editButton;


    @FindBy(xpath = "//ms-text-field[contains(@placeholder,'TITLE.DESCRIPTION')]//input")
    private WebElement descriptionInput;




    @FindBy(xpath="//ms-text-field[contains(@placeholder, 'ORDER')]//input")
    private WebElement order;

    @FindBy(xpath="//span[contains(text(),'10')]")
    private WebElement combobox;

    @FindBy(xpath="//span[contains(text(),' 1000 ')]")
    private WebElement comboboxAll;

    @FindBy(xpath="(//div[contains(@class,'mat-sort-header-container')])[1]")
    private WebElement orderUpDown;

    @FindBy(xpath="((//td[contains(text(),'junior')]/following-sibling::td)[5]//button)[1]")
    private WebElement specificEditButton;

    @FindBy(xpath="((//td[contains(text(),'senior')]/following-sibling::td)[5]//button)[2]")
    private WebElement specificDeleteButton;

    @FindBy(xpath="//td[contains(text(),'Baris')]//following::div/ms-edit-button")
    private WebElement editButton2;

    @FindBy(xpath="//td[contains(text(),'Baris77')]//following::div/ms-delete-button")
    private WebElement deleteButton2;




    WebElement myElement;
    public void findAndSend(String strElement, String value){
        switch (strElement)
        {
            case "username" : myElement =username; break;
            case "password" : myElement =password; break;
            case "nameInput" : myElement =nameInput; break;
            case "codeInput" : myElement =codeInput; break;
            case "shortName" : myElement =shortName; break;
            case "searchInput" : myElement =searchInput; break;
            case "integrationCode" : myElement =integrationCode; break;
            case "priority" : myElement =priority; break;

            case "namefields" : myElement =namefields; break;
        }

            case "usernametr" : myElement =usernametr; break;
            case "passwordtr" : myElement =passwordtr; break;
            case "description" : myElement =description; break;
            case "integrationCode32" : myElement =integrationCode32; break;
            case "descriptionInput" : myElement =descriptionInput; break;

            case "codeInputDialog" : myElement =codeInputDialog; break;
            case "order" : myElement =order; break;

        }
        sendKeysFunction(myElement, value);
    }

    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "searchButton" : myElement =searchButton; break;
            case "deleteButton" : myElement =deleteButton; break;
            case "deleteDialogButton" : myElement =deleteDialogButton; break;
            case "acceptCookiesButton" : myElement =acceptCookiesButton; break;
            case "editButton" : myElement =editButton; break;
            case "addButtonfield" : myElement =addButtonfield; break;

            case "combobox" : myElement =combobox; break;
            case "comboboxAll" : myElement =comboboxAll; break;
            case "orderUpDown" : myElement =orderUpDown; break;
            case "specificEditButton" : myElement =specificEditButton; break;
            case "specificDeleteButton" : myElement =specificDeleteButton; break;

            case "editButton2" : myElement =editButton2; break;
            case "deleteButton2" : myElement =deleteButton2; break;



        }
        clickFunction(myElement);
    }

    public void findAndContainsText(String strElement, String text){
        switch (strElement)
        {
            case "dashboardText" : myElement =dashboardText; break;
            case "successMessage" : myElement =successMessage; break;
            case "alreadyExist" : myElement =alreadyExist; break;
        }
        verifyContainsText(myElement,text);
    }




    public void SearchAndDelete(String searchText){

        findAndClick("deleteButton2");

        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));
        findAndClick("deleteButton");
        findAndClick("deleteDialogButton");

    }

    public void SearchAndEdit(String searchText){
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("editButton");
        findAndSend("nameInput", searchText);
        findAndClick("saveButton");
    }









    }

    public void SearchAndEdit(String searchText, String s) {
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        waitUntilLoading();
        findAndClick("editButton");
        findAndSend("nameInput", searchText);
        findAndClick("saveButton");

    }

    public void SearchAndEdit(String searchText){
        findAndSend("searchInput", searchText);
        findAndClick("searchButton");
        findAndClick("editButton");
        findAndSend("nameInput", searchText);
        findAndClick("saveButton");

    }

    public void SearchAndEdit(String searchText){
        findAndClick("editButton2");
    }
    }

}
