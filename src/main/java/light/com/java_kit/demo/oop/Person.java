package light.com.java_kit.demo.oop;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void shout() {
        System.out.println("this is a person");
    }
}
