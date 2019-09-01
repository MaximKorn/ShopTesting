package Page;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage
{
    WebDriver driver;

    By header = By.xpath("//h1");
    By username = By.xpath("//a[@class='account']/span");


    public  AccountPage(WebDriver driver)
    {
        this.driver = driver;
    }

    public void checkHeader()
    {
        new WebDriverWait(driver,10).until(
                ExpectedConditions.presenceOfElementLocated(header));
        Assert.assertEquals(driver.findElement(header).getText(), "MY ACCOUNT");
    }

    public void checkUsername(String chUsername)
    {
        new WebDriverWait(driver,10).until(
                ExpectedConditions.presenceOfElementLocated(username));
        Assert.assertEquals(driver.findElement(username).getText(), chUsername);
    }
}
