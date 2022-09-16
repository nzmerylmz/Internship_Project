package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _02_NationalitiesSteps {
    FormContent fc=new FormContent();
    DialogContent dc=new DialogContent();

    LeftNav ln=new LeftNav();

    @And("Click on the element in the left nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            ln.findAndClick(listelement.get(i));

        }
    }

    @And("Click on the element in the Dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            dc.findAndClick(listelement.get(i));
        }
    }

    @And("User sending the keys in Dialog content")
    public void userSendingTheKeysInDialogContent(DataTable elements) {
        List<List<String>> listelement = elements.asLists(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            dc.findAndSend(listelement.get(i).get(0),listelement.get(i).get(1));
        }
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {dc.findAndContainsText("successMessage","success");
    }

    @And("User edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<List<String>> listelement = elements.asLists(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            dc.SearchAndEdit(listelement.get(i).get(0),listelement.get(i).get(1));
        }
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listelement = elements.asList(String.class);
        for (int i = 0; i < listelement.size(); i++) {
            dc.SearchAndDelete(listelement.get(i));
        }
    }
}
