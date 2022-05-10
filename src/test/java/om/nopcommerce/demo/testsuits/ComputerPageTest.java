package om.nopcommerce.demo.testsuits;

import om.nopcommerce.demo.pages.*;
import om.nopcommerce.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;

public class ComputerPageTest extends TestBase {
    HomePage homePage;
    ComputerPage computerPage;
    DesktopsPage desktopsPage;
    LoginPage loginPage;
    RegisterPage registerPage;
    BuildYourOwnComputerPage buildYourOwnComputerPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        homePage = new HomePage();
        computerPage = new ComputerPage();
        desktopsPage = new DesktopsPage();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        homePage.clickOnComputer();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(computerPage.getComputerText(),"Computers","");
        softAssert.assertAll();

    }
    @Test(groups = {"smoke","regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.clickOnComputer();
        computerPage.clickOnDesktopLink();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(desktopsPage.getDekstopText(),"Desktops","");
        softAssert.assertAll();
    }
    @Test(dataProvider = "credentials", dataProviderClass = TestData.class,groups = {"regression"})
    public void verifyThatUserShouldBuildYouOwnComputerAndAddThemToCartSuccessfully(String processor, String ram, String hdd, String os, String software){
        homePage.clickOnComputer();
        computerPage.clickOnDesktopLink();
        desktopsPage.clickOnbulidOwnComputer();
        buildYourOwnComputerPage.SelectProcessorDropDown(processor);
        buildYourOwnComputerPage.SelectRam(ram);
        buildYourOwnComputerPage.getHdd(hdd);
        buildYourOwnComputerPage.getOsRadio(os);
        buildYourOwnComputerPage.clickOnSoftwareCheckBox(software);
        buildYourOwnComputerPage.clickOnAddToCard();
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(buildYourOwnComputerPage.verifProductAddEdInToCardText(),"The product has been added to your shopping cart","");
        softAssert.assertAll();
    }

}
