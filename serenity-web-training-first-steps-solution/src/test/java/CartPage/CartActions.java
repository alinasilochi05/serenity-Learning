package CartPage;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

import java.util.ArrayList;
import java.util.Objects;

public class CartActions extends UIInteractionSteps {

    @Step("Check if the selected product is in the cart")
    public String checkIfProductIsInCart(String productName){
        ArrayList<WebElementFacade> products = findAll(CartPo.PRODUCT_TITLE);
        for ( WebElementFacade product : products) {
            if(productName.equals(product.getText())){
             return product.getText();
            }
        }
        return " ";
    }

    @Step("Select element from Country and State dropdown")
    public void selectCountryByVisibleText(String country){
        WebElementFacade countryDropdown = find(CartPo.COUNTRY_STATE_INPUT);
        countryDropdown.selectByVisibleText(country);
    }

    @Step("Select element from Zone dropdown")
        public void selectZoneByVisibleText(String zone){
            WebElementFacade countryDropdown = find(CartPo.ZONE_INPUT);
            countryDropdown.selectByVisibleText(zone);
        }
    @Step("Chek if Zip Input is writable")
    public void setZipInput(String zipCode){
        find(CartPo.ZONE_INPUT).sendKeys(zipCode);
    }

    @Step("Check if Estimate Button is clickable")
    public void clickEstimateButton(){
        find(CartPo.ESTIMATE_BUTTON).click();
    }
}
