//rotate the array elements left by one
import java.util.*;

class Rotate_Left_ByOne {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10}; 

        System.out.println("Array Before rotation:");
        printArray(array);

        rotateLeft(array);

        System.out.println("\nArray after rotating left by one position:");
        printArray(array);
    }

    public static void printArray(int[] arr) 
   {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void rotateLeft(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int temp = arr[0]; 
       
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }
}
