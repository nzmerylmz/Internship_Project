package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class DialogContent extends Parent{

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "input[placeholder='Kullanıcı Adı']")
    private WebElement username;

    @FindBy(css = "input[placeholder='Parola']")
    private WebElement password;

    @FindBy(css = "button[aria-label='LOGIN']")
    private WebElement loginButton;

    @FindBy(xpath="(//span[contains(text(),'Dashboard')])[2]")
    private WebElement dashboardText;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip, 'TITLE.ADD')]//button")
    private WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    private WebElement nameInput;

    @FindBy(xpath = "(//ms-text-field[@placeholder='GENERAL.FIELD.SHORTNAME']//input)[2]")
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

    @FindBy(css = "[formcontrolname='priority']>input")
    private WebElement priority;
   //melike------------------------------------------
   @FindBy(xpath = "(//ms-edit-button[@class='ng-star-inserted']//button)[1]")
   private WebElement editButton;

    @FindBy(xpath = "//ms-masked-text-field[@formcontrolname='iban']//input")
    private WebElement iban;

    //currency

    @FindBy(xpath = "//ms-text-field[@formcontrolname='integrationCode']//input")
    private WebElement integrationCode2; //bankAccount kısmı









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
            case "iban" : myElement =iban; break;
            case "integrationCode2" : myElement =integrationCode2; break;
        }
        sendKeysFunction(myElement, value);
    }

    public void findAndSendWithoutScroll(String strElement, String value){
        switch (strElement)
        {
            case "searchInput" : myElement =searchInput; break;
        }
        sendKeysFunctionWithoutScroll(myElement, value);
    }




    public void findAndClick(String strElement){
        switch (strElement)
        {
            case "loginButton" : myElement =loginButton; break;
            case "addButton" : myElement =addButton; break;
            case "saveButton" : myElement =saveButton; break;
            case "closeDialog" : myElement =closeDialog; break;
            case "deleteDialogButton" : myElement =deleteDialogButton; break;
            case "acceptCookiesButton" : myElement =acceptCookiesButton; break;


        }

        clickFunction(myElement);
    }

    public void findAndClickWithoutScroll(String strElement){
        switch (strElement)
        {
            case "searchButton" : myElement =searchButton; break;
            case "editButton" : myElement = editButton; break;
            case "deleteButton" : myElement = deleteButton; break;
        }

        clickFunctionWithoutScroll(myElement);
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
    public void SearchAndClear(String searchText) throws AWTException {
        findAndSendWithoutScroll("searchInput", searchText);
        findAndClickWithoutScroll("searchButton");

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));
        findAndClickWithoutScroll("editButton");

    }
   public void SearchAndDeletee(String searchText) throws AWTException {
       findAndSendWithoutScroll("searchInput", searchText);
       findAndClickWithoutScroll("searchButton");

       WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
       wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));
       findAndClickWithoutScroll("deleteButton");
       findAndClick("deleteDialogButton");
   }
}


