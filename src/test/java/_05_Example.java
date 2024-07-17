import Utilities.BaseDriver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _05_Example extends BaseDriver {
    @Test
    public void loginTest() {
        System.out.println("Login tests beginning");
        driver.get("https://www.facebook.com/");
        Faker faker = new Faker();
        driver.findElement(By.cssSelector("#email")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.cssSelector("#pass")).sendKeys(faker.internet().password());
        driver.findElement(By.tagName("button")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#loginbutton")).isDisplayed());
    }
}
