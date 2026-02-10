package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class CheckoutPage {

    WebDriver driver;
    WebDriverWait wait;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void fillShippingDetails() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstNameInput")))
                .sendKeys("Siddheshwar");

        driver.findElement(By.id("lastNameInput")).sendKeys("Munde");
        driver.findElement(By.id("addressLine1Input")).sendKeys("Pune");
        driver.findElement(By.id("provinceInput")).sendKeys("MH");
        driver.findElement(By.id("postCodeInput")).sendKeys("411057");

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("checkout-shipping-continue"))).click();
    }

    public boolean isOrderPlaced() {

        try {
            WebElement msg = wait.until(
                    ExpectedConditions.visibilityOfElementLocated(
                            By.id("confirmation-message")));

            return msg.getText().contains("successfully placed");

        } catch (Exception e) {
            return false;
        }
    }
}
