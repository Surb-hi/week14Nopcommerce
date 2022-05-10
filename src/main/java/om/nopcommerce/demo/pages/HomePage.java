package om.nopcommerce.demo.pages;

import om.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Computers")
    WebElement computerTab;

    public void clickOnComputer() {
        Reporter.log("Clicking on computerTab" + computerTab.toString() + "<br>");
        clickOnElement(computerTab);
    }

    @FindBy(linkText = "Electronics")
    WebElement ElectronicsTab;

    public void clickOnElectronuces() {
        Reporter.log("Clicking on ElectronicsTab " + ElectronicsTab.toString() + "<br>");
        clickOnElement(ElectronicsTab);
    }

    @FindBy(linkText = "Apparel")
    WebElement ApparelTab;

    public void clickOnApparel() {
        Reporter.log("Clicking on ApparelTab" + ApparelTab.toString() + "<br>");
        clickOnElement(ApparelTab);
    }

    @FindBy(linkText = "Digital downloads")
    WebElement DigitaldownloadsTab;

    public void clickOnDigital() {
        Reporter.log("Clicking on DigitaldownloadsTab" + DigitaldownloadsTab.toString() + "<br>");
        clickOnElement(DigitaldownloadsTab);
    }

    @FindBy(linkText = "Books")
    WebElement BooksTab;

    public void clickOnBooks() {
        Reporter.log("Clicking on BooksTab " + BooksTab.toString() + "<br>");
        clickOnElement(BooksTab);
    }

    @FindBy(linkText = "Jewelry")
    WebElement JewelryTab;

    public void clickOnJewelary() {
        Reporter.log("Clicking on JewelryTab" + JewelryTab.toString() + "<br>");
        clickOnElement(JewelryTab);
    }

    @FindBy(linkText = "Gift Cards")
    WebElement GiftCardsTab;

    public void clickOnGiftCard() {
        Reporter.log("Clicking on GiftCardsTab" + GiftCardsTab.toString() + "<br>");
        clickOnElement(GiftCardsTab);
    }

    @FindBy(linkText = "Log in")
    WebElement loginlink;

    public void clickOnLogin() {
        Reporter.log("Clicking on loginlink" + loginlink.toString() + "<br>");
        clickOnElement(loginlink);
    }

    public String verifyloginText() {
        Reporter.log("getting  text from loginlink" + loginlink.toString() + "<br>");
        return getTextFromElement(loginlink);
    }


    @FindBy(linkText = "Register")
    WebElement registertionLink;

    public void clickOnRegister() {
        Reporter.log("Clicking on registertionLink" + registertionLink.toString() + "<br>");
        clickOnElement(registertionLink);
    }


    @FindBy(xpath = "//a[contains(text(),'Log out')]")
    WebElement logOutLink;

    public void clickOnLogOutLink() {
        Reporter.log("Clicking on logOutLink" + logOutLink.toString() + "<br>");
        clickOnElement(logOutLink);
    }

    public String verifyLogOutText() {
        Reporter.log("getting  text from logOutLink" + logOutLink.toString() + "<br>");
        return getTextFromElement(logOutLink);
    }


    @FindBy(xpath = "//body/div[6]/div[1]/div[2]/div[1]/a[1]/img[1]")
    WebElement logoLink;
    public void clickOnLogo() {
        Reporter.log("Clicking on logoLink" + logoLink.toString() + "<br>");
        clickOnElement(logoLink);
    }

    @FindBy(xpath = "//a[contains(text(),'My account')]")
    WebElement myAccountLink;
    public void clickOnMyAccount() {
        Reporter.log("Clicking on myAccountLink" + myAccountLink.toString() + "<br>");
        clickOnElement(myAccountLink);
    }

}
