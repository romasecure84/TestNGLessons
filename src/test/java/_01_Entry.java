import org.testng.annotations.Test;

public class _01_Entry {
    @Test(priority = 1)
    public void gotoWebsite() {
        System.out.println("Open the website");
    }

    @Test(priority = 2)
    public void login() {
        System.out.println("log in");
    }

    @Test(priority = 3)
    public void closeDriver() {
        System.out.println("Close the driver");
    }
}
