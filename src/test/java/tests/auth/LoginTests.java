package tests.auth;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.openSite();
        login.loginValid();

        Assert.assertTrue(login.isLoggedIn(), "Login failed");
    }
}
