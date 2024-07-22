import Utilities.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static java.lang.Integer.valueOf;

public class _17_Homework extends BaseDriverParameter {
    @Test
    @Parameters("driverType")
    public void productSalesControl() {
        driver.findElement(By.linkText("Specials")).click();
        WebElement productOnePrice = driver.findElement(By.xpath("(//span[@class='price-new'])[1]"));
        WebElement productTwoPrice = driver.findElement(By.xpath("(//span[@class='price-new'])[2]"));
        WebElement productOneOldPrice = driver.findElement(By.xpath("(//span[@class='price-old'])[1]"));
        WebElement productTwoOldPrice = driver.findElement(By.xpath("(//span[@class='price-old'])[2]"));

        Assert.assertTrue(productOneOldPrice.isDisplayed());
        Assert.assertTrue(productTwoOldPrice.isDisplayed());


        int price1disc = (int) Double.parseDouble(productOnePrice.getText().replace("$", ""));
        int price1old = (int) Double.parseDouble(productOneOldPrice.getText().replace("$", ""));
        int price2disc = (int) Double.parseDouble(productTwoPrice.getText().replace("$", ""));
        int price2old = (int) Double.parseDouble(productTwoOldPrice.getText().replace("$", ""));

        System.out.println(price1disc + " < " + price1old);
        System.out.println(price2disc + " < " + price2old);


        Assert.assertTrue(price1disc < price1old);
        Assert.assertTrue(price2disc < price2old);
    }
}
