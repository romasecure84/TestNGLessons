import org.testng.annotations.*;

public class _10_FirstClass {
    /* General Structure of the Tests
    @BeforeSuite
        @BeforeTest
            @BeforeGroup

                @BeforeClass
                    @BeforeMethod
                        @Test
                    @AfterMethod
                    @BeforeMethod
                        @Test
                    @AfterMethod
                    @BeforeMethod
                        @Test
                    @AfterMethod
                @AfterClass

            @AfterGroup
        @AfterTest
    @AfterSuite
     */

    @Test
    public void FC_test1() {
        System.out.println("First Class Test1");
    }

    @Test
    public void FC_test2() {
        System.out.println("First Class Test2");
    }
    @BeforeMethod
    public void FC_BeforeMethod(){
        System.out.println("First Class Before Method");
    }
    @AfterMethod
    public void FC_AfterMethod(){
        System.out.println("First Class After Method");
    }
    @BeforeClass
    public void FC_BeforeClass(){
        System.out.println("First Class Before Class");
    }
    @AfterClass
    public void FC_AfterClass(){
        System.out.println("First Class After Class");
    }
    @BeforeGroups
    public void FC_BeforeGroups(){
        System.out.println("First Class Before Groups");
    }
    @AfterGroups
    public void FC_AfterGroups(){
        System.out.println("First Class After Groups");
    }
    @BeforeTest
    public void FC_BeforeTest(){
        System.out.println("First Class Before Test");
    }
    @AfterTest
    public void FC_AfterTest(){
        System.out.println("First Class After Test");
    }
    @BeforeSuite
    public void FC_BeforeSuite(){
        System.out.println("First Class Before Suite");
    }
    @AfterSuite
    public void FC_AfterSuite(){
        System.out.println("First Class After Suite");
    }
}
