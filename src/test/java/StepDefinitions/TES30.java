package StepDefinitions;

import Pages.FormContent;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;

import java.util.List;

public class TES30 {
    FormContent fc=new FormContent();
    @And("Click on the element in the Form Content")
    public void clickOnTheElementInTheFormContent(DataTable elements) {
        List<String> listElement = elements.asList(String.class);

        for (int i = 0; i < listElement.size(); i++) {
            fc.findAndClick(listElement.get(i));
        }
    }
}
