
import java.util.Scanner;
class string_isPalindrome
{
	int sum=0,r;
	int palindromeOrNot(int num)
	{
	    if(num!=0)
	    {
	    r=num%10;
	    sum=(sum*10)+r;
	    num/=10;	
	    palindromeOrNot(num); 
	   }
	return sum;
	}
	public static void main(String arg[])	
	{
	    int a,t,s;
	    Palin p=new string_isPalindrome();
             	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter a number :");
                   a=sc.nextInt();
	    t=a;
	    s=p.palindromeOrNot(a);
	    if(s==t)
		System.out.println("Palindrome number ");
                   else
		System.out.println("Not a Palindrome number ");
                  
	}
 
}
