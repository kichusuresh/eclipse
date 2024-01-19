package arrayy;
import java.util.Scanner;
public class Twodimensionarrayfor13 {
	public static void main(String[] args) {
		String a[][]= new String[3][2];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter your name"); 
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    	a[i][j]=sc.next(); 
	    }
}
	    System.out.println("entered values"); 
	    for(int i=0;i<3;i++)
	    {
	    	for(int j=0;j<2;j++)
	    	{
	    	 System.out.print(a[i][j]+" ");
	    	
	    }
	    	 System.out.println();
	    }
	}
}


