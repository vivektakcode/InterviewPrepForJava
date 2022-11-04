package CollectionsFramework;

import javax.swing.event.TreeSelectionEvent;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionsFrameworkHierarchy {
    /*
    * Iterable is the topmost interface in the hierarchy of collections framework
    *
    * Then comes the Collection
    *
    * Then comes the List and Set interfaces which have their implementation in ArrayList, LinkedList and Vector for List interface
    *
    * For Set interface we have HashSet, SortedSet and TreeSet, Linked HashSet and LinkedTreeSet
    *
    * Apart from that we have Map interface
    *
    * Map interface includes
    * */


    public static void main(String[] args) {
        String str="Manshika";
        System.out.println(str.trim());
        String newStr=str.substring(0,3);
        System.out.println(newStr);


    }

    //LIST OF THINGS
//Cares about which position each object is in
//Elements can be added in by specifying position - where should it be added in
//If element is added without specifying position - it is added at the end

/*ArrayList
*  implements RandomAccess, a marker interface, meaning it support fast -
	almost constant time - access
	 Insertion and Deletion are slower compared to LinkedList
* */

    /*
    * LinkedList
    *
    * // Elements are doubly linked - forward and backword - to one another
	// Ideal choice to implement Stack or Queue
	// Iteration is slower than ArrayList
	// Fast Insertion and Deletion
	// Implements Queue interface also. So, supports methods like peek(), poll()
	// and remove()
	* */

    /*Vector
    *Thread Safe - Synchronized Methods
    // implements RandomAccess, a marker interface, meaning it support fast -
    // almost constant time - access
    * */

/*Set Interface
*
*Unique things only - Does not allow duplication.
* If obj1.equals(obj2) then only one of them can be in the Set.
* */

    /*
    * Types of Set Interface
    *
    * HashSet/SortedSet/LinkedHashSet/TreeSet
    *
    * Main difference between Set and SortedSet is - an implementation of SortedSet interface
    * maintains its elements in a sorted order.  Set interface does not guarantee any Order.
    * */

/*
* HashSet
* // unordered, unsorted - iterates in random order
		// uses hashCode()
* */


    /*
    * LinkedHashSet
    *
    *ordered - iterates in order of insertion
    // unsorted
    // uses hashCode()
    * */

    /*TreeSet
    * // sorted - natural order
	// implements NavigableSet
    * */

    /*Queues
    *Queue interface extends Collections, so it has all the methods of Collection interface
    *Deque-- Supports insertion and deletion both at the same time
    *
    * */

    /*Map Interface
    * Contains--HashMap/SortedMap/NavigableMap
    *
    * */

    /*
    ##HashMap##
    unsorted, unordered
	key's hashCode() is used*/

    /*
    * Difference between HashMap and Concurrent HashMap
    * */

    /*HashTable
    *Synchronized - Thread Safe - version of HashMap
    // unsorted, unordered
    // key's hashCode() is used
    // HashMap allows a key with null value. Hashtable doesn't.
    * */

    /*LinkedHashMap
    *
    *
    * */

    /*TreeMap
    *
    * */
}
