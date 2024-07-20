import org.testng.annotations.Test;

public class _12_TestGroups {
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
    @Test(groups = {"RegressionTest"})
    public void test6() {
        System.out.println("Test6");
    }
    @Test
    public void test7() {
        System.out.println("Test7");
    }

    @Test(groups = {"RegressionTest"})
    public void test8() {
        System.out.println("Test8");
    }
}
