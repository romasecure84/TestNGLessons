package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class MyFunctions {
    public static void WaitFor(int second) {
        try {
            Thread.sleep(1000L *second);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }

    public static void successMessageValidation(){
        WebElement message = BaseDriver.driver.findElement(By.xpath("//div[contains(@class, 'alert')]"));
        Assert.assertTrue(message.isDisplayed());
    }
}
