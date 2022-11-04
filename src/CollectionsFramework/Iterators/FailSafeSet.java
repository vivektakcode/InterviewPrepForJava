package CollectionsFramework.Iterators;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class FailSafeSet {

    public static void main(String[] args) {
        Set<Integer> set = new CopyOnWriteArraySet<>();
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
