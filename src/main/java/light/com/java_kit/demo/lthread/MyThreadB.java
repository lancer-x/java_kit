package light.com.java_kit.demo.lthread;

public class MyThreadB extends Thread {
    private MyObject object;
    public MyThreadB(MyObject o) {
        object = o;
    }

    @Override
    public void run() {
        object.methodB();
    }
}
