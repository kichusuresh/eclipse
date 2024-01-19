package exception;
public class Finallyre {
	public static void main(String[] args) 
	{
		System.out.println("started");
		/*try
		{
			int a=10;
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}*/
		
		try
		{
			int a=10;
			System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("execption :"+ e.getMessage());
		}
		finally
		{
			System.out.println("finally");
		}
		System.out.println("stopped");

	}

}
