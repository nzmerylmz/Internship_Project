package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

    DialogContent dc = new DialogContent();

    @Given("Navigate to basqar")
    public void navigate_to_basqar() {
        GWD.getDriver().get("https://demo.mersys.io/");
        GWD.getDriver().manage().window().maximize();

    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        dc.findAndSend("username","richfield.edu");
        dc.findAndSend("password","Richfield2020!");
        dc.findAndClick("loginButton");
        dc.findAndClick("acceptCookiesButton");
    }

    @Then("User should login successfully")
    public void user_should_login_successfully() {
        dc.findAndContainsText("dashboardText","Dashboard");
    }

}
