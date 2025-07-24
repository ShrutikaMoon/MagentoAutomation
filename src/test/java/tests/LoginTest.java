package tests;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);

        // Perform login
        loginPage.clickSignIn();
        loginPage.enterEmail("shrutikamoon18@gmail.com"); // replace with the correct test email
        loginPage.enterPassword("Calls@150"); // replace with the password used in SignUpTest
        loginPage.clickLogin();

        // Assertion (Optional): You can assert on user being logged in
        // Example: Assert user welcome message or account page URL
        // Assert.assertTrue(driver.getPageSource().contains("Welcome, Shrutika"));
    }
}

