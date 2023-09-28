package authentificationPage;

import Utils.Urls;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {


    @Step("Login as{0}")
    public void login(User user){

        openUrl(Urls.LOGIN_URL);
        find(LoginPO.USERNAME).sendKeys(user.getUsername());
        find(LoginPO.PASSWORD).sendKeys(user.getPassword());
        find(LoginPO.LOGIN_BUTTON).click();
    }
}
