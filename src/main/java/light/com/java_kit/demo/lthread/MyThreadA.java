package light.com.java_kit.demo.lthread;

import lombok.SneakyThrows;

public class MyThreadA extends Thread{
    private MyObject object;

    public MyThreadA(MyObject o) {
        object = o;
    }

    @SneakyThrows
    @Override
    public void run() {
        super.run();
        object.methodA();
    }
}
