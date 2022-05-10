package om.nopcommerce.demo.pages;

import om.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComputerPage extends Utility {
    public ComputerPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Computers')]")
    WebElement ComputersText;
    public String getComputerText(){
        Reporter.log("getting  text from ComputersText"+ComputersText.toString()+"<br>");
        return getTextFromElement(ComputersText);
    }


    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]/a[1]")
    WebElement DesktopsLink;
    public void clickOnDesktopLink(){
        Reporter.log("Clicking on DesktopsLink "+DesktopsLink .toString()+ "<br>");
        clickOnElement(DesktopsLink);
    }

    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/h2[1]/a[1]")
    WebElement NotebooksLink;
    public void clickOnNotepadeLink(){
        Reporter.log("Clicking on NotebooksLink"+ NotebooksLink.toString()+ "<br>");
        clickOnElement(NotebooksLink);}


    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/h2[1]/a[1]")
    WebElement SoftwareLink;
    public void clickOnSoftWareLink(){
        Reporter.log("Clicking on SoftwareLink "+ SoftwareLink.toString()+ "<br>");
        clickOnElement(SoftwareLink);}

}
