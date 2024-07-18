import org.testng.Assert;
import org.testng.annotations.Test;

public class _06_Assertions{
    @Test
    public void equalsExample() {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "Hello1";

        Assert.assertEquals(s1, s2,"equality could not be achieved");
        Assert.assertEquals(s1, s3,"equality could not be achieved");
    }

    @Test
    public void notEqualsExample() {
        int x = 10;
        int y = 12;
        int z = 10;

        Assert.assertNotEquals(x, y, "equality could not be achieved");
        Assert.assertNotEquals(x, z, "equality could not be achieved");
    }

    @Test
    public void trueExample() {
        String str1 = "Hello world";
        String str2 = "Hello";

        Assert.assertTrue(str1.contains(str2));
        Assert.assertTrue(str1.contains("world"));
    }

    @Test
    public void nullExample() {
        String s1 = null;
        String s2 = "Hello";

        Assert.assertNull(s1, "S1 is not null");
        Assert.assertNotNull(s2, "S2 is not null");
    }

    @Test
    public void directFailExample() {
        int a = 50;
        if (a == 50){
            Assert.fail("condition not met");
        }
    }
}
