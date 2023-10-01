package NavbarHeader;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

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
    public boolean isMyAccountMenuDisplayed(){
        return find(NavbarPo.MY_ACCOUNT_SUBMENU).isDisplayed();
    }

//    @Step("Create a list with all elements in MY Account Menu")
//    public void createMyAccountElementsList(){
//        WebElement subMenu = find(NavbarPo.MY_ACCOUNT_SUBMENU);
//        List<WebElement> listElements = subMenu.findElements(By.tagName("li"));
//        ArrayList<String> labels = new ArrayList<String>();
//        for (WebElement listElement : listElements) {
//            labels.add(listElement.findElement(By.tagName("a")).getAttribute("href"));
//        }
//        System.out.println(labels);
//    }

    //*[@id="customer_menu_top"]/li/ul/li[1]/a

    @Step("Check if Main Menu is displayed -window-size=1000,800")
    public boolean isMainMenuDisplayed(){
        return find(NavbarPo.MAIN_MENU_DROPDOWN).isDisplayed();
    }

    @Step("Check if Main Menu is clickable")
    public void clickMainMenuDropdown(){
        find(NavbarPo.MAIN_MENU_DROPDOWN).click();
    }

    @Step("Select a value from Main Manu")
        public void selectOptionByVisibleText(String categoryText){
        WebElementFacade mainMenuElement = find(NavbarPo.MAIN_MENU_DROPDOWN);
        mainMenuElement.selectByVisibleText(categoryText);
    }
    @Step("Check if Search Box is clickable")
    public void clickSearchBox(){
        find(NavbarPo.SEARCH_BOX).click();
    }

    @Step("Chef if Search Box is writable")
    public void writeInSearchBox(String searchedText){
        find(NavbarPo.SEARCH_BOX).sendKeys(searchedText);
    }
    @Step
    public void clickLoopIcon(){
        find(NavbarPo.LOOP_ICON).click();
    }


}
