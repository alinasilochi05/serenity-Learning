package HomePage;

import Utils.Urls;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl(Urls.BASE_URL)
public class HomePagePO extends PageObject {
public String getPageTitle(){
    return find(".title").getText();
}
}
