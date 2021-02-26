package light.com.java_kit.util;

public class AryUtil {
    
    public void convert2Hex() {
        for (int i = 10; i < 20; i++) {
            System.out.println(i + "系统方法：" + Integer.toHexString(i));
            System.out.println(i + "自定义方法：" + byteToHex(i));
        }
    }

    /**
     * 将一个整形化为十六进制，并以字符串的形式返回
     */
    private final static String[] hexArray = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public String byteToHex(int n) {
        if (n < 0) {
            n = n + 256;
        }
        int d1 = n / 16;
        int d2 = n % 16;
        return hexArray[d1] + hexArray[d2];
    }
}