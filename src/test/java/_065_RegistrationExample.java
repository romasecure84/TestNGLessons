import Utilities.BaseDriver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class _065_RegistrationExample extends BaseDriver {
    @Test
    public void testLogin() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/register");
        Faker faker = new Faker();
        String email = "romasecure55555@gmail.com";
        String password = "123456";

        driver.findElement(By.cssSelector("input#input-firstname")).sendKeys(faker.name().firstName());
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(faker.name().lastName());
        driver.findElement(By.cssSelector("#input-email")).sendKeys(email);
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.cssSelector("#input-password")).sendKeys(password);
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(password);
        driver.findElement(By.cssSelector("[type='checkbox']")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
    }
}
