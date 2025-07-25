package tests;

import base.BaseTest;
import pages.LoginPage;
import pages.LogoutPage;
import org.testng.annotations.Test;

public class SignOutTest extends BaseTest {

    @Test
    public void testUserSignOut() {
        LoginPage loginPage = new LoginPage(driver);
        LogoutPage logoutPage = new LogoutPage(driver);

        
        loginPage.clickSignIn();
        loginPage.enterEmail("shrutikamoon18@gmail.com"); 
        loginPage.enterPassword("Calls@150");
        loginPage.clickLogin();

        
        logoutPage.clickSignOut();
    }
}

