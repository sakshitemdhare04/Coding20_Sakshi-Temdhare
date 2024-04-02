//Java program of reverse of the number
import java.util.Scanner;
class Reverse
{
	public static void main(String args[])
	{
		int a,b,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
        a = sc.nextInt();

        while(a>0)
        {
        	b = a % 10;
        	sum = sum * 10 + b;
        	a = a/10;
        }
        System.out.println("Reverse of a number is : "+sum);
	}
}