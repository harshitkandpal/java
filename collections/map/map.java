import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class map {

    /*
        The Map Interface in Java
        -------------------------
        - A Map stores data in key-value pairs.
        - Keys must be unique, but values can be duplicated.
        - Each key maps to at most one value.
        - Common Implementations:
            1. HashMap       → Fast, no guaranteed order
            2. LinkedHashMap → Maintains insertion order
            3. TreeMap       → Stores keys in sorted order (natural order or custom Comparator)

        Common Methods of Map:
        -----------------------
        - put(K key, V value)       : Adds or updates a key-value pair
        - get(Object key)           : Returns the value for a given key
        - remove(Object key)        : Removes the key and its value
        - containsKey(Object key)   : Checks if the map contains the given key
        - containsValue(Object val) : Checks if the map contains the given value
        - keySet()                  : Returns a Set of all keys
        - values()                  : Returns a Collection of all values
        - entrySet()                : Returns a Set of all key-value pairs (Map.Entry<K,V>)
        - size()                    : Returns the number of key-value pairs
        - clear()                   : Removes all mappings

        Map vs. Set vs. List
        ---------------------
        Feature               List       Set            Map
        ----------------------------------------------------------
        Duplicates allowed?   Yes        No             Keys: No, Values: Yes
        Stores key-value?     No         No             Yes
        Maintains order?      Yes        No (depends)   Depends:
                                                        HashMap       → No order
                                                        LinkedHashMap → Insertion order
                                                        TreeMap       → Sorted order
    */

    public static void main(String[] args) {

        /*
            HashMap Example
            ----------------
            - Does not guarantee any order of keys.
            - Allows one null key and multiple null values.
            - Fast (constant-time for get/put in average case).
        */
        System.out.println("HashMap Example:");
        Map<String, String> capitalCity = new HashMap<>();

        capitalCity.put("Germany", "Berlin");
        capitalCity.put("France", "Paris");
        capitalCity.put("Italy", "Rome");
        capitalCity.put("United States", "Washington DC");

        // get
        System.out.println("Capital of Germany: " + capitalCity.get("Germany"));

        // remove
        capitalCity.remove("France");
        System.out.println("After removing France: " + capitalCity);

        // contains
        System.out.println("Contains Germany? " + capitalCity.containsKey("Germany"));

        // keySet
        System.out.println("Keys: " + capitalCity.keySet());

        // values
        System.out.println("Values: " + capitalCity.values());

        // entrySet
        System.out.println("Entries: " + capitalCity.entrySet());


        /*
            LinkedHashMap Example
            ----------------------
            - Maintains insertion order.
            - Slightly slower than HashMap due to ordering.
            - Allows one null key and multiple null values.
        */
        System.out.println("\nLinkedHashMap Example:");
        Map<String, String> linkedMap = new LinkedHashMap<>();

        linkedMap.put("Germany", "Berlin");
        linkedMap.put("France", "Paris");
        linkedMap.put("Italy", "Rome");
        linkedMap.put("United States", "Washington DC");

        System.out.println("LinkedHashMap (insertion order preserved): " + linkedMap);


        /*
            TreeMap Example
            ----------------
            - Stores keys in sorted (natural or custom) order.
            - Does NOT allow null keys (throws NullPointerException).
            - Slower than HashMap (O(log n) for operations).
        */
        System.out.println("\nTreeMap Example:");
        Map<String, String> treeMap = new TreeMap<>();

        treeMap.put("Germany", "Berlin");
        treeMap.put("France", "Paris");
        treeMap.put("Italy", "Rome");
        treeMap.put("United States", "Washington DC");

        System.out.println("TreeMap (sorted order by key): " + treeMap);
    }
}
