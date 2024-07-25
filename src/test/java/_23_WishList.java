import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _23_WishList extends BaseDriver {
    @Test
    @Parameters("item")
    public void addItemToWishList(String itemName) {
        driver.findElement(By.name("search")).sendKeys(itemName);
        driver.findElement(By.cssSelector(".fa.fa-search")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.cssSelector(".button-group > button:nth-of-type(2)")).click();
        MyFunctions.WaitFor(1);
        driver.findElement(By.cssSelector("a#wishlist-total > .fa.fa-heart")).click();
        MyFunctions.WaitFor(1);

        WebElement listedItem = driver.findElement(By.cssSelector("td:nth-of-type(2) > a"));

        Assert.assertTrue(listedItem.getText().toLowerCase().contains(itemName));
        System.out.println("Added item in the wish list");

        driver.findElement(By.cssSelector(".btn-danger")).click();
        MyFunctions.WaitFor(1);

        WebElement emptyCardMessage = driver.findElement(By.cssSelector("div#content > p"));
        Assert.assertTrue(emptyCardMessage.isDisplayed());
    }
}
