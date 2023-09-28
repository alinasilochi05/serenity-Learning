package Utils;

import authentificationPage.LoginActions;
import authentificationPage.User;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginFunctionality{

   @Steps
    LoginActions loginActions;

        public void loginAsValidUser() {
            loginActions.login(User.VALID_USER);
    }
}
