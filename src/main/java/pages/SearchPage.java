package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.List;

public class SearchPage {

    WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    By searchBox = By.xpath("//input[@placeholder='Search']");
    By searchBtn = By.xpath("//button[contains(.,'Search')]");
    By products = By.cssSelector(".shelf-item");

    public void searchProduct(String name) {

        wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox)).clear();
        driver.findElement(searchBox).sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(searchBtn)).click();
    }

    public int getResultCount() {
        List<WebElement> items = driver.findElements(products);
        return items.size();
    }
}
