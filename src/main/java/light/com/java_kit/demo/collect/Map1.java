package light.com.java_kit.demo.collect;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map1 {
    public static void main(String[] args) {
        //update();
        tranverseMap();
    }

    public static void update() {
        Map<String, Integer> map = new HashMap<>();
        //更新不存在的元素
        String a = "aaa";
        map.put(a, map.getOrDefault(a, 0) + 1);
        System.out.println(map);

        String b = "bbb";
        map.merge(a, 1, Integer::sum);
        System.out.println(map);

        map.merge(b, 1, Integer::sum);

        System.out.println(map);
    }

    public static void tranverseMap() {
        Map<String, String> map = getMap();
        //方法一
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key));
        }

        //方法二
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey());
            System.out.println(entry.getValue());
        }

        //方法三
        map.forEach((k, v) -> {
            System.out.print(k);
            System.out.println(v);
        });
    }


    public static Map<String, String> getMap() {
        return new HashMap<String, String>(){{
            put("a", "aaaa");
            put("b", "bbbbb");
            put("c", "ccccc");
        }};
    }
}
