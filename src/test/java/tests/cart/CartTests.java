package tests.cart;

import base.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.LoginPage;

public class CartTests extends BaseTest {

    @Test
    public void addToCartTest(){

        LoginPage login = new LoginPage(driver);
        login.openSite();
        login.loginValid();

        CartPage cart = new CartPage(driver);
        cart.addFirstProduct();

        // ⭐ Open cart overlay
        driver.findElement(By.cssSelector(".bag")).click();

        boolean itemPresent =
                driver.findElements(By.cssSelector(".float-cart__content"))
                        .size() > 0;

        Assert.assertTrue(itemPresent, "Product not in cart");
    }
}
