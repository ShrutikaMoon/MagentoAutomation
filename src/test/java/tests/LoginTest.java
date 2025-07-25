package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        
        loginPage.clickSignIn();
        loginPage.enterEmail("shrutikamoon18@gmail.com"); 
        loginPage.enterPassword("Calls@150"); 
        loginPage.clickLogin();

        
    }
}

