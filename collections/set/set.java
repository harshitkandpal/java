import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;
import java.util.Iterator;

public class set {
    /*
        The Set Interface in Java
        -------------------------
        - A Set is a collection that does not allow duplicate elements.
        - Unlike List, Set does not provide index-based access.
        - Order depends on implementation:
            HashSet       → No guaranteed order
            LinkedHashSet → Maintains insertion order
            TreeSet       → Maintains sorted order

        Common Methods of Set:
        ----------------------
        - add(E e)        : Adds an element if it's not already present
        - remove(Object o): Removes the element from the set
        - contains(Object o): Checks if the set contains the element
        - size()          : Returns the number of elements
        - clear()         : Removes all elements
        - isEmpty()       : Checks if the set is empty
        - iterator()      : Returns an iterator to traverse elements

        Set vs List:
        ------------
        List:
            - Allows duplicates
            - Maintains insertion order
            - Access elements by index
        Set:
            - Does not allow duplicates
            - No index-based access
            - Order depends on implementation
    */

    public static void main(String[] args) {
        // HashSet Example
        Set<String> cars = new HashSet<>();

        // add elements
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW"); // duplicate ignored

        System.out.println("HashSet: " + cars);

        // contains
        System.out.println("Contains Volvo? " + cars.contains("Volvo"));

        // size
        System.out.println("Size: " + cars.size());

        // remove
        cars.remove("BMW");
        System.out.println("After removing BMW: " + cars);

        // clear
        cars.clear();
        System.out.println("After clear: " + cars);


        /*
            TreeSet Example
            ----------------
            A TreeSet stores data in sorted order.
            HashSet vs TreeSet:
                Feature       HashSet              TreeSet
                Order         No order             Sorted (natural order)
                Duplicates    Not allowed          Not allowed
                Performance   Faster (no sorting)  Slower (due to sorting)
        */
        System.out.println("\nTreeSet Example:");
        Set<Integer> num = new TreeSet<>();

        num.add(3);
        num.add(1);
        num.add(2);

        System.out.println("TreeSet: " + num);


        /*
            LinkedHashSet Example
            ----------------------
            - Maintains insertion order.
            - Slightly slower than HashSet due to extra linked list.
        */
        System.out.println("\nLinkedHashSet Example:");
        Set<String> fruits = new LinkedHashSet<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // duplicate ignored

        System.out.println("LinkedHashSet: " + fruits);


        /*
            Iterating over a Set
            ---------------------
            Since Set has no index, we use:
            1. For-each loop
            2. Iterator
        */
        System.out.println("\nIterating over LinkedHashSet:");

        // For-each loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Iterator
        System.out.println("Using Iterator:");
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
