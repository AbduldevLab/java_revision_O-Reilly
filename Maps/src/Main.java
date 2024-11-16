import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       // System.out.println("Hello world!");
        // Creating a Map
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Accessing a value by its key
        System.out.println("Value for key 1: " + map.get(1)); // Output: Apple

        // Iterating over keys and values
        for (Map.Entry<Integer, String> i : map.entrySet()) {
            System.out.println("Key: " + i.getKey() + ", Value: " + i.getValue());
        }

    }
}