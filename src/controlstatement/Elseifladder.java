package controlstatement;
public class Elseifladder {
	public static void main(String[] args) 
	{
		int age=21;
		if(age>1 && age<18)
		{
			System.out.println("minor");
		}
		else if(age>=18 && age<60)
		{
			System.out.println("major");
		}
		else if(age>=60)
		{
			System.out.println("retired");
		}
		else
		{
			System.out.println("invalid data");
		}

	}

}
