package CollectionsFramework.linkedlist;

import java.util.LinkedList;


//Program to find middle element of the list
public class MidElement {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Dog");
        ll.addFirst("Element1");
        ll.addLast("ElementLast");

        System.out.println(ll);
        System.out.println(ll.get(ll.size()/2));
    }

}
