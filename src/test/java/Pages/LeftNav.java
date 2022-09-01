package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent{

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath="(//span[text()='Setup'])[1]")
    private WebElement setupOne;

    @FindBy(xpath="//span[text()='Messaging']")
    private WebElement messaging;

    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExam;

    @FindBy(xpath="//span[text()='Student']")
    private WebElement student;

    @FindBy(xpath="//span[text()='Finance']")
    private WebElement finance;

    @FindBy(xpath="//span[text()='Human Resources']")
    private WebElement humanResources;

    @FindBy(xpath="//span[text()='Education']")
    private WebElement education;

    @FindBy(xpath="//span[text()='Video Conference']")
    private WebElement videoConference;

    @FindBy(xpath="(//span[text()='Surveys'])[1]")
    private WebElement surveys;

    @FindBy(xpath="//span[text()='Question Bank']")
    private WebElement questionBank;





    WebElement myElement;
    public void findAndClick(String strElement){

        switch (strElement)
        {
            case "setupOne" : myElement =setupOne; break;
            case "messaging" : myElement =messaging; break;
            case "entranceExam" : myElement =entranceExam; break;
            case "student" : myElement =student; break;
            case "finance" : myElement =finance; break;
            case "humanResources" : myElement =humanResources; break;
            case "education" : myElement =education; break;
            case "videoConference" : myElement =videoConference; break;
            case "surveys" : myElement =surveys; break;
            case "questionBank" : myElement =questionBank; break;
        }

        clickFunction(myElement);
    }

}
