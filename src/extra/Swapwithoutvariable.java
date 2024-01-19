package extra;
public class Swapwithoutvariable {
	public static void main(String[] args) {
		int e=25;
		int f=23;
		System.out.println("swap without using  varible");
		System.out.println("before swap e="+e +" f="+f);
		e=e+f;//e=25+23=48
		f=e-f;//f=48-23=23
		e=e-f;//e=48-23=25
		System.out.println("after swap e="+ e +" f="+f);

	}

}
