import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{

    By quantityLocator=new By.ByCssSelector("input[name='quantity']");
    By refreshButtonLocator= new By.ByCssSelector("i[class='fa fa-refresh green-icon']");
    By updateWarnLocator= new By.ByCssSelector(".swal2-header #swal2-title");
    By removeButtonLocator= new By.ByCssSelector("td.remove i.fa");
    By cartQuantityLocator=By.id("cart-items");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isProductDisplay() {
        return isDisplayed(quantityLocator);
    }

    public void increaseQuantity() {
        String quantity=getAttribute(quantityLocator,"value");
        int i = Integer.parseInt(quantity);
        i++;
        find(quantityLocator).clear();
        type(quantityLocator,String.valueOf(i));
        click(refreshButtonLocator);

    }

    public boolean updateYourCart() {
        waitElement(updateWarnLocator);
        return isDisplayed(updateWarnLocator);
    }

    public void removeProduct() {
        waitElement(removeButtonLocator);
        click(removeButtonLocator);
    }

    public boolean isCartEmpty() {
        waitForCount(cartQuantityLocator,"0");
        String quantity=find(cartQuantityLocator).getText();
        int count= Integer.parseInt(quantity);

        if(count==0){
            return true;
        }else{
            return false;
        }

    }
}
