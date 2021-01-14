package light.com.java_kit.demo.reflect;

import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        Random generator = new Random();
        Class cl = generator.getClass();
        String name = cl.getName();
        System.out.println(name);
    }
}
