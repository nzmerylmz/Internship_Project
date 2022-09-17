package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import static Utilities.GWD.getDriver;

public class StepsRepository {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fc=new FormContent();

    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            fc.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
        }

    }
    @And("User edit and save in Dialog content")
    public void userEditAndSaveInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        }
    }
    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) throws AWTException {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndDeletee(listElement.get(i).get(1));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
    }

    @And("User sending the keys and edit in Dialog content")
    public void userSendingTheKeysAndEditInDialogContent(DataTable elements) throws AWTException {
        List<List<String>> listElement = elements.asLists(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            dc.SearchAndClear(listElement.get(i).get(1));
        }


    }

    @And("Click on the element in the Dialog")
    public void clickOnTheElementInTheDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sends keys in the Dialog Content")
    public void userSendsKeysInTheDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndSend(listElement.get(i).get(0),listElement.get(i).get(1));
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

//    @When("User delete item from Dialog")
//    public void userDeleteItemFromDialog() throws AWTException {
//        Robot rbt = new Robot();
//        rbt.keyPress(KeyEvent.VK_ENTER);
//        rbt.keyRelease(KeyEvent.VK_ENTER);
//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
//        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("employee-image[class=ng-star-inserted]"),2));
//        //waitForElementToBeRefreshedAndClickable(GWD.getDriver(), By.xpath("//ms-delete-button//button"));
//        dc.findAndClick("deleteButton");
//        dc.findAndClick("deleteDialogButton");
//    }

    @And("User initiates edit button")
    public void userInitiatesEditButton() {
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(),By.xpath("//ms-search-button//button"));
    }

    @And("User initiates delete button")
    public void userInitiatesDeleteButton() {
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(),By.xpath("//ms-search-button//button"));
    }

    @When("User finds and edits grade level")
    public void userFindsAndEditsGradeLevel() {
        dc.findAndClick("combobox");
        dc.findAndClick("comboboxAll");
        dc.findAndClick("specificEditButton");
    }

    @When("User finds and deletes grade level")
    public void userFindsAndDeletesGradeLevel() {
        dc.findAndClick("combobox");
        dc.findAndClick("comboboxAll");
        dc.findAndClick("specificDeleteButton");
        dc.findAndClick("deleteDialogButton");
    }

    @And("User initiates to send keys to the Dialog Content")
    public void userInitiatesToSendKeysToTheDialogContent() {
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[contains(@class,'mat-input-element mat-form-field-autofill-control')])[1]")));
    }
    @And("Navigate to fields page")
    public void navigateToFieldsPage() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("fields");
    }

    @Then("Create a field")
    public void createAField() {
        dc.findAndClick("addButtonfield");
        dc.findAndSend("nameInput", "grup1");
        dc.findAndSend("codeInput", "1717");
        dc.findAndClick("saveButton");
    }

    @When("User edit the fields")
    public void editAField() {
        dc.findAndSend("namefields", "grup1");
        dc.findAndClick("searchButton");

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));

        dc.findAndClick("editButton");
        dc.findAndSend("nameInput", "grup(1)");
        dc.findAndSend("codeInput", "17");
        dc.findAndClick("saveButton");


    }

    @When("User delete the fields")
    public void userDeleteTheFields() {

        dc.findAndSend("namefields", "grup(1)");
        dc.findAndClick("searchButton");

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogButton");

    }
    @And("Navigate to discounts page")
    public void navigateToDiscountsPage() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("discounts");
    }

    @Then("Create a discounts")
    public void createADiscount() {
        dc.findAndClick("addButton");
        dc.findAndSend("description", "grup1");
        dc.findAndSend("integrationCode32", "1717");
        dc.findAndSend("priority", "1771");
        dc.findAndClick("saveButton");
    }

    @And("Success edit message should be displayed")
    public void successEditMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @And("Success delete message should be displayed")
    public void successDeleteMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");}

    @And("Send keys to the Name area")
    public void sendKeysToTheNameArea() {
        dc.findAndSend("nameInEdit1","group1-edit");
    }

    @And("Click on the element in the Dialog to Delete the Edited document type")
    public void clickOnTheElementInTheDialogToDeleteTheEditedDocumentType(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
            if (listElement.get(i).equals("searchButton"))
                dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(), By.xpath("//ms-search-button//button"));
        }
    }

    @And("Click on Esc on the keyboard")
    public void clickOnEscOnTheKeyboard() {
        Actions aksiyonlar=new Actions(getDriver());
        Action aksiyon=aksiyonlar.keyDown(Keys.ESCAPE).build();
        aksiyon.perform();
    }

    @When("User edit the discounts")
    public void editADiscount() {
        dc.findAndSend("descriptionInput", "grup1");
        dc.findAndClick("searchButton");
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));
        dc.findAndClick("editButton");
        dc.findAndSend("description", "grup(1)");
        dc.findAndSend("integrationCode32", "17");
        dc.findAndSend("priority", "1700");
        dc.findAndClick("saveButton");
    }
    @When("User delete the discounts")
    public void userDeleteTheDiscounts() {
        dc.findAndSend("descriptionInput", "grup(1)");
        dc.findAndClick("searchButton");
        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogButton");
    }
    @And("Click on the element in the Dialog New Document")
    public void clickOnTheElementInTheDialogNewDocument(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Click on save button")
    public void clickOnSaveButton() {
        dc.findAndClick("saveButton");

    }


    @And("Edit the new created document type")
    public void editTheNewCreatedDocumentType() {
        dc.findAndSend("nameInEdit1","group1-tes24");
        dc.findAndClick("searchButton");
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(), By.xpath("//ms-edit-button//button"));
        dc.findAndClick("editButton");
        dc.findAndSend("nameInEdit2","group1-edit");
        dc.findAndClick("saveButton");
    }

    @And("Edit the new created school locations")
    public void editTheNewCreatedSchoolLocations() {
        dc.findAndClick("searchButton");
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(), By.xpath("//td[text()='group1-tes28']/following-sibling::td[5]//ms-edit-button"));
        dc.findAndClick("editButtonInLocation");
        dc.findAndSend("nameInput","group1-edit");
        dc.findAndClick("saveButton");
    }

    @And("Click on the element in the Dialog to Delete the Edited School Location")
    public void clickOnTheElementInTheDialogToDeleteTheEditedSchoolLocation(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("Wait until edit success message displayed")
    public void waitUntilEditSuccessMessageDisplayed() {
        dc.waitUntilVisibleofSuccessMessage(GWD.getDriver(),By.xpath("//*[contains(text(),'successfully')]"));
    }

}
