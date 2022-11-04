package CollectionsFramework.Iterators;

import java.util.*;

public class FailFastMap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Maverick");
        map.put(2, "Mumbai");
        map.put(2, "Allow");
        Iterator itr=map.keySet().iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+" : "+map.get(itr.next()));
            map.put(3, "Yes it's Fail-Fast");
        }


    }
}
