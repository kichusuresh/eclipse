package exception;
public class TryCatchRe {
	public static void main(String[] args)
	{

		System.out.println("started");
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);	
		}
		catch(Exception e)
		{
			System.out.print("Arithmetic Exception:");
			System.out.println(e.getMessage());
		}
	    
		/*String s=null;
		try
		{
			System.out.println(s.length());
		}
		catch(Exception e)
		{
			System.out.print("NullPointerException: ");
			System.out.println(e.getMessage());
		}*/
		
		/*int a[]=new int[5];
		try
		{
			System.out.println(a[5]);
		}
		catch(Exception e)
		{
			System.out.print("ArrayIndexOutOfBoundException: ");
			System.out.println(e.getMessage());
		}*/
		System.out.println("stopped");

	}

}
