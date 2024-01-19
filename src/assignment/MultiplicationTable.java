package assignment;
import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int m;
		for(int i=1;i<=10;i++)
		{
			m=i*n;
			System.out.println(i+"*"+n+"="+m);
		}

	}

}
