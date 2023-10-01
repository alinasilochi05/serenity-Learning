package NavbarHeader;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NavbarActions extends UIInteractionSteps {

    @Step("Check if Logo is displayed")
    public boolean isLogoDisplayed() {
        return find(NavbarPo.LOGO).isDisplayed();
    }

    @Step("Check if logo is clickable")
    public void clickOnLogo() {
        find(NavbarPo.LOGO).click();
    }

    @Step("Check the hover functionality - Welcome Back Text")
    public void hoverOverWelcomeBackText() {
        Actions actions = new Actions(getDriver());
        WebElement welcomeBackText = find(NavbarPo.WELCOME_BACK_TEXT);
        actions.moveToElement(welcomeBackText).perform();
    }

    @Step("Check if My Account Menu is opened")
    public boolean isMyAccountMenuDisplayed() {
        return find(NavbarPo.MY_ACCOUNT_SUBMENU).isDisplayed();
    }

    @Step("Create a list with all elements in MY Account Menu")
    public void createMyAccountElementsList() {
        WebElement subMenu = find(NavbarPo.MY_ACCOUNT_SUBMENU);
        List<WebElement> listElements = subMenu.findElements(By.tagName("li"));
        ArrayList<String> labels = new ArrayList<String>();
        for (WebElement listElement : listElements) {
            labels.add(listElement.findElement(By.tagName("a")).getAttribute("href"));
        }
        System.out.println(labels);
    }


    @Step("Check if Main Menu is displayed -window-size=1000,800")
    public boolean isMainMenuDisplayed() {
        return find(NavbarPo.MAIN_MENU_DROPDOWN).isDisplayed();
    }

    @Step("Check if Main Menu is clickable")
    public void clickMainMenuDropdown() {
        find(NavbarPo.MAIN_MENU_DROPDOWN).click();
    }

    @Step("Select a value from Main Manu")
    public void selectOptionByVisibleText(String categoryText) {
        WebElementFacade mainMenuElement = find(NavbarPo.MAIN_MENU_DROPDOWN);
        mainMenuElement.selectByVisibleText(categoryText);
    }

    @Step("Check if Search Box is clickable")
    public void clickSearchBox() {
        find(NavbarPo.SEARCH_BOX).click();
    }

    @Step("Chef if Search Box is writable")
    public void writeInSearchBox(String searchedText) {
        find(NavbarPo.SEARCH_BOX).sendKeys(searchedText);
    }

    @Step
    public void clickLoopIcon() {
        find(NavbarPo.LOOP_ICON).click();
    }

    @Step
    public boolean isSearchBoxOpened() {
        return find(NavbarPo.SEARCH_BAR_OPENED).isDisplayed();
    }

    @Step
    public void clickSearchBoxCategory(String text) {
        List<WebElementFacade> categories = findAll(By.xpath("//*[@id=\"main_menu_top\"]/li/a"));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        System.out.println(categories);
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        for (WebElementFacade category : categories) {
            if (category.getText().trim().contains(text)) {
                System.out.println(category.getText());
                category.click();
                return;
            }

        }
    }


    public String getSelectedCategoryText() {
        return find(NavbarPo.CATEGORY_SELECTED).getText();
    }

    @Step("Hover over currency dropdown")
    public void hoverOverCurrency() {
        Actions actions = new Actions(getDriver());
        WebElement currency = find(NavbarPo.CURRENCY_BUTTON);
        actions.moveToElement(currency).perform();
    }

    @Step("Click on US Dollar Currency")
    public void clickUSDCurrency() {
        find(NavbarPo.USD_CURRENCY).click();
    }

    @Step("Check if currency hover is displayed")
    public boolean isCrrencyHoverOpened() {
        return find(NavbarPo.CURRENCY_HOVER_OPENED).isDisplayed();
    }

    @Step("Check if the selected currency is displayed")
    public String getActualCurrencyText() {
        return find(NavbarPo.VISIBLE_CURRENCY).getText();
    }

    public void waitForUsdCurrencyToBeVisible() {
        element(NavbarPo.USD_CURRENCY).waitUntilVisible();
    }

    @Step("Check if facebook icon is clickable")
    public void clickFacebookIcon(){
        find(NavbarPo.FACEBOOK_ICON).click();
    }

}
