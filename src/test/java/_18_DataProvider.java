import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _18_DataProvider {

    @Test(dataProvider = "messageList")
    public void dataTest(String message) {
        System.out.println("message = " + message);
    }

    @DataProvider
    Object[] messageList(){

        Object[] myList = {"macbook", "samsung", "iphone", "monitor"};
        return myList;
    }

    @Test(dataProvider = "numbers")
    public void dataTest2(int number) {
        System.out.println("number = " + number);
        System.out.println(number + " square = " + number*number);
    }

    @DataProvider(name = "numbers")
    Object[] getData(){
        Object[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        return data;
    }

}
