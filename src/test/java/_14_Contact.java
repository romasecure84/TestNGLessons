import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _14_Contact extends BaseDriver {
    @Test
    public void contactUsMessage() {
        driver.findElement(By.linkText("Contact Us")).click();
        driver.findElement(By.id("input-enquiry")).sendKeys("Its a Test message");
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("success"));
    }
}
