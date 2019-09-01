package Test;

import Step.AccountStep;
import Step.SignInStep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignInTest
{
    private WebDriver driver;
    SignInStep signInStep;
    AccountStep accountStep;

    @Before
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        signInStep = new SignInStep(driver);
        accountStep = new AccountStep(driver);
    }

    @Test
    public void signInTest()
    {
        String email = "testemail5@test.com", password = "password123", firstName = "FirstName", lastName = "LastName";

        signInStep.signIn(email, password);
        accountStep.checkThatPageIsLoaded(firstName + " " + lastName);
    }

    @After
    public void afterTest()
    {
        driver.quit();
        driver = null;
    }
}
