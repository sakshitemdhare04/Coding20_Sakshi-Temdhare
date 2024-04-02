//write a program to find a missing number in an array
import java.util.Arrays;
public class Example9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6}; // Example array with one missing number

        int missingNumber = findMissingNumber(arr);
        
        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1; // Expected number of elements including the missing number
        int total = n * (n + 1) / 2; // Sum of first n natural numbers

        int sum = Arrays.stream(arr).sum(); // Sum of elements in the array

        return total - sum;
    }
}
