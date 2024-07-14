import org.testng.annotations.*;

public class _02_Annotations {
    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class is created");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method is created");
        // Before method is working with every test
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method is created");
        // After method is working with every test
    }

    @Test
    public void test1() {
        System.out.println("Test1 is working");
    }

    @Test
    public void test2() {
        System.out.println("Test2 is working");
    }

    @Test
    public void test3() {
        System.out.println("Test3 is working");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class is created");
    }
}
