package pages;

import utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeftNav extends Parent {

    public LeftNav() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//span[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "(//span[text()='Countries'])[1]")
    public WebElement countries;
    @FindBy(xpath = "//span[text()='Citizenships']")
    public WebElement citizenships;
    @FindBy(xpath = "//span[text()='Nationalities']")
    private WebElement nationalities;
    @FindBy(xpath = "(//span[text()='Fees'])[1]")
    private WebElement fees;
    @FindBy(xpath="(//span[text()='Entrance Exams'])[1]")
    private WebElement entranceExamsOne;
    @FindBy(xpath="(//span[text()='Setup'])[2]")
    private WebElement setupTwo;
    @FindBy(xpath="(//span[text()='Entrance Exams'])[2]")
    private WebElement entranceExamsTwo;
    @FindBy(xpath="//span[text()='Human Resources']")
    private WebElement humanResources;
    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    private WebElement setupHumanResources;
    @FindBy(xpath = "//span[text()='Position Categories']")
    private WebElement positionCategories;
    @FindBy(xpath = "//span[text()='School Setup']")
    public WebElement schoolSetup;
    @FindBy(xpath = "//span[text()='Locations']")
    public WebElement locations;
    @FindBy(xpath = "//span[text()='Departments']")
    public WebElement departments;
    @FindBy(xpath = "//span[text()='Bank Accounts']")
    public WebElement bankAccounts;
    @FindBy(xpath = "//span[text()='Grade Levels']")
    public WebElement gradeLevels;

    public WebElement getWebElement(String strButton){

        switch (strButton)
        {
            case "setup" : return setup;
            case "parameters" : return parameters;
            case "countries" : return countries;
            case "citizenShip" : return citizenships;
            case "nationalities" : return nationalities;
            case "fees" : return fees;
            case "entranceExamsOne" : return entranceExamsOne;
            case "setupTwo" : return setupTwo;
            case "entranceExamsTwo" : return entranceExamsTwo;
            case "humanResources" : return humanResources;
            case "setupHumanResources" : return setupHumanResources;
            case "positionCategories" : return positionCategories;
        }
        return null;
    }





































































































































































































































































































































































































































































































































































































 }