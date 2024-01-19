package exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class ComplieTimeexception {
	public static void main(String[] args)throws FileNotFoundException, InterruptedException
		{
			FileInputStream f=new FileInputStream("E.//Book.xlsx");
			System.out.println("stareted");
			Thread.sleep(5000);
			System.out.println("stopped");

	}

	}

