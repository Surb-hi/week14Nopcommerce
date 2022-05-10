package om.nopcommerce.demo.pages;

import om.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class DesktopsPage extends Utility {
    public DesktopsPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Desktops')]")
    WebElement Desktopstext;
    public String getDekstopText() {
        Reporter.log("getting  text from DeksTop"+Desktopstext.toString()+"<br>");
        return getTextFromElement(Desktopstext);
    }


    @FindBy(xpath = "//select[@id='products-orderby']")
    WebElement Sortby;
    public void setSelectSortByProductList(String sortBy) {
        Reporter.log("Selecting Sortby"+sortBy+" from dropdown "+Sortby.toString() + "<br>");
        selectByVisibleTextFromDropDown(Sortby, sortBy);
    }

    @FindBy(xpath = "//select[@id='products-pagesize']")
    WebElement Display;
    public void setSelectDisplayProductList(String display) {
        Reporter.log("Selecting Display"+display+" from dropdown "+Display.toString() + "<br>");
        selectByVisibleTextFromDropDown(Display, display);
    }

    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement selectProductList;
    public void clickOnList() {
        Reporter.log("Clicking on ProductList"+ selectProductList.toString()+ "<br>");
        clickOnElement(selectProductList);
    }

    @FindBy(xpath ="//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]")
    WebElement bulidOwnComputer;
    public void clickOnbulidOwnComputer() {
        Reporter.log("Clicking on bulidOwnComputer "+ bulidOwnComputer.toString()+ "<br>");
        clickOnElement(bulidOwnComputer);
    }
}
