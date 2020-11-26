package light.com.java_kit.demo.lthread;

public class Run {
    public static void main(String[] args) {
        MyObject object = new MyObject();
        MyThreadA a = new MyThreadA(object);
        MyThreadB b = new MyThreadB(object);

        a.start();
        b.start();
    }
}
