package NavbarHeader;

import HomePage.HomePagePO;
import authentificationPage.LoginActions;
import authentificationPage.User;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class NavBarTests {
    @Managed
    WebDriver webDriver;


    @Steps
    NavbarActions navbarActions;
    LoginActions loginActions;
    HomePagePO homePagePO;

    @Before
   public void login(){
        loginActions.login(User.VALID_USER);
    }

    @Test
    public void checkIfLogoIsDisplay() {
        Assert.assertTrue("Logo is displayed", navbarActions.isLogoDisplayed());
    }

    @Test

    public void openHomePageFromLogo(){
        navbarActions.clickOnLogo();
        Assert.assertEquals(homePagePO.getTitle(), "A place to practice your automation skills!");
    }

}
