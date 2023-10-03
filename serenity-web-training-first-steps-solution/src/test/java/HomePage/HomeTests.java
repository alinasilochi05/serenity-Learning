package HomePage;

import CartPage.CartActions;
import Utils.Urls;
import authentificationPage.LoginActions;
import authentificationPage.LoginTests;
import authentificationPage.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class HomeTests {
    @Managed(driver = "chrome")
    WebDriver driver;

    @Steps
    HomeActions homeActions;
    LoginActions loginActions;
    CartActions cartActions;


    @Before
    public void login(){

        loginActions.login(User.VALID_USER);
        driver.get(Urls.BASE_URL);
    }

    @Test
    public void addProductToCart(){
        homeActions.clickAddToCart();
        Assert.assertEquals(cartActions.checkIfProductIsInCart("Skinsheen Bronzer Stick"), "Skinsheen Bronzer Stick");
    }

    @Test
    public void checkIfOutOfStockIsDisable(){
        Assert.assertTrue("Out of Stock is enable", homeActions.isOutOfStockDisable());
    }
}
