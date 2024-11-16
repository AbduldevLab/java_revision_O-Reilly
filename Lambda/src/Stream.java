import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry", "Date", "Kiwi", "Orange","Apricot");

        // Filter fruits that start with 'A' and convert to uppercase
        List<String> filteredFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A")) // Intermediate operation
                .map(String::toUpperCase)              // Intermediate operation
                .collect(Collectors.toList());         // Terminal operation

        System.out.println(filteredFruits); // Output: [APPLE]
    }
}
