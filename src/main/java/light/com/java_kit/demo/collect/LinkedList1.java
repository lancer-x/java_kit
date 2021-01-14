package light.com.java_kit.demo.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedList1 {
    public static void main(String[] args) {
        t1();
    }

    public static void t1() {
        List<String> staff = new LinkedList<>();
        staff.add("one");
        staff.add("two");
        staff.add("three");

        ListIterator<String> iter = staff.listIterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }
        iter = staff.listIterator();
        iter.next();
        iter.add("22");
        System.out.println(staff);

        List<Integer> a = new ArrayList<>();
        a.subList(1, 10);
    }
}
