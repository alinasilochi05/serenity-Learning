package CartPage;

import Utils.Urls;
import authentificationPage.LoginActions;
import authentificationPage.User;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class CartTests {

    @Managed
    WebDriver driver;

    @Before
    public void login(){

        loginActions.login(User.VALID_USER);
        driver.get(Urls.CART_URL);
    }
    @Steps
    CartActions cartActions;
    LoginActions loginActions;

    @Test
    public void selectCountry(){
        cartActions.selectCountryByVisibleText("Romania");
        //ASSERT
    }

    @Test
    public void selectZone(){
        cartActions.selectZoneByVisibleText("Alba");
        //ASSERT
    }

    @Test
    public void setShippingForm(){
        cartActions.selectCountryByVisibleText("Romania");
        cartActions.selectZoneByVisibleText("Alba");
        cartActions.setZipInput("111111");
        cartActions.clickEstimateButton();
        //ASSERT
    }

}
