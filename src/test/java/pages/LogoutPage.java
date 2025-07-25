package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class LogoutPage {
    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    
    By userMenu = By.cssSelector("button[data-action='customer-menu-toggle']");
    By signOutLink = By.linkText("Sign Out");

    public void clickSignOut() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.elementToBeClickable(userMenu)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(signOutLink)).click();
    }
}


