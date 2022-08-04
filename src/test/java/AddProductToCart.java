import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProductToCart extends BaseTest{

    @Test
    @Order(1)
    public void goToHomePage(){
        homePage.goToHomePage();
        Assertions.assertTrue(homePage.isOnHomePage(),
                "Home page could not be displayed.");
        logger.info("Test step 1 passed.");
    }

    @Test
    @Order(2)
    public void searchAProduct(){
        homePage.searchAProduct();
        Assertions.assertTrue(productsPage.isOnProductsPage(),
                "Products could not be displayed.");
        logger.info("Test step 2 passed.");
    }

    @Test
    @Order(3)
    public void selectAProduct(){
        productsPage.selectAProduct();
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Product's detail could not be displayed");
        logger.info("Test step 3 passed.");
    }

    @Test
    @Order(4)
    public void addProductToCart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(productDetailPage.checkTheCart(),
                "product was not added to cart.");
        logger.info("Test step 4 passed.");
    }

    @Test
    @Order(5)
    public void goToCart(){
        productDetailPage.goToCart();
        Assertions.assertTrue(cartPage.isProductDisplay(),
                "Product is not display.");
        logger.info("Test step 5 passed.");
    }

    @Test
    @Order(6)
    public void increaseQuantity(){
        cartPage.increaseQuantity();
        Assertions.assertTrue(cartPage.updateYourCart(),
                "Quantity was not increased.");
        logger.info("Test step 6 passed.");
    }

    @Test
    @Order(7)
    public void removeProduct(){
        cartPage.removeProduct();
        Assertions.assertTrue(cartPage.isCartEmpty(),
                "Cart is not empty");
        logger.info("Test step 7 passed.");
    }

}
