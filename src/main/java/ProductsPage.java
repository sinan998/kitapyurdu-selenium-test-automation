import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductsPage extends BasePage{

    By productsLocator= new By.ByCssSelector("#product-table div.product-cr div.image");
    By productTableLocator=By.id("product-table");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductsPage() {
        waitElement(productTableLocator);
        return isDisplayed(productsLocator);
    }

    public void selectAProduct() {
        Random random= new Random();
        int i= random.nextInt(0,getProducts().size());
        getProducts().get(i).click();
    }

    private List<WebElement> getProducts(){
        return findAll(productsLocator);
    }
}
