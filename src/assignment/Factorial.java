package assignment;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int num=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number");
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			num=num*i;
		}
	System.out.println("The factorial enterd number is:"+num);

	}

}
