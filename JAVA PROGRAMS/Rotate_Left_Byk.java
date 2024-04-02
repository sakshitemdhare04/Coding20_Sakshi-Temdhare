//rotate the array elements by kth position
import java.util.*;
class Rotate_Left_Byk {
    public static void main(String[] args) {
        int[] array = {35,40, 50, 10, 20,30};
        int k = 3; 

        System.out.println("Array:");
        printArray(array);

        rotateLeft(array, k);

        System.out.println("\nArray after rotating left by " + k + " positions:");
        printArray(array);
    }

    public static void rotateLeft(int[] arr, int k)
   {
        if (arr == null || arr.length <= 1) {
            return; 
        }

   
        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

   public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
