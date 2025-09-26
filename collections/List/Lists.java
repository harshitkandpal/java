

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;


/*
    🔹 List in Java:
       - List is an INTERFACE → cannot be directly instantiated.
       - Common classes that implement List: ArrayList, LinkedList.
       - It represents an ordered collection of elements (index-based).
       - Duplicates are allowed.

    🔹 Important List methods:
       add(value)        → insert element at the end
       add(index, value) → insert at specific position (shifts elements right)
       get(index)        → access element
       set(index, value) → update element
       remove(index)     → delete element at index
       size()            → number of elements

    ✨ Note on Method Overloading:
       - Same method name, different parameters.
       - Example: add(value) vs add(index, value).
       - Java picks the correct one based on arguments.
*/

public class Lists {

    public static void main(String [] args){

        // ✅ Best practice: use interface type on left side
        List<Integer> num = new ArrayList<>();
        System.out.println("Using ArrayList:");

        // Just switch here if you want LinkedList
        // List<Integer> num = new LinkedList<>();
        // System.out.println("Using LinkedList:");

        /*
            Why not write:
            ArrayList<Integer> num = new ArrayList<>();

            - Because coding to the INTERFACE (List) makes it flexible.
            - You can swap ArrayList → LinkedList by changing just one line.
            - Rest of the code still works (since both implement List).
        */


        // ------------------- DEMO -------------------

        // add(value) → append to end
        num.add(1);
        num.add(2);
        num.add(3);

        // add(index, value) → insert at index
        num.add(1, 10);
        System.out.println("After insert: " + num); // [1, 10, 2, 3]

        // get(index) → access element
        System.out.println("First element: " + num.get(0)); // 1

        // set(index, value) → replace value at index
        num.set(2, 99);
        System.out.println("After set: " + num); // [1, 10, 99, 3]

        // remove(index) → delete element
        num.remove(1);
        System.out.println("After remove: " + num); // [1, 99, 3]

        // size() → total number of elements
        System.out.println("List size: " + num.size()); // 3



        /*
            🔹 Why sometimes use:
               LinkedList<Integer> nums = new LinkedList<>();

            - LinkedList implements List (so it has all List methods).
            - BUT it also implements Deque (double-ended queue).
            - That gives it extra methods not present in List:

              addFirst(), addLast()
              getFirst(), getLast()
              removeFirst(), removeLast()
        */

        LinkedList<Integer> nums = new LinkedList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        nums.addFirst(0);  // insert at beginning
        nums.addLast(4);   // insert at end

        System.out.println("After addFirst() & addLast(): " + nums); // [0, 1, 2, 3, 4]

        System.out.println("First element: " + nums.getFirst()); // 0
        System.out.println("Last element: " + nums.getLast());   // 4

        nums.removeFirst();  // remove from beginning
        nums.removeLast();   // remove from end

        System.out.println("After removeFirst() & removeLast(): " + nums); // [1, 2, 3]


        // ------------------- SORT -------------------
        List<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println("Before sort: " + cars);

        /*
            🔹 Collections.sort()
            - Collections is a utility class in Java.
            - sort(List<T>) arranges elements in their "natural order".
              For Strings → alphabetical order (lexicographical).
              For Integers → ascending order.
            - For custom rules, we can pass a Comparator.
        */
        Collections.sort(cars);

        System.out.println("After sort: " + cars);



        // ------------------- ITERATING A LIST -------------------

        /*
            Two common ways to iterate:
            
            1. For-loop with index:
               - Full control over index.
               - Can modify elements using set(index, value).
               - Useful when you care about position.

            2. Enhanced for-loop (for-each):
               - Cleaner syntax, less boilerplate.
               - Iterates directly over elements.
               - Cannot modify list structure (like add/remove).
        */

        System.out.print("Classic for-loop: ");
        for (int i = 0; i < cars.size(); i++) {
            System.out.print(cars.get(i) + " ");
        }
        System.out.println();

        System.out.print("Enhanced for-loop: ");
        for (String car : cars) {
            System.out.print(car + " ");
        }
        System.out.println();



        /*
            🔹 Question: If we modify 'car' inside the for-each loop,
               will it update the item in the list?

            Answer:
              - For objects (like String, Integer), the loop variable 
                is just a COPY of the reference.
              - If you reassign it (car = "Tesla"), the list does NOT change.
              - But if the object itself is mutable (e.g., StringBuilder),
                then changing its state WOULD reflect in the list.

            Example with String (immutable):
              for (String car : cars) {
                  car = "Tesla";   // does NOT change list
              }

            Example with StringBuilder (mutable):
              for (StringBuilder sb : list) {
                  sb.append("X");  // DOES change content in list
              }
        */
    }
}
