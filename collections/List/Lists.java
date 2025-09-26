import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


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
    }
}
