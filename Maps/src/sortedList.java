import java.util.ArrayList;
import java.util.Collections;

public class sortedList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(42);
        numbers.add(7);
        numbers.add(19);
        numbers.add(3);

        // Sorting in ascending order
        Collections.sort(numbers);

        System.out.println("Sorted Numbers: " + numbers);
    }
}
