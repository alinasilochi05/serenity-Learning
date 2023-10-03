package HomePage;

import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class HomeActions extends UIInteractionSteps {

    @Step("Click on Add To Cart icon")
    public void clickAddToCart(){
        find(HomePagePO.ADD_TO_CART_ICON).click();
    }

    @Step("Check if Out Of Stock button is disable")
    public boolean isOutOfStockDisable(){
       return find(HomePagePO.OUT_OF_STOCK).isDisabled();
    }

}
