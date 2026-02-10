package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

public class LoginPage {

    WebDriver driver;
    WebDriverWait wait;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    By signIn = By.id("signin");
    By usernameDrop = By.id("username");
    By passwordDrop = By.id("password");
    By userOption = By.xpath("//div[text()='demouser']");
    By passOption = By.xpath("//div[text()='testingisfun99']");
    By loginBtn = By.id("login-btn");

    public void openSite() {
        driver.get("https://bstackdemo.com/");
    }

    public void loginValid() {

        // If already logged in
        if (driver.getPageSource().contains("Logout")) {
            return;
        }

        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(usernameDrop)).click();
        wait.until(ExpectedConditions.elementToBeClickable(userOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passwordDrop)).click();
        wait.until(ExpectedConditions.elementToBeClickable(passOption)).click();
        wait.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
    }

    public boolean isLoggedIn(){

        try{
            return wait.until(ExpectedConditions.textToBe(
                    By.id("signin"),
                    "Logout"
            ));
        }
        catch(Exception e){
            return false;
        }
    }

}
