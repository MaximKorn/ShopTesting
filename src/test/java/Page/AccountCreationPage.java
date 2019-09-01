package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AccountCreationPage
{
    WebDriver driver;

    By radioButtonGender(String genderId) { return By.id("id_gender" + genderId); }
    By fieldCustomerFirstName = By.id("customer_firstname");
    By fieldCustomerLastName = By.id("customer_lastname");
    By fieldEmail = By.id("email");
    By fieldPassword = By.id("passwd");
    By listBirthDays = By.id("days");
    By listBirthMonths = By.id("months");
    By listBirthYears = By.id("years");
    By selectBirthDay(String day) { return selectFromListBox("birth", "days", day); }
    By selectBirthMonth(String month) { return selectFromListBox("birth", "months", month); }
    By selectBirthYear(String year) { return selectFromListBox("birth", "years", year); }
    By checkboxNewsletter = By.id("newsletter");
    By checkboxSpecialOffers = By.id("optin");
    By fieldCompany = By.id("company");
    By fieldAddress1 = By.id("address1");
    By fieldAddress2 = By.id("address2");
    By fieldCity = By.id("city");
    By listStates = By.id("id_state");
    By selectState(String stateNumber) { return selectFromListBox("state", "id_state", stateNumber); }
    By fieldPostalCode = By.id("postcode");
    By fieldAdditionalInfo = By.id("other");
    By fieldHomePhone = By.id("phone");
    By fieldMobilePhone = By.id("phone_mobile");
    By fieldAddressAlias = By.id("alias");
    By buttonRegister = By.id("submitAccount");

    public AccountCreationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public By selectFromListBox(String method, String formName, String value)
    {
        switch (method)
        {
            case "birth":
                return By.xpath("//select[@id='" + formName + "']/option[@value='" + value + "']");
            case "state":
                return By.xpath("//select[@id='" + formName + "']/option[text()='" + value +"']");
            default:
                return null;
        }
    }

    public AccountCreationPage pressRadioButtonGenderMr(String genderId)
    {
        new WebDriverWait(driver,10).until(
                ExpectedConditions.elementToBeClickable(radioButtonGender(genderId)));
        driver.findElement(radioButtonGender(genderId)).click();
        return this;
    }

    public AccountCreationPage enterCustomerFirstName(String firstName)
    {
        driver.findElement(fieldCustomerFirstName).sendKeys(firstName);
        return this;
    }

    public AccountCreationPage enterCustomerLastName(String lastName)
    {
        driver.findElement(fieldCustomerLastName).sendKeys(lastName);
        return this;
    }

    public AccountCreationPage enterEmail(String email)
    {
        driver.findElement(fieldEmail).clear();
        driver.findElement(fieldEmail).sendKeys(email);
        return this;
    }

    public AccountCreationPage enterPassword(String password)
    {
        driver.findElement(fieldPassword).sendKeys(password);
        return this;
    }

    public AccountCreationPage viewListBirthDays()
    {
        driver.findElement(listBirthDays).click();
        return this;
    }

    public AccountCreationPage viewListBirthMonths()
    {
        driver.findElement(listBirthMonths).click();
        return this;
    }

    public AccountCreationPage viewListBirthYears()
    {
        driver.findElement(listBirthYears).click();
        return this;
    }

    public AccountCreationPage chooseBirthDay(String day)
    {
        driver.findElement(selectBirthDay(day)).click();
        return this;
    }

    public AccountCreationPage chooseBirthMonth(String month)
    {
        driver.findElement(selectBirthMonth(month)).click();
        return this;
    }

    public AccountCreationPage chooseBirthYear(String year)
    {
        driver.findElement(selectBirthYear(year)).click();
        return this;
    }

    public AccountCreationPage enableNewsletter()
    {
        driver.findElement(checkboxNewsletter).click();
        return this;
    }

    public AccountCreationPage enableSpecialOffers()
    {
        driver.findElement(checkboxSpecialOffers).click();
        return this;
    }

    public AccountCreationPage enterCompany(String company)
    {
        driver.findElement(fieldCompany).sendKeys(company);
        return this;
    }

    public AccountCreationPage enterAddress1(String address1)
    {
        driver.findElement(fieldAddress1).sendKeys(address1);
        return this;
    }

    public AccountCreationPage enterAddress2(String address2)
    {
        driver.findElement(fieldAddress2).sendKeys(address2);
        return this;
    }

    public AccountCreationPage enterCity(String city)
    {
        driver.findElement(fieldCity).sendKeys(city);
        return this;
    }

    public AccountCreationPage viewStates()
    {
        driver.findElement(listStates).click();
        return this;
    }

    public AccountCreationPage chooseState(String state)
    {
        driver.findElement(selectState(state)).click();
        return this;
    }

    public AccountCreationPage enterPostcode(String postcode)
    {
        driver.findElement(fieldPostalCode).sendKeys(postcode);
        return this;
    }

    public AccountCreationPage enterAdditionalInfo(String addInfo)
    {
        driver.findElement(fieldAdditionalInfo).sendKeys(addInfo);
        return this;
    }

    public AccountCreationPage enterHomePhone(String homePhone)
    {
        driver.findElement(fieldHomePhone).sendKeys(homePhone);
        return this;
    }

    public AccountCreationPage enterMobilePhone(String mobilePhone)
    {
        driver.findElement(fieldMobilePhone).sendKeys(mobilePhone);
        return this;
    }

    public AccountCreationPage enterAddressAlias(String addressAlias)
    {
        driver.findElement(fieldAddressAlias).sendKeys(addressAlias);
        return this;
    }

    public AccountPage pressRegisterButton()
    {
        driver.findElement(buttonRegister).click();
        return new AccountPage(driver);
    }
}
