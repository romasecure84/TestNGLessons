import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _07_Example extends BaseDriver {
    By link = By.linkText("Newsletter");

    By subYes = By.xpath("(//input[@name='newsletter'])[1]");

    By subNo = By.xpath("(//input[@name='newsletter'])[2]");

    By conBtn = By.cssSelector("input[value='Continue']");

    By message = By.xpath("//div[@id='account-account']/div[1]");

    @Test(priority = 1)
    public void subscribeYes() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();
        WebElement subscribeYes = driver.findElement(subYes);
        subscribeYes.click();
        WebElement continueBtn = driver.findElement(conBtn);
        continueBtn.click();

        MyFunctions.successMessageValidation();
    }

    @Test(priority = 1)
    public void subscribeNo() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();
        WebElement subscribeNo = driver.findElement(subNo);
        subscribeNo.click();
        WebElement continueBtn = driver.findElement(conBtn);
        continueBtn.click();

        MyFunctions.successMessageValidation();
    }

    @Test(priority = 3)
    public void subscribeCheck() {
        WebElement newsletterLink = driver.findElement(link);
        newsletterLink.click();

        WebElement subscribeYes = driver.findElement(subYes);
        WebElement subscribeNo = driver.findElement(subNo);

        if (subscribeYes.isSelected())
            subscribeNo.click();
        else subscribeYes.click();

        WebElement continueBtn = driver.findElement(conBtn);
        continueBtn.click();

        MyFunctions.successMessageValidation();
    }
}
