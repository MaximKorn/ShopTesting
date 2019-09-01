package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {

    WebDriver driver;

    By fieldEmailCreate = By.id("email_create");
    By buttonCreateAccount = By.id("SubmitCreate");
    By fieldEmailLogin = By.id("email");
    By fieldPassword = By.id("passwd");
    By buttonSignIn = By.id("SubmitLogin");

    public AuthenticationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public AuthenticationPage enterEmailCreate(String email)
    {
        new WebDriverWait(driver,10).until(
                ExpectedConditions.elementToBeClickable(fieldEmailCreate));
        driver.findElement(fieldEmailCreate).sendKeys(email);
        return this;
    }

    public AccountCreationPage pressCreateAccountButton()
    {
        driver.findElement(buttonCreateAccount).click();
        return new AccountCreationPage(driver);
    }

    public AuthenticationPage enterEmailLogin(String email)
    {
        new WebDriverWait(driver,10).until(
                ExpectedConditions.elementToBeClickable(fieldEmailLogin));
        driver.findElement(fieldEmailLogin).sendKeys(email);
        return this;
    }

    public AuthenticationPage enterPassword(String password)
    {
        driver.findElement(fieldPassword).sendKeys(password);
        return this;
    }

    public AccountPage pressSignInButton()
    {
        driver.findElement(buttonSignIn).click();
        return new AccountPage(driver);
    }
}
