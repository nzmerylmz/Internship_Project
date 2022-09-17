package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class LoginSteps {

    DialogContent dc=new DialogContent();
    @Given("Navigate to basqar")
    public void navigate_to_basqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }
    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        String path = "src/test/java/GetLoginData/LoginData.xlsx";
        Workbook workbook = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet = workbook.getSheet("Login");
        int rowCount=sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < rowCount; i++) {
            Row row=sheet.getRow(i);
            int cellCount=row.getPhysicalNumberOfCells();
            for (int j = 0; j < cellCount; j++) {
                Cell cell=row.getCell(j);
                if (cell.toString().equalsIgnoreCase("Username")){
                    dc.findAndSend("username",row.getCell(j+1).toString());
                }
                if (cell.toString().equalsIgnoreCase("Password")){
                    dc.findAndSend("password",row.getCell(j+1).toString());
                }
            }
        }
        dc.findAndClick("loginButton");
        dc.findAndClick("acceptCookiesButton");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.findAndContainsText("dashboardText","Dashboard");
    }
}
