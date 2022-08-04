import enums.DriverTypes;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import static enums.DriverTypes.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BaseTest {

    protected static final Logger logger = LogManager.getLogger(AddProductToCart.class);

    WebDriver driver;
    HomePage homePage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartPage;

    @BeforeAll
    public void setUp(){
        DriverTypes browser = CHROME; // select a browser (EDGE, CHROME, FIREFOX)
        Initiliazebrowser(browser);
        homePage=new HomePage(driver);
        productsPage=new ProductsPage(driver);
        productDetailPage=new ProductDetailPage(driver);
        cartPage=new CartPage(driver);

        logger.info("Test stared.");

    }

    @AfterAll
    public void quit(){
        driver.quit();

        logger.info("Test finished.");
    }

    public void Initiliazebrowser(DriverTypes preferredBrowser){
        switch (preferredBrowser){
            case CHROME:
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                driver= new FirefoxDriver();
                break;
            case EDGE:
                WebDriverManager.edgedriver().setup();
                driver= new EdgeDriver();
                break;
            case SAFARI:
                WebDriverManager.safaridriver().setup();
                driver= new SafariDriver();
                break;
        }
    }


}
