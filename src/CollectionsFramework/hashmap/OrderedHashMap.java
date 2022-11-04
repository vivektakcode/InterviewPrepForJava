package CollectionsFramework.hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OrderedHashMap {
    HashMap<String, Integer> hm = new LinkedHashMap<>();

    public static void main(String[] args) {

        OrderedHashMap ohm = new OrderedHashMap();
        ohm.hm.put("One", 1);
        ohm.hm.put("Two", 2);
        ohm.hm.put("Three", 3);
        ohm.hm.put("Four", 4);

        for(Map.Entry<String, Integer>mapElement : ohm.hm.entrySet()){
            String key = mapElement.getKey();
            Integer value = mapElement.getValue();

            System.out.println("Key : "+key+ " Value: "+ value) ;
        }
    }
}
