package extra;
import java.util.Scanner;
public class Withpwithoutr {
	public static void main(String[] args) {
		Withpwithoutr pr=new Withpwithoutr();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length and breadth:");
		double l=sc.nextInt();
		double b=sc.nextInt();
        pr.area(l,b);
	}
    public void area(double l,double b)
    {
    	double area=l*b;
    	System.out.println(area);

	}

}
