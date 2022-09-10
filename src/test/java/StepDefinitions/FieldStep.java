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

public class FieldStep {

  DialogContent dc=new DialogContent();

  LeftNav ln=new LeftNav();


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

    @Then("succes message should be displayed")
    public void succesMessageShouldBeDisplayed() {

dc.findAndContainsText("successMessage", "successfully");

    }

    @When("User edit the fields")
    public void editAField() {
 dc.findAndSend("namefields" ,"grup1");
dc.findAndClick("searchButton");

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

dc.findAndClick("editButton");
dc.findAndSend("nameInput", "grup(1)");
dc.findAndSend("codeInput", "17");
dc.findAndClick("saveButton");


    }

    @When("User delete the fields")
    public void userDeleteTheFields() {

        dc.findAndSend("namefields" ,"grup(1)");
        dc.findAndClick("searchButton");

        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(30));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("div[fxlayoutalign='center center'][class='control-full']"),"Search"));

 dc.findAndClick("deleteButton");
 dc.findAndClick("deleteDialogButton");

    }
}
