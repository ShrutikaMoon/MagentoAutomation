package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ChangePasswordPage;

public class ChangePasswordTest extends BaseTest {

    @Test
    public void testChangePassword() {
        
        LoginPage login = new LoginPage(driver);
        login.clickSignIn();
        login.enterEmail("shrutikamoon18@gmail.com");
        login.enterPassword("Calls@150");
        login.clickLogin();

        
        ChangePasswordPage cp = new ChangePasswordPage(driver);
        cp.goToChangePassword();
        cp.enterCurrentPassword("Calls@150");
        cp.enterNewPassword("Test@12345");
        cp.confirmNewPassword("Test@12345");
        cp.clickSave();
    }
}

