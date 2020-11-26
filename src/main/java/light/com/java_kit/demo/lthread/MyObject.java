package light.com.java_kit.demo.lthread;

import java.util.concurrent.Executors;

public class MyObject {
    synchronized public void methodA() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("this is a");
    }
    synchronized public void methodB() {
        System.out.println("this is b");

    }
}
