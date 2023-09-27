package authentificationPage;

import MyAccountPage.MyAccountPO;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class LoginTests {
    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Steps
    LoginActions login;



    MyAccountPO homePagePO;
    @Test
    public void loginAsValidUser(){
        login.login(User.VALID_USER);
        Assert.assertEquals(homePagePO.getTitle(), "My Account");


    }
    @Test
    public void loginAsInvalidUser(){
        login.login(User.INVALID_USER);
        Assert.assertEquals(homePagePO.getTitle(), "Account Login");
    }

}
