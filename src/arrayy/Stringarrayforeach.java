package arrayy;
import java.util.Scanner;
public class Stringarrayforeach {
	public static void main(String[] args) {
		String arr[]= new String[4]; // declare array	
	    Scanner SC=new Scanner(System.in);
	    System.out.println("enter your names"); 
	    for(int i=0;i<4;i++)
	    {
	    	arr[i]=SC.next();  //store values to array//
	    	
	    }
	    System.out.println("entered names's are:");
	    for(String S:arr)    // for(datatype tempvarname:arrayname)//
	    {
	    System.out.println(S);
		}

	}

}
