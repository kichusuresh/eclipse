package extra;
import java.util.Scanner;
public class Withoutpwithr {
	public static void main(String[] args) {
		Withoutpwithr pr=new Withoutpwithr();
		System.out.println(pr.area());
	}
    public double area()
    {
    	Scanner sc=new Scanner(System.in);
		System.out.println("enter length :");
		double a=sc.nextInt();
		double area=a*a;
		return area;

	}

}
