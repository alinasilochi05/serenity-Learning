package authentificationPage;

import MyAccountPage.MyAccountPO;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;


@RunWith(SerenityRunner.class)
public class LoginTests {
    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Steps
    LoginActions login;

    MyAccountPO myAccountPO;
    @Test
    public void loginAsValidUser() {
        login.login(User.VALID_USER);
        Assert.assertEquals(myAccountPO.getTitle(), "My Account");
    }
    @Test
    public void loginAsInvalidUser(){
        login.login(User.INVALID_USER);
    }
}
