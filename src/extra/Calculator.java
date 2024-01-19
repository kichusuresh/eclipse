package extra;
public class Calculator {
	public static void main(String[] args) {
		int x=30,y=10;
		int a='+';
        switch(a)
        {
	      case '+':System.out.println("addition"+(x+y));
	               break;
	      case '-':System.out.println("substraction"+(x-y));
	               break;
	      case '*':System.out.println("multiplication"+(x*y));
	               break;
	      case '/':System.out.println("division"+(x/y));
	               break;
	      case '%':System.out.println("modulus"+(x%y));
	                break;
	    default: System.out.println("invalid data");
        }

	}

}
