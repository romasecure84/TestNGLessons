package Utilities;

public class MyFunctions {
    public static void WaitFor(int second) {
        try {
            Thread.sleep(1000L *second);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
