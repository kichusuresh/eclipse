package extra;
import java.util.Scanner;
public class Withpr {
	public static void main(String[] args) {
		Withpr pr=new Withpr();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter radius:");
		double r=sc.nextInt();
		System.out.println(pr.area(r));
	}
	public double area(double r)
	{
		double pi=3.14;
		double area=pi*r*r;
		return area;

	}

}
