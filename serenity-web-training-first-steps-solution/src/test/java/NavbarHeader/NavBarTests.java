package NavbarHeader;

import Utils.LoginFunctionality;
import io.cucumber.java.BeforeStep;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavBarTests {

    @Managed(driver = "chrome")
    WebDriver webDriver;

    @Steps
    NavbarActions navbarActions;
    NavbarPo navbarPo;
    LoginFunctionality loginFunctionality;

    @BeforeStep
    public void setLoginFunctionality(){
        loginFunctionality.loginAsValidUser();
    }
    @Test
    public void checkIfLogoIsDisplay() {
        Assert.assertTrue("Logo is displayed", navbarActions.isLogoDisplayed());
    }

}
