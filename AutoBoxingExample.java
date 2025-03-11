import java.util.ArrayList;
import java.util.List;

public class AutoBoxingExample {
    
    // Method to parse strings into Integer objects
    public static List<Integer> parseStringToIntegerList(String[] strNumbers) {
        List<Integer> numbers = new ArrayList<>();
        for (String str : strNumbers) {
            numbers.add(Integer.parseInt(str)); // Autoboxing
        }
        return numbers;
    }

    // Method to calculate sum using unboxing
    public static int calculateSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer num : numbers) {
            sum += num; // Unboxing
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example list of numbers as strings
        String[] strNumbers = {"10", "20", "30", "40"};

        // Convert to List<Integer>
        List<Integer> numbers = parseStringToIntegerList(strNumbers);

        // Calculate and display sum
        int sum = calculateSum(numbers);
        System.out.println("Sum of numbers: " + sum);
    }
}
