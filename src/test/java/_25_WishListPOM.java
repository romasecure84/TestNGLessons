import Utilities.BaseDriver;
import Utilities.MyFunctions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _25_WishListPOM extends BaseDriver {
    @Test
    @Parameters("item")
    public void addItemToWishList(String itemName) {
        _24_WishListsElements elements = new _24_WishListsElements();
        _21_PlaceOrderFindBy plcOrder = new _21_PlaceOrderFindBy();

        //elements.searchBox.sendKeys(itemName);
        //elements.searchButton.click();
        //WebElements located in the different page but with same locators
        plcOrder.searchBox.sendKeys(itemName);
        plcOrder.searchButton.click();
        MyFunctions.WaitFor(1);
        elements.heartButton.click();
        MyFunctions.WaitFor(1);
        elements.wishListButton.click();
        MyFunctions.WaitFor(1);
        Assert.assertTrue(elements.listedItem.getText().toLowerCase().contains(itemName));
        MyFunctions.WaitFor(1);
        elements.deleteItem.click();
        MyFunctions.WaitFor(1);
        Assert.assertTrue(elements.successMessage.isDisplayed());
    }
}
