import Utilities.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _16_SearchItem extends BaseDriverParameter {
    @Test
    @Parameters("items")
    public void searchFunctionality(String item) {
        driver.findElement(By.name("search")).sendKeys("macbook");
        driver.findElement(By.cssSelector(".btn-default")).click();

        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(item));
    }
}
