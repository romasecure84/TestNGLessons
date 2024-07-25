import Utilities.BaseDriver;
import org.apache.commons.exec.ExecuteWatchdog;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _24_WishListsElements {
    public _24_WishListsElements(){
        PageFactory.initElements(BaseDriver.driver, this);
    }
    @FindBy(name = "search")
    public WebElement searchBox;
    @FindBy(css = ".fa.fa-search")
    public WebElement searchButton;
    @FindBy(css = ".button-group > button:nth-of-type(2)")
    public WebElement heartButton;
    @FindBy(css = "a#wishlist-total > .fa.fa-heart")
    public WebElement wishListButton;
    @FindBy(css = "td:nth-of-type(2) > a")
    public WebElement listedItem;
    @FindBy(css = ".btn-danger")
    public WebElement deleteItem;
    @FindBy(css = "div#content > p")
    public WebElement successMessage;
}
