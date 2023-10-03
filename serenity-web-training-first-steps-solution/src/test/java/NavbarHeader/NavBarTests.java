package NavbarHeader;
import HomePage.HomePagePO;
import MyAccountPage.MyAccountPO;
import SearchPage.SearchPo;
import authentificationPage.LoginActions;
import authentificationPage.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

@RunWith(SerenityRunner.class)
public class NavBarTests {
    @Managed
    WebDriver driver;


    @Steps
    NavbarActions navbarActions;
    LoginActions loginActions;
    HomePagePO homePagePO;
    MyAccountPO myAccountPO;
    SearchPo searchPo;

    @Before
   public void login(){
        loginActions.login(User.VALID_USER);
    }


    //LOGO TESTS
    @Test
    public void checkIfLogoIsDisplay() {
        Assert.assertTrue("Logo is not displayed", navbarActions.isLogoDisplayed());
    }

    @Test
    public void openHomePageFromLogo(){
        navbarActions.clickOnLogo();
        Assert.assertEquals(homePagePO.getTitle(), "A place to practice your automation skills!");
    }


    //WELCOME BACK SECTION TESTS
    @Test
    public void openMyAccountMenu(){
        navbarActions.hoverOverWelcomeBackText();
        Assert.assertTrue("My account submenu is not displayed", navbarActions.isMyAccountMenuDisplayed());
    }

    @Test
    public void checkIfAllExpectedElementAreDisplayed(){
        navbarActions.hoverOverWelcomeBackText();
        Assert.assertEquals(navbarActions.myAccountMenu, NavbarPo.myAccountSubmenuExpectedElements);
    }


    //MAIN MENU TESTS
    @Test
    public void checkIfMainMenuDropdownIsDisplayed(){
       Assert.assertTrue("Main Menu is not displayed", navbarActions.isMainMenuDisplayed());
    }
    @Test
    public void openMainMenuDropdown(){
        navbarActions.clickMainMenuDropdown();
    }

    @Test
    public void selectValueFromMainMenuDropdown(){
        navbarActions.selectOptionByVisibleText(" Account");
        Assert.assertEquals(myAccountPO.getTitle(), "My Account");
    }


    //SEARCH BOX TESTS
    @Test
    public void displaySearchBoxCategories(){
        navbarActions.clickSearchBox();
        Assert.assertTrue("Search Box is not opened", navbarActions.isSearchBoxOpened());
    }

    @Test
    public void openSearchBoxCategory(){
        navbarActions.clickSearchBox();
        navbarActions.clickSearchBoxCategory("Skincare");
        Assert.assertEquals(navbarActions.getSelectedCategoryText(), "Skincare");
    }

    @Test
    public void findElementBySearchBox(){
        navbarActions.writeInSearchBox("Makeup");
        navbarActions.clickLoopIcon();
        Assert.assertEquals(searchPo.getTitle(), "Search");
    }

    //CURRENCY TESTS
    @Test
    public void displayCurrencyDropdown(){
        navbarActions.hoverOverCurrency();
        Assert.assertTrue("Currency hover is not displayed", navbarActions.isCrrencyHoverOpened());
    }

    @Test
    public void changeCurrency()  {
        navbarActions.hoverOverCurrency();
//       JavascriptExecutor js = ((JavascriptExecutor) driver);
//       js.executeScript("arguments[0].click();", NavbarPo.USD_CURRENCY);
          navbarActions.waitForUsdCurrencyToBeVisible();
        navbarActions.clickUSDCurrency();
        Assert.assertEquals("$ US DOLLAR", navbarActions.getActualCurrencyText());
    }

    @Test
    public void openFacebookPage(){
         navbarActions.clickFacebookIcon();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.facebook.com/");
    }




}
