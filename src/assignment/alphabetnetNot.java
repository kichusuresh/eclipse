package assignment;
import java.util.Scanner;
public class alphabetnetNot {
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("enter a character");
		char ch=sc.next().charAt(0);
		if((ch>='a'&&ch<='z') || (ch>='A'&&ch<='Z'))
		{
			System.out.println("alphabet");
		}
		else
		{
			System.out.println("not a alphabet");
		}

	}

}
