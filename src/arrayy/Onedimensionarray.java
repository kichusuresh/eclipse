package arrayy;
import java.util.Scanner;
public class Onedimensionarray {
	public static void main(String[] args) {
		int a[]= new int[6]; // declare array	
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your numbers");  //i=index no//to read numbers
	    for(int i=0;i<6;i++)
	    {
	    	a[i]=sc.nextInt();  //store values to array
	    }
	    System.out.println("entered no's are:");  //to print the numbers
	    for(int i=0;i<6;i++)
	    {
	    System.out.println(a[i]);
		}
	}
}
