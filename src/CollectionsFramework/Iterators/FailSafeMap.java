package CollectionsFramework.Iterators;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeMap {
    public static void main(String[] args) {

        try {
            Map<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "Maverick");

        //Duplicates are allowed for the key but the latest duplicate will get the value
        map.put(null, "Mumbai");
        map.put(2, "Allow");

        Iterator itr = map.keySet().iterator();
        while (itr.hasNext()) {
            Integer key = (Integer) itr.next();
            System.out.println(key + " : " + map.get(key));
            map.put(3, "Yes it's Fail-Fast");
        }
    }catch(Exception e){
            System.out.println("Exception catched "+ e);
        }

    }
}
