import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _22_PlaceOrderPOM extends BaseDriver {
    @Test
    public void test1() {
        _21_PlaceOrderFindBy element = new _21_PlaceOrderFindBy();

        element.searchBox.sendKeys("ipod");
        element.searchButton.click();
        MyFunctions.WaitFor(2);
        element.addToCart.click();
        MyFunctions.WaitFor(2);
        element.shoppingCart.click();
        MyFunctions.WaitFor(2);
        element.checkOut.click();
        element.paymentAddressButton.click();
        element.shippingAddressButton.click();
        element.shippingMethodButton.click();
        MyFunctions.WaitFor(1);
        element.radioButtonAgree.click();
        element.radioButtonPaymentMethod.click();
        MyFunctions.WaitFor(1);
        element.paymentMethodButton.click();
        MyFunctions.WaitFor(1);
        element.confirmButton.click();

        Assert.assertTrue(element.successContent.isDisplayed());
    }
}
