package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By addBtn = By.cssSelector(".shelf-item__buy-btn");
    By cartIcon = By.cssSelector(".bag");
    By checkoutBtn = By.cssSelector(".buy-btn");

    public void addFirstProduct() {
        wait.until(ExpectedConditions.elementToBeClickable(addBtn)).click();
    }

    public void goToCheckout() {
        wait.until(ExpectedConditions.elementToBeClickable(cartIcon)).click();
        wait.until(ExpectedConditions.elementToBeClickable(checkoutBtn)).click();
    }
}
