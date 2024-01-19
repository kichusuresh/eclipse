package oops;
public class Parameterconstructor {
	int Empid;
	int salary;
	String designation;
	public Parameterconstructor(int id,int sal,String desig)
	{
		Empid=id;
		salary=sal;
		designation=desig;
		
	}
	public static void main(String[] args)
	{
		Parameterconstructor obj1=new Parameterconstructor(112,30000,"developer");
		System.out.println(obj1.Empid);
		System.out.println(obj1.salary);
		System.out.println(obj1.designation);
		
	}
	
}
