package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class StepsRepository {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();
    @And("Click on the element in the Left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for (int i = 0; i < listElement.size(); i++) {
            ln.findAndClick(listElement.get(i));
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

}
