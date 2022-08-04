import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HomePage extends BasePage {

    By bestsellerLocator = By.id("js-bestseller");
    By searchBoxLocator = By.id("search-input");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goToHomePage() {
        driver.get("https://www.kitapyurdu.com/");
        driver.manage().window().maximize();
    }

    public boolean isOnHomePage() {
        return isDisplayed(bestsellerLocator);
    }

    public void searchAProduct() {
     File file=new File("products.csv");
     try{
         Scanner scanner= new Scanner(file);
         while (scanner.hasNextLine()){
             type(searchBoxLocator, scanner.nextLine());
             pressEnter(searchBoxLocator);
         }
     } catch (FileNotFoundException e) {
         e.printStackTrace();
     }


    }


}


