package SpringBoot;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    public static void main(String []args){
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("banana");
        pq.add("pear");
        pq.add("mango");
        pq.add("apple");
        System.out.println(pq.poll()+" "+pq.peek()+" "+pq.poll());
    }
}

