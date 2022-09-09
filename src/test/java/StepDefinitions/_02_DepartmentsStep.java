package StepDefinitions;

import Pages.DialogContent;
import Pages.FormContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class _02_DepartmentsStep {

    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    FormContent fc=new FormContent();
    @And("Click on the element in the left Nav")
    public void clickOnTheElementInTheLeftNav(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            ln.findAndClick(listElement.get(i));
        }
    }

    @And("Click on the element in the Dialog content")
    public void clickOnTheElementInTheDialogContent(DataTable  elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            //   System.out.println("listElement = " + listElement.get(i));
            dc.findAndClick(listElement.get(i));
        }
    }

    @And("User sending the keys in the Dialog content")
    public void userSendingTheKeysInTheDialogContent(DataTable elements) {
        List<List<String>> listElement = elements.asLists(String.class);

        for(int i=0;i<listElement.size();i++)
            dc.findAndSend(listElement.get(i).get(0), listElement.get(i).get(1));
        // listin ilk elemanına(weblement adı), ikinci elemanı yani değeri gönder

    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.findAndContainsText("successMessage","success");
    }

    @And("User edit item from Dialog")
    public void userEditItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
        
        
    }

    @And("User delete item from Dialog")
    public void userDeleteItemFromDialog(DataTable elements) {
        List<String> listElement = elements.asList(String.class);
        for(int i=0;i<listElement.size();i++) {
            dc.findAndClick(listElement.get(i));
        }
    }
}
