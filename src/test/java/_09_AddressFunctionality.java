import Utilities.BaseDriver;
import Utilities.MyFunctions;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class _09_AddressFunctionality extends BaseDriver {
    @Test
    public void addAddress() {
        WebElement addressBookLink = driver.findElement(By.linkText("Address Book"));
        addressBookLink.click();

        WebElement newAddressLink = driver.findElement(By.linkText("New Address"));
        newAddressLink.click();

        Faker faker = new Faker();
        driver.findElement(By.id("input-firstname")).sendKeys(faker.name().firstName());
        driver.findElement(By.id("input-lastname")).sendKeys(faker.name().lastName());
        driver.findElement(By.id("input-company")).sendKeys(faker.company().name());
        driver.findElement(By.id("input-address-1")).sendKeys(faker.address().fullAddress());
        driver.findElement(By.id("input-city")).sendKeys(faker.address().city());
        driver.findElement(By.id("input-postcode")).sendKeys(faker.address().zipCode());
        WebElement countrySelect = driver.findElement(By.id("input-country"));
        WebElement stateSelect = driver.findElement(By.id("input-zone"));
        Select select = new Select(countrySelect);
        select.selectByVisibleText("United States");
        Select select1 = new Select(stateSelect);
        select1.selectByVisibleText("Alabama");
        driver.findElement(By.xpath("(//input[@name='default'])[1]")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();

        MyFunctions.successMessageValidation();
    }
}
