package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SignUpPage {
    WebDriver driver;
    WebDriverWait wait;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    
    By createAccountBtn = By.linkText("Create an Account");
    By firstNameInput = By.id("firstname");
    By lastNameInput = By.id("lastname");
    By emailInput = By.id("email_address");
    By passwordInput = By.id("password");
    By confirmPasswordInput = By.id("password-confirmation");
    By registerButton = By.cssSelector("button[title='Create an Account']");

    
    public void clickCreateAccount() {
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
    }

    public void enterFirstName(String fname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstNameInput)).sendKeys(fname);
    }

    public void enterLastName(String lname) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastNameInput)).sendKeys(lname);
    }

    public void enterEmail(String email) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput)).sendKeys(email);
    }

    public void enterPassword(String pwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordInput)).sendKeys(pwd);
    }

    public void confirmPassword(String cpwd) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmPasswordInput)).sendKeys(cpwd);
    }

    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(registerButton)).click();
    }
}

