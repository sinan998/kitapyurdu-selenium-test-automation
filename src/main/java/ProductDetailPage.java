import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailPage extends BasePage{

    By cartButtonLocator=new By.ByCssSelector("div.pr_cart #button-cart");
    By goToCartLocator=By.id("js-cart");
    By quanityMiniCartLocator=new By.ByCssSelector("#sprite-cart-icon span.fl");

    public ProductDetailPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductDetailPage() {
        waitElement(cartButtonLocator);
        return isDisplayed(cartButtonLocator);
    }

    public void addToCart() {
        click(cartButtonLocator);
    }

    public boolean checkTheCart() {
        waitForCount(quanityMiniCartLocator,"1");
        String quantityMiniCart=find(quanityMiniCartLocator).getText();
        int i=Integer.parseInt(quantityMiniCart);
        if(i>0){
            return true;
        }else{
            return false;
        }
    }

    public void goToCart() {
        click(quanityMiniCartLocator);
        waitElement(goToCartLocator);
        click(goToCartLocator);

    }


}
