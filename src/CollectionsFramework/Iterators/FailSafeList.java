package CollectionsFramework.Iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeList {

    public static void main(String[] args) {
        List<Integer> list= new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);


        //Throws concurrent Modification Exception
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            list.add(3);
        }

    }
}
