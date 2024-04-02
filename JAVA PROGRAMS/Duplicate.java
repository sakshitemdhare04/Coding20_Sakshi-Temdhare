import java.util.*;

class Duplicate
{
       public static void main(String[] args)
	{
		int a[] = {5,2,6,8,6,7,5,2,8};
               System.out.println("Original Array:");
               printArray(a);

             System.out.println("\nArray after removing duplicates:");
             removeDuplicates(a);
		
	}
        public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");}
        }

	public static void removeDuplicates(int[] a)
	{
		HashSet<Integer> set= new HashSet<Integer>();

		for (int i = 0; i < a.length; i++)
			set.add(a[i]);

		System.out.print(set);
	}
	
}
