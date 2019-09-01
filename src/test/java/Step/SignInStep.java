package Step;

import Page.AccountPage;
import Page.AuthenticationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SignInStep
{
    private AuthenticationPage authenticationPage;

    public SignInStep(WebDriver driver)
    {
        authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
    }

    public AccountPage signIn(String email, String password)
    {
        authenticationPage.enterEmailLogin(email);
        authenticationPage.enterPassword(password);
        return authenticationPage.pressSignInButton();
    }
}
