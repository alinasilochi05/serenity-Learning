package HomePage;

import Utils.Urls;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl(Urls.BASE_URL)
public class HomePagePO extends PageObject {

    protected static By ADD_TO_CART_ICON = By.xpath("//a[@title='Add to Cart'][1]");
    protected static By OUT_OF_STOCK = By.xpath("//span[@class='nostock'][1]");
    protected static By PRODUCT = By.xpath("//a[@class='prdocutname']");

public String getPageTitle(){
    return find("title").getText();
}
}
