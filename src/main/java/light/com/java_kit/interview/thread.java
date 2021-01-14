package light.com.java_kit.interview;

import lombok.SneakyThrows;

class MyThread extends Thread {
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
            System.out.println(Thread.currentThread().getName() + "正在执行");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

    }
}

public class thread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
        System.out.println(Thread.currentThread().getName() + "main 方法结束");
    }
}
