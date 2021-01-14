package light.com.java_kit.demo.fanxing;

public class Fmethod {
    public static void main(String[] args) {
        String[] a = new String[]{"aaa", "bbbb", "akjfalg", "dafd"};
        System.out.println(F.getMiddle(a));

        System.out.println(F.getMiddle(3.14, 1838, 0));
    }
}

class F {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }
}