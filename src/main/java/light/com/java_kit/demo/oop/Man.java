package light.com.java_kit.demo.oop;

public class Man extends Person {
    private double weight;
    public Man(String name, int age, double height, double weight) {
        super(name, age, height);
        this.weight = weight;
    }

    public void shout() {
        System.out.println("this is a man");
    }
}
