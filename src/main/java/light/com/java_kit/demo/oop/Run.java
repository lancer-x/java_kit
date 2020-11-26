package light.com.java_kit.demo.oop;

public class Run {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("p1", 20, 20);
        persons[1] = new Person("p2", 20, 20);
        persons[2] = new Man("m1", 20, 20, 30);

        for (int i = 0; i < persons.length; i++) {
            persons[i].shout();
        }
    }
}
