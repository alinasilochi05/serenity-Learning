package NavbarHeader;

import org.openqa.selenium.By;

import java.util.ArrayList;

public class NavbarPo {

    protected static By LOGO = By.xpath("//a[@class='logo']");
    protected static By SEARCH_BOX = By.xpath("//input[@id='filter_keyword']");
    protected static By MY_ACCOUNT_MENU = By.xpath("//ul[@id='customer_menu_top']");
    protected static By WELCOME_BACK_OPENED = By.xpath("//ul[@id='customer_menu_top']/li[@class='dropdown open']");
    protected static By MAIN_MENU_DROPDOWN = By.xpath("//div[@id='topnav']/select[@class='form-control']");
    protected static By CURRENCY_BUTTON = By.xpath("//ul[@class='nav language pull-left']");
    protected static By MINI_CART = By.xpath("//ul[@class='nav topcart pull-left']");
    protected static By LOOP_ICON = By.xpath("//form[@id='search_form']//div[@title='Go']/i[@class='fa fa-search']");
    protected static By MY_ACCOUNT_SUBMENU = By.xpath("//li[@class='dropdown']/a/i");
    protected static By SEARCH_BAR_OPENED = By.xpath("//div[@class= 'btn-group search-bar open']");
    protected static By CATEGORY_SELECTED = By.xpath("//*[@id='category_selected']");
    protected static By USD_CURRENCY = By.xpath("/html/body/div/header/div[2]/div/div[2]/ul/li/ul/li[3]/a");
    protected static By CURRENCY_HOVER_OPENED = By.xpath("//li[@class='dropdown hover open']");
    protected static By VISIBLE_CURRENCY = By.xpath("//div[@class='block_6']/ul//a[@class='dropdown-toggle']/span");
    protected static By FACEBOOK_ICON = By.xpath("//div[class='header_block']/div[class='social_icons']/a[@innertext='Facebook']");

    ArrayList<String> myAccountList = new ArrayList<>();
    protected static ArrayList<String> myAccountSubmenuExpectedElements = new ArrayList<String>();


}
