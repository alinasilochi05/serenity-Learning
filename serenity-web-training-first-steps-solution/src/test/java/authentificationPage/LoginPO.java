package authentificationPage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPO extends PageObject {

  protected static By USERNAME = By.id("loginFrm_loginname");
  protected static By PASSWORD = By.id("loginFrm_password");
  protected static final By LOGIN_BUTTON = By.xpath("//form[@id='loginFrm']//button[@title='Login']/i[@class='fa fa-lock']");
}
