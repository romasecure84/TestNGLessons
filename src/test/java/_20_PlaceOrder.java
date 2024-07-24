import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _20_PlaceOrder extends BaseDriver {
    @Test
    public void test1() {
        driver.findElement(By.name("search")).sendKeys("ipod");
        driver.findElement(By.cssSelector(".fa.fa-search")).click();
        MyFunctions.WaitFor(2);
        driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]")).click();
        MyFunctions.WaitFor(2);
        driver.findElement(By.xpath("//span[contains(text(),'Shopping Cart')]")).click();

        WebElement cardTotal = driver.findElement(By.id("cart-total"));
        cardTotal.click();

        double cardTotalSum = Double.parseDouble(cardTotal.getText().replaceAll("[^0-9.,]", ""));
        cardTotalSum = cardTotalSum % (int) Math.pow(10, (int) Math.log10(cardTotalSum));

        Assert.assertTrue(cardTotalSum > 0);
        System.out.println(cardTotalSum);

        driver.findElement(By.className("fa-share")).click();
        driver.findElement(By.id("button-payment-address")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.id("button-shipping-address")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.id("button-shipping-method")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.cssSelector("input[name='agree']")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.cssSelector("div#collapse-payment-method > div > div:nth-of-type(2) > label")).click();
        driver.findElement(By.id("button-payment-method")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.id("button-confirm")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("div#content > h1")).isDisplayed());

    }
}
