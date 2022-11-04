package CollectionsFramework.Iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FailFastSet {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            set.add(3);
        }


    }
}
