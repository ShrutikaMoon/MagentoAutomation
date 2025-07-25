package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChangePasswordPage {
    WebDriver driver;
    WebDriverWait wait;

    public ChangePasswordPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
    }

    
    By accountDropdown = By.cssSelector(".customer-name");
    By myAccountLink = By.linkText("My Account");
    By changePasswordLink = By.linkText("Change Password");
    By currentPasswordInput = By.id("current-password");
    By newPasswordInput = By.id("password");
    By confirmPasswordInput = By.id("password-confirmation");
    By saveButton = By.cssSelector("button[title='Save']");

    
    public void goToChangePassword() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(accountDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(myAccountLink)).click();
        wait.until(ExpectedConditions.elementToBeClickable(changePasswordLink)).click();
    }

    public void enterCurrentPassword(String currentPwd) {
        driver.findElement(currentPasswordInput).sendKeys(currentPwd);
    }

    public void enterNewPassword(String newPwd) {
        driver.findElement(newPasswordInput).sendKeys(newPwd);
    }

    public void confirmNewPassword(String newPwd) {
        driver.findElement(confirmPasswordInput).sendKeys(newPwd);
    }

    public void clickSave() {
        driver.findElement(saveButton).click();
    }
}
