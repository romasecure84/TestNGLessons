import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class _13_BeforeGroup {
    @Test(groups = {"SmokeTest"})
    public void test1() {
        System.out.println("Test1");
    }
    @Test(groups = {"RegressionTest"})
    public void test2() {
        System.out.println("Test2");
    }
    @Test(groups = {"SmokeTest"})
    public void test3() {
        System.out.println("Test3");
    }
    @Test(groups = {"RegressionTest"})
    public void test4() {
        System.out.println("Test4");
    }
    @Test(groups = {"SmokeTest"})
    public void test5() {
        System.out.println("Test5");
    }
    @AfterGroups(groups = {"RegressionTest"})
    public void test6() {
        System.out.println("After Group");
    }
    @BeforeGroups(groups = {"RegressionTest"})
    public void test7() {
        System.out.println("Before Group");
    }

    @Test
    public void test8() {
        System.out.println("Test8");
    }
}
