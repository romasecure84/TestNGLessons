package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {
    public WebDriver driver;
    public static WebDriver wait;

    @BeforeClass
    @Parameters("driverType")
    public void initialOperations(String driverType) {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        switch (driverType.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
            default:
                driver = new ChromeDriver();
        }

        driver.manage().window().maximize();

        Duration dr = Duration.ofSeconds(20);
        driver.manage().timeouts().pageLoadTimeout(dr);
        driver.manage().timeouts().implicitlyWait(dr);

        login();
    }

    void login() {
        driver.get("https://opencart.abstracta.us/index.php?route=account/login");

        WebElement email = driver.findElement(By.id("input-email"));
        email.sendKeys("romasecure55555@gmail.com");

        WebElement password = driver.findElement(By.id("input-password"));
        password.sendKeys("123456");

        driver.findElement(By.cssSelector("[action] .btn-primary")).click();
    }

    @AfterClass
    public void finishingOperations() {
        MyFunctions.WaitFor(5);
        driver.quit();
    }
}
