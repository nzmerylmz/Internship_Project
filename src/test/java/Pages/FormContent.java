package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormContent extends Parent{

    public FormContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//mat-select[@formcontrolname='id']/div/div)[1]")
    private WebElement academicPeriod;

    @FindBy(xpath = "(//span[text()='Currency'])[3]")
    private WebElement currency;

    @FindBy(xpath = "//span[text()=' TRY ']")
    private WebElement currencyTry;




    WebElement myElement;

    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "academicPeriod" : myElement =academicPeriod; break;
            case "currency" : myElement =currency; break;
            case "currencyTry" : myElement =currencyTry; break;
        }

        clickFunction(myElement);

    }




}

