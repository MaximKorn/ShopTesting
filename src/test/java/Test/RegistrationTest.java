package Test;

import Step.AccountCreationStep;
import Step.AccountStep;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegistrationTest
{
    private WebDriver driver;
    AccountCreationStep accountCreationStep;
    AccountStep accountStep;

    @Before
    public void beforeTest()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication");
        accountCreationStep = new AccountCreationStep(driver);
        accountStep = new AccountStep(driver);
    }

    @Test
    public void registrationTest()
    {
        String email = "testemail6@test.com", genderId = "1", firstName = "FirstName", lastName = "LastName",
                password = "password123", birthDay = "10", birthMonth = "5", birthYear = "1990", company = "Test Company",
                address1 = "Test Address1", address2 = "Test Address2", city = "TestCity", state = "California",
                postcode = "00000", addInfo = "Additional Info For Test", homePhone = "012345678",
                mobilePhone = "876543210", addressAlias = "Test Address Alias";

        accountCreationStep.createAccount(email, genderId, firstName, lastName, password,
                birthDay, birthMonth, birthYear, company, address1, address2, city, state, postcode,
                addInfo, homePhone, mobilePhone, addressAlias);
        accountStep.checkThatPageIsLoaded(firstName + " " + lastName);
    }

    @After
    public void afterTest()
    {
        driver.quit();
        driver = null;
    }
}
