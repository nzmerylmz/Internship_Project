package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DiscountsStep {
    DialogContent dc = new DialogContent();

    LeftNav ln = new LeftNav();


    @And("Navigate to discounts page")
    public void navigateToFieldsPage() {
        ln.findAndClick("setupOne");
        ln.findAndClick("parameters");
        ln.findAndClick("discounts");
    }

    @Then("Create a discounts")
    public void createAField() {
        dc.findAndClick("addButton");
        dc.findAndSend("description", "grup1");
        dc.findAndSend("integrationCode32", "1717");
        dc.findAndSend("priority", "1771");
        dc.findAndClick("saveButton");
    }

    @Then("succes message should be displayed")
    public void succesMessageShouldBeDisplayed() {

        dc.findAndContainsText("successMessage", "successfully");

    }

    @When("User edit the discounts")
    public void editAField() {
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
    public void userDeleteTheFields() {

       dc.findAndSend("descriptionInput", "grup(1)");
       dc.findAndClick("searchButton");

        WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"), "Search"));

        dc.findAndClick("deleteButton");
        dc.findAndClick("deleteDialogButton");

    }
}
