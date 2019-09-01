package Step;

import Page.AccountCreationPage;
import Page.AccountPage;
import Page.AuthenticationPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AccountCreationStep
{
    private AuthenticationPage authenticationPage;

    public AccountCreationStep(WebDriver driver)
    {
        authenticationPage = PageFactory.initElements(driver, AuthenticationPage.class);
    }

    public AccountPage createAccount(String email, String genderId, String firstName, String lastName,
                                     String password, String birthDay, String birthMonth, String birthYear,
                                     String company, String address1, String address2, String city,
                                     String state, String postcode, String addInfo, String homePhone,
                                     String mobilePhone, String addressAlias)
    {
        authenticationPage.enterEmailCreate(email);
        AccountCreationPage accountCreationPage = authenticationPage.pressCreateAccountButton();
        accountCreationPage.pressRadioButtonGenderMr(genderId);
        accountCreationPage.enterCustomerFirstName(firstName);
        accountCreationPage.enterCustomerLastName(lastName);
        accountCreationPage.enterEmail(email);
        accountCreationPage.enterPassword(password);
        accountCreationPage.viewListBirthDays();
        accountCreationPage.chooseBirthDay(birthDay);
        accountCreationPage.viewListBirthMonths();
        accountCreationPage.chooseBirthMonth(birthMonth);
        accountCreationPage.viewListBirthYears();
        accountCreationPage.chooseBirthYear(birthYear);
        accountCreationPage.enableNewsletter();
        accountCreationPage.enableSpecialOffers();
        accountCreationPage.enterCompany(company);
        accountCreationPage.enterAddress1(address1);
        accountCreationPage.enterAddress2(address2);
        accountCreationPage.enterCity(city);
        accountCreationPage.viewStates();
        accountCreationPage.chooseState(state);
        accountCreationPage.enterPostcode(postcode);
        accountCreationPage.enterAdditionalInfo(addInfo);
        accountCreationPage.enterHomePhone(homePhone);
        accountCreationPage.enterMobilePhone(mobilePhone);
        accountCreationPage.enterAddressAlias(addressAlias);
        return accountCreationPage.pressRegisterButton();
    }
}
