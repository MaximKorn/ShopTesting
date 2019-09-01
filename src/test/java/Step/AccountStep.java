package Step;

import Page.AccountPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountStep
{
    private AccountPage accountPage;

    public AccountStep(WebDriver driver)
    {
        accountPage = PageFactory.initElements(driver, AccountPage.class);
    }

    public void checkThatPageIsLoaded(String username)
    {
        accountPage.checkHeader();
        accountPage.checkUsername(username);
    }
}
