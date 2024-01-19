package extra;
import java.util.Scanner;
public class Wthoutpr {
	public static void main(String[] args) {
		Wthoutpr pr=new Wthoutpr();
		pr.area();
	}
    public void area()
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter a breadth and height:");
		double b=sc.nextInt();
		double h=sc.nextInt();
    	double area=0.5*b*h;
    	System.out.println(area);

	}

}
