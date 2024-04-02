import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter a number:");
    	int num = sc.nextInt();
    	int sum = 0,r;
    	int temp = num;
    	while(num>0)
    	{
           r = num % 10;
           sum = (sum*10)+r;
           num = num/10;
    	}
    	if(temp==sum)
    	{
    		System.out.println("It is a Palindrome number ");
    	}
    	else
    	{
    		System.out.println("It is not a Palindrome number ");
    	}
    }
}