package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

public class tes27_SubjectCategoriesSteps {

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

    @When("User delete item from Dialog")
    public void userDeleteItemFromDialog() throws AWTException {
        Robot rbt = new Robot();
        rbt.keyPress(KeyEvent.VK_ENTER);
        rbt.keyRelease(KeyEvent.VK_ENTER);
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.cssSelector("employee-image[class=ng-star-inserted]"),2));
        //waitForElementToBeRefreshedAndClickable(GWD.getDriver(), By.xpath("//ms-delete-button//button"));
        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogButton");
    }

    @And("User initiates edit button")
    public void userInitiatesEditButton() {
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(),By.xpath("//ms-search-button//button"));
    }

    @And("User initiates delete button")
    public void userInitiatesDeleteButton() {
        dc.waitForElementToBeRefreshedAndClickable(GWD.getDriver(),By.xpath("//ms-search-button//button"));
    }
}
