package extra;
public class Swapwithvariable {
	public static void main(String[] args) {
		int l=25;
		int h=23;
		System.out.println("swap using variable");
		System.out.println("before swap l="+l +" h="+h);
		int k=l;
		l=h;
		h=k;
		System.out.println("after swap l="+l +" h="+h);
	}

}
