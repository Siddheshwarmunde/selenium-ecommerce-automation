package tests.checkout;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckoutTests extends BaseTest {

    @Test
    public void completeCheckoutFlow() {

        LoginPage login = new LoginPage(driver);
        login.openSite();
        login.loginValid();

        SearchPage search = new SearchPage(driver);
        search.searchProduct("iPhone");

        CartPage cart = new CartPage(driver);
        cart.addFirstProduct();
        cart.goToCheckout();   // ⭐ IMPORTANT STEP

        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.fillShippingDetails();

        Assert.assertTrue(
                checkout.isOrderPlaced(),
                "Order confirmation not displayed"
        );
    }
}
