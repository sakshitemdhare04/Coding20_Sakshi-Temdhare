//fibonnaci series of nth number
import java.util.Scanner;
class Fibonnaci
{
	public static void main(String args[])
	{

	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the Fibonnaci number : ");
	 int num = sc.nextInt();
        
     int a=0,b=1,c=0,i;
	 System.out.println("Fibonnaci series are : ");
	 for(i=1;i<=num;i++)
	 {
	 	System.out.println(c);
	 	a = b;
	 	b = c;
	 	c = a+b;
	 }

	}
}