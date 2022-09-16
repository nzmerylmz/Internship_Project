package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class tes31_GradeLevelSteps {
    DialogContent dc=new DialogContent();
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
}
