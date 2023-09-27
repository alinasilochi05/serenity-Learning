package authentificationPage;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


public class LoginPO extends PageObject {

  protected static By USERNAME = By.xpath("//input[@id='loginFrm_loginname']");
  protected static By PASSWORD = By.xpath("//input[@id='loginFrm_password']");
  protected static final By LOGIN_BUTTON = By.xpath("//button[@title='Login']");
}
