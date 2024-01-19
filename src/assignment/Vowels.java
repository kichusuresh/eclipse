package assignment;
import java.util.Scanner;
public class Vowels {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string:");
		String s=sc.nextLine();
		int v=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i'|| s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U'|| s.charAt(i)=='A')
			{
				v++;
			}
		}
		System.out.println(v);

	}

}
