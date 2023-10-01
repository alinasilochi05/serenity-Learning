package NavbarHeader;

import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class NavbarPo {

    protected static By LOGO = By.xpath("//a[@class='logo']");
    protected static By SEARCH_BOX = By.xpath("//input[@id='filter_keyword']");

    protected static By WELCOME_BACK_TEXT = By.xpath("//ul[@id='customer_menu_top']");
    protected static By  WELCOME_BACK_OPENED = By.xpath("//ul[@id='customer_menu_top']/li[@class='dropdown open']");

    protected static By MAIN_MENU_DROPDOWN = By.xpath("//div[@id='topnav']/select[@class='form-control']");

    protected static By CURRENCY_BUTTON = By.xpath("//ul[@class='nav language pull-left']");

    protected static By MINI_CART = By.xpath("//ul[@class='nav topcart pull-left']");
    protected static By LOOP_ICON= By.xpath("//form[@id='search_form']//div[@title='Go']/i[@class='fa fa-search']");
    protected static By MY_ACCOUNT_SUBMENU = By.xpath("//ul[@id='customer_menu_top']");

}
