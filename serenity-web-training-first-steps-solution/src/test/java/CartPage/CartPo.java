package CartPage;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CartPo extends PageObject {

    protected static By PRODUCTS_TABLE = By.xpath("//table[@class='table table-striped table-bordered']");
    protected static By PRODUCT_TITLE = By.xpath("//td[@class='align_left']/a");
    protected static By COUNTRY_STATE_INPUT = By.xpath("//select[@id='estimate_country']");
    protected static By ZONE_INPUT = By.xpath("//select[@id='estimate_country_zones']");
    protected static By ZIP_INPUT = By.xpath("//input[@id='estimate_postcode']");
    protected static By ESTIMATE_BUTTON = By.xpath("//button[@title='Estimate']");
}
