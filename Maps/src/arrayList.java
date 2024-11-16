import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // Creating an arrayList to store strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Output: Apple

        // Updating an element
        fruits.set(1, "Blueberry"); // Replace Banana with Blueberry

        // Removing an element
        fruits.remove("Cherry");

        // Iterating through the ArrayList
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
