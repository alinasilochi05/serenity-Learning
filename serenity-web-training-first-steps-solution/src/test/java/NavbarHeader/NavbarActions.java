package NavbarHeader;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class NavbarActions extends UIInteractionSteps {

    @Step("Check if Logo is displayed")

    public boolean isLogoDisplayed(){
        return find(NavbarPo.LOGO).isDisplayed();
    }

    @Step("Check if logo is clickable")

    public void clickOnLogo(){
        find(NavbarPo.LOGO).click();
    }
}
