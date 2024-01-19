package assignment;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int num=sc.nextInt();
				int temp=num;
		 int rev=0;
		 while(num!=0)
		 {
			 rev=(rev*10)+num%10;
			 
			 num=num/10;
		 }
       if(temp == rev)
       {
    	   System.out.println(temp+"given the number is palindrome");
       }
       else
       {
    	   System.out.println(temp+"given the number is not  palindrome");
       }
       sc.close();
	}

}
