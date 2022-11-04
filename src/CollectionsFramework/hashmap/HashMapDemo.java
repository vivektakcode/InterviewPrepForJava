package CollectionsFramework.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("A", 2);
        map.put("B", 2);
        map.put("null", null);

        map.keySet().stream().forEach(System.out::println);


        System.out.println(map);
    }

}
