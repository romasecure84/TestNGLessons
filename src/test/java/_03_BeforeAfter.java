import Utilities.MyFunctions;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class _03_BeforeAfter {
    public static WebDriver  driver;
    @Test
    public void test1() {
        System.out.println("Test 1");
    }

    @Test(enabled = false)
    // enabled = false command for not running the test
    public void test2() {
        System.out.println("Test 2");
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }
    @BeforeClass
    public void setUp(){
        System.out.println("Starting class working");
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE); //Xetalari gostermek ucun


        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(20);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);
    }
    @AfterClass
    public void tearDown(){
        System.out.println("Finishing class working");
        MyFunctions.WaitFor(5);
        driver.quit();
    }
}
