package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.SignUpPage;

public class SignUpTest extends BaseTest {

    @Test
    public void testUserSignUp() {
        SignUpPage signUp = new SignUpPage(driver);
        signUp.clickCreateAccount();
        signUp.enterFirstName("Shrutika");
        signUp.enterLastName("Moon");
        signUp.enterEmail("shrutikamoon18@gmail.com");
        signUp.enterPassword("Calls@150");
        signUp.confirmPassword("Calls@150");
        signUp.clickRegister();
    }
}
