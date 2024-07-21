import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _15_ContactParameter extends BaseDriver {
    @Test
    @Parameters("text")
    public void contactUsMessage(String message) {
        driver.findElement(By.linkText("Contact Us")).click();
        driver.findElement(By.id("input-enquiry")).sendKeys(message);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
