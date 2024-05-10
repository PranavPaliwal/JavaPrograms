import java.util.HashMap;
import java.util.Map;

public class temp {
    public static void main(String[] args) {
        int number = 12313; // Example number
        
        // Step 1: Count frequency of each digit
        Map<Character, Integer> digitFrequencies = new HashMap<>();
        String numberString = String.valueOf(number);
        for (char digit : numberString.toCharArray()) {
            digitFrequencies.put(digit, digitFrequencies.getOrDefault(digit, 0) + 1);
        }
        
        // Step 2: Check if all frequencies are the same
        int firstFrequency = -1; // Initialize to an impossible value
        boolean sameFrequencies = true;
        for (int frequency : digitFrequencies.values()) {
            if (firstFrequency == -1) {
                firstFrequency = frequency;
            } else if (frequency != firstFrequency) {
                sameFrequencies = false;
                break;
            }
        }
        
        // Step 3: Output the result
        if (sameFrequencies) {
            System.out.println("All digits have the same frequencies.");
        } else {
            System.out.println("Not all digits have the same frequencies.");
        }
    }
}
