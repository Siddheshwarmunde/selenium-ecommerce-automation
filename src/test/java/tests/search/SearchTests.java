package tests.search;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class SearchTests extends BaseTest {

    @Test
    public void searchProductTest() {

        LoginPage login = new LoginPage(driver);
        login.openSite();
        login.loginValid();

        SearchPage search = new SearchPage(driver);
        search.searchProduct("iPhone");

        Assert.assertTrue(search.getResultCount() > 0);
    }
    
 

}
