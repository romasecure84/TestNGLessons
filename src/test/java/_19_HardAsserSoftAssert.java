import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _19_HardAsserSoftAssert {
    @Test
    public void hardAssert() {
        String message1 = "Hello World";

        System.out.println("Before Assertion");
        Assert.assertEquals("Hello", message1, "Actual message is not the same as the expected message");
        System.out.println("After Assertion");
    }

    @Test
    public void _softAssert() {
        String message2 = "Hello World2";
        String message3 = "Hello World3";
        String message4 = "Hello World4";

        SoftAssert softAssert = new SoftAssert();

        System.out.println("Before Assertion \n");
        softAssert.assertEquals("Hello", message2);
        System.out.println("Soft Assertion 1");
        softAssert.assertEquals("Hello World", message3);
        System.out.println("Soft Assertion 2");
        softAssert.assertEquals("Hello World4", message4);
        System.out.println("Soft Assertion 3");
        System.out.println("\nAfter Assertion");

        softAssert.assertAll();

    }
}
