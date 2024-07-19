import org.testng.Assert;
import org.testng.annotations.Test;

public class _08_Dependency {
    @Test
    public void startCar() {
        System.out.println("Start the engine of the car");
        //Assert.fail();
    }

    @Test(dependsOnMethods = {"startCar"})
    public void driveCar() {
        //Assert.fail();
        System.out.println("Drive the car");
    }

    @Test(dependsOnMethods = {"startCar", "driveCar"})
    public void parkCar() {
        System.out.println("Park the car");
    }

    @Test(dependsOnMethods = {"parkCar"}, alwaysRun = true)
    public void stopCar() {
        System.out.println("Stop the engine of the car");
    }
}
