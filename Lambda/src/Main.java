import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
       //System.out.println("Hello world!");
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Kiwi");

        // Sorting using a lambda expression
        Collections.sort(fruits, (s1, s2) -> s1.length() - s2.length());

        System.out.println("Words sorted by length: " + fruits);
    }
}